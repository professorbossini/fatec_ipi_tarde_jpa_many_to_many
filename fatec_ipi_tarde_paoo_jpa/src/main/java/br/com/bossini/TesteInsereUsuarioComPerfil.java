package br.com.bossini;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.bossini.model.beans.Perfil;
import br.com.bossini.model.beans.Usuario;
import br.com.bossini.model.repository.JPAUtil;

public class TesteInsereUsuarioComPerfil {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Perfil p = new Perfil ();
		p.setDescricao("Perfil do José");
		manager.persist(p);
		Usuario u = new Usuario ();
		u.setNome("José");
		u.setFone("11223344");
		u.setEmail("jose@email.com");
		u.setPerfil(p);
		manager.persist(u);
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
	}

}
