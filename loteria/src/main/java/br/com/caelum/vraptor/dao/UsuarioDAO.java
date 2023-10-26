package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Usuario;

@RequestScoped //a cada nova requisicao o framework cria um novo usuarioDAO
public class UsuarioDAO extends DAO<Usuario>{

	@Inject
	public UsuarioDAO(EntityManager em) {
		super(em, Usuario.class);
	}
	
	public UsuarioDAO() {
		this(null);
	}
}
