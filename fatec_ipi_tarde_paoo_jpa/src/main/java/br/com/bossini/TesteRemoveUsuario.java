package br.com.bossini;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.bossini.model.beans.Usuario;
import br.com.bossini.model.repository.JPAUtil;

public class TesteRemoveUsuario {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Usuario u = manager.find(Usuario.class, 1L);
		manager.remove(u);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
