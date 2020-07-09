package br.com.bossini;

import javax.persistence.EntityManager;

import br.com.bossini.model.beans.Perfil;
import br.com.bossini.model.repository.JPAUtil;

public class TesteBuscaPerfilComUsuarioAssociado {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Perfil perfil = manager.find(Perfil.class, 1L);
		System.out.println(perfil.getUsuario().getNome());
		manager.close();
		JPAUtil.close();
	}

}
