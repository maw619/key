package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.dao.WdbDAO;
import com.test.entity.Wdb;
import com.test.service.WdbService;


@Controller
@RequestMapping("/keys")
public class wdbController {
	
	
	//inject WdbService
	@Autowired
	private WdbService wdbService;
	
	
	
	
	@ModelAttribute("beetle")
	public Wdb construct(){
		return new Wdb();
	}

	
	@RequestMapping("/list")
	public String show(Model model){
		List<Wdb>theKeys = wdbService.getKeys();
		
		model.addAttribute("list",theKeys);
		
		return "list-wdb";
	}
	
	@GetMapping("/showFormForAdd")
	public String showForAdd(Model model){
		
		Wdb key = new Wdb();
		
		model.addAttribute("key",key);
		
		return "add-form";
	}

	
	
	@RequestMapping("/saveRecord")
	public String saveRecord(@ModelAttribute("beetle") Wdb key){   //<<====do this when fetching info from user form!!
		
		wdbService.saveRecord(key);

		return "redirect:/keys/list";
	}
	
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("userkey") int theid, 
									Model model){
		
		//get record from service
		Wdb wdb = wdbService.getKey(theid);
		
		//set customer as a model attrinbute to pre-populate the form
		model.addAttribute("beetle",wdb);
		
		//send over to our form
		
		return "add-form";
	}
	
	@RequestMapping("/delete")
	public String deleteRecord(@RequestParam("userkey") int theid){
		
		//delete the record
		wdbService.deleteRecord(theid);
		
		return "redirect:/keys/list";
		
	}
	
	
	
	
	
	
}
