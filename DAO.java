package Util;

import javax.persistence.EntityManager;

public class DAO<T> {
	private final EntityManager em;
	private final Class<T> classe;
	public DAO(EntityManager em, Class<T> classe) {
		this.em = em;
		this.classe = classe;
		
	}

	public void add(T t) {
		this.em.persist(t);
	}
	
	public void erase(T t) {
		this.em.remove(t);
	}
	
	public T searchId(Integer id) {
		return this.em.getReference(classe, id);
	}
	
}
