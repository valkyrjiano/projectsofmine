package Util;

import javax.persistence.EntityManager;

import Model.Conta;

public class ContaDAO {
	private final DAO<Conta> dao;
	
	
	public ContaDAO(EntityManager em) {
		dao = new DAO<Conta>(em, Conta.class);
	}


	public void add(Conta t) {
		dao.add(t);
	}


	public void erase(Conta t) {
		dao.erase(t);
	}


	public boolean equals(Object obj) {
		return dao.equals(obj);
	}


	public Conta searchId(Integer id) {
		return dao.searchId(id);
	}
	
	
}
