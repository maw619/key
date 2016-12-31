package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.WdbDAO;
import com.test.entity.Wdb;


@Service
public class WdbServiceimpl implements WdbService{

	@Autowired
	private WdbDAO wdbDAO;
	
	@Override
	@Transactional
	public List<Wdb> getKeys() {
		
		return wdbDAO.getKeys();
	}

	@Override
	@Transactional
	public void saveRecord(Wdb wdb) {
		
		wdbDAO.savRecord(wdb);
	}

	@Override
	@Transactional
	public Wdb getKey(int theid) {
		
		
		
		return wdbDAO.getKey(theid);
	}

	@Override
	@Transactional
	public void deleteRecord(int theid) {
		
		wdbDAO.deleteRecord(theid);
		
	}


	

}
