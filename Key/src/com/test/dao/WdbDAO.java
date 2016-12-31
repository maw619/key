package com.test.dao;

import java.util.List;

import com.test.entity.Wdb;

public interface WdbDAO {
	
	public List<Wdb>getKeys();

	public void savRecord(Wdb wdb);

	public Wdb getKey(int theid);

	public void deleteRecord(int theid);
}
