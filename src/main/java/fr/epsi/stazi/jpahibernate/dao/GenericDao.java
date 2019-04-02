package fr.epsi.stazi.jpahibernate.dao;

import javax.persistence.EntityManager;

import fr.epsi.stazi.jpahibernate.dao.helper.DatabaseHelper;

public class GenericDao {
	
	protected EntityManager entityManager;
	
	public GenericDao() {
		this.entityManager = DatabaseHelper.createEntityManager();
	}
}
