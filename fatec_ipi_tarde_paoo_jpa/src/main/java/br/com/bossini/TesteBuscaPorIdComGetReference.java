package br.com.bossini;

import javax.persistence.EntityManager;

import br.com.bossini.model.beans.Usuario;
import br.com.bossini.model.repository.JPAUtil;

public class TesteBuscaPorIdComGetReference {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		//lazy
		Usuario u = manager.getReference(Usuario.class, 1L);
		
		System.out.println(u);
		
		manager.close();
		JPAUtil.close();
	}

}
