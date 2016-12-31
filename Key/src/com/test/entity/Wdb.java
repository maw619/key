package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="clave2")
public class Wdb {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cl_key")
	private int key;
	
	@Column(name="cl_fk_user_key")
	private int fkuserkey;
	
	@Column(name="cl_url")
	private String clurl;
	
	@Column(name="cl_username")
	private String lusername;
	
	@Column(name="cl_pass1")
	private String pass1;
	
	@Column(name="cl_pass2")
	private String pass2;
	
	@Column(name="cl_cat")
	private int cat;
	
	@Column(name="cl_llave")
	private String llave;
	
	@Column(name="cl_remarks")
	private String remarks;
	
	
	public Wdb(){
		
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public int getFkuserkey() {
		return fkuserkey;
	}


	public void setFkuserkey(int fkuserkey) {
		this.fkuserkey = fkuserkey;
	}


	public String getClurl() {
		return clurl;
	}


	public void setClurl(String clurl) {
		this.clurl = clurl;
	}


	public String getLusername() {
		return lusername;
	}


	public void setLusername(String lusername) {
		this.lusername = lusername;
	}


	public String getPass1() {
		return pass1;
	}


	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}


	public String getPass2() {
		return pass2;
	}


	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}


	public int getCat() {
		return cat;
	}


	public void setCat(int cat) {
		this.cat = cat;
	}


	public String getLlave() {
		return llave;
	}


	public void setLlave(String llave) {
		this.llave = llave;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	@Override
	public String toString() {
		return "Wdb [key=" + key + ", fkuserkey=" + fkuserkey + ", clurl=" + clurl + ", lusername=" + lusername
				+ ", pass1=" + pass1 + ", pass2=" + pass2 + ", cat=" + cat + ", llave=" + llave + ", remarks=" + remarks
				+ "]";
	}







	
	


	
	
	
}







