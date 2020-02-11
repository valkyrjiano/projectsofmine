package Util;

import javax.persistence.*;

public class ManagerUtil {
	private static EntityManagerFactory em = Persistence.createEntityManagerFactory("controlefinancas");
	public EntityManager getEntityManager() {
		return em.createEntityManager();
	}
}
