package Testes;

import javax.persistence.*;
import Model.Conta;
import Util.ContaDAO;
import Util.ManagerUtil;

public class ContaTeste {
	public static void main(String[] args) {
		Conta c = new Conta();
		EntityManager em = new ManagerUtil().getEntityManager();
		ContaDAO daoC = new ContaDAO(em);

		em.getTransaction().begin();
		//find an object by passing as parameters a class and its reference nor an argument//
		c = em.find(Conta.class, 2);
		daoC.erase(c);
		em.getTransaction().commit();
		em.close();
	}
}
