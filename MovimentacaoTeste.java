package Testes;

import java.util.Calendar;

import javax.persistence.EntityManager;

import Model.Conta;
import Model.Movimentacao;
import Model.TipoMovimentacao;
import Util.ContaDAO;
import Util.ManagerUtil;

public class MovimentacaoTeste {

	public static void main(String[] args) {
		Conta c = new Conta();
		EntityManager em = new ManagerUtil().getEntityManager();
		ContaDAO dao = new ContaDAO(em);
		
		c.setBanco("Bradesco");
		c.setNome("João");
		c.setSaldo("1200");
		
		em.getTransaction().begin();
		dao.add(c);
		
		Movimentacao mov = new Movimentacao();
		mov.setDescricao("Conta de Luz");
		mov.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		mov.setData(Calendar.getInstance());
		mov.setConta(c);
		
		em.persist(mov);
		em.getTransaction().commit();
		em.close();
	}
}
