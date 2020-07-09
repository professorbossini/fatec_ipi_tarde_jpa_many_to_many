package br.com.bossini;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.bossini.model.beans.Conteudo;
import br.com.bossini.model.beans.Perfil;
import br.com.bossini.model.beans.Usuario;
import br.com.bossini.model.repository.JPAUtil;

public class TesteInsereManyToMany {

	public static void main(String[] args) {
		/*EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		List <Conteudo> conteudos = new ArrayList <> ();
		Conteudo c1 = new Conteudo ();
		c1.setDescricao("Conteúdo 1");
		c1.setTipo("Tipo 1");
		Conteudo c2 = new Conteudo ();
		c2.setDescricao("Conteudo 2");
		c2.setTipo("Tipo 2");
		conteudos.add(c1);
		conteudos.add(c2);
		Usuario u = new Usuario ();
		Perfil perfil = new Perfil();
		perfil.setDescricao("Perfil do João");
		perfil.setUsuario(u);
		u.setNome("João");
		u.setFone("11223344");
		u.setEmail("joao@email.com");
		u.setPerfil(perfil);
		u.setConteudos(conteudos);
		List <Usuario> usuarios = new ArrayList <> ();
		usuarios.add(u);
		c1.setUsuarios(usuarios);
		c2.setUsuarios(usuarios);
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();*/
	}

}

















