package Model;

import javax.persistence.EntityManager;

import Util.DAO;

public class MovimentacaoDAO {
	private final DAO<Movimentacao> dao;	
	
	public MovimentacaoDAO(EntityManager em) {
		dao = new DAO<Movimentacao>(em, Movimentacao.class);
	}

	public void add(Movimentacao t) {
		dao.add(t);
	}

	public void erase(Movimentacao t) {
		dao.erase(t);
	}

	public Movimentacao searchId(Integer id) {
		return dao.searchId(id);
	}
	
}
