package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.entity.Wdb;


@Repository
public class WdbDAOimpl implements WdbDAO {

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Wdb> getKeys() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Wdb>getQuery = currentSession.createQuery("from Wdb order by cl_username", Wdb.class);
		
	
		List<Wdb>keys = getQuery.getResultList();
		
		return keys;
	}


	@Override
	public void savRecord(Wdb wdb) {
		//get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save/update the record
		currentSession.saveOrUpdate(wdb);
		
		
	}


	@Override
	public Wdb getKey(int theid) {
		
		//get the current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from the database using the primary key
		Wdb wdb = currentSession.get(Wdb.class, theid);
		
		return wdb;
	}


	@Override
	public void deleteRecord(int theid) {

		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Wdb where cl_key=:keyid");
		
		theQuery.setParameter( "keyid", theid);
		
		theQuery.executeUpdate();
	}
	
	

}
