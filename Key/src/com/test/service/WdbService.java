package com.test.service;

import java.util.List;

import com.test.entity.Wdb;

public interface WdbService {

	public List<Wdb>getKeys();

	public void saveRecord(Wdb wdb);

	public Wdb getKey(int theid);

	public void deleteRecord(int theid);
	
	
}
