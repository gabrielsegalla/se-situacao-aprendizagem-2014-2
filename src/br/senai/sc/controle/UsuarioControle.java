package br.senai.sc.controle;

import java.util.List;

import br.senai.sc.dao.UsuarioDao;
import br.senai.sc.entity.Usuario;

/**
 * @author Gabriel Segalla
 * 
 */

public class UsuarioControle {
	Usuario usuario;
	UsuarioDao usuarioDao;

	public UsuarioControle() {
		if (usuarioDao == null) {
			usuarioDao = new UsuarioDao();
		}
	}

	public void salvar(Usuario usuario) throws Exception {

		if (usuario.getNome() == null || usuario.getNome().trim().isEmpty()) {
			throw new Exception("O Nome é obrigatório!");
		}
		if (usuario.getCpf() == null || usuario.getCpf().trim().isEmpty()) {
			throw new Exception("O CPF é obrigatório!");
		}
		if (usuario.getLogin() == null || usuario.getLogin().trim().isEmpty()) {
			throw new Exception("O Login é obrigatório!");
		}
		if (usuario.getSenha() == null || usuario.getSenha().trim().isEmpty()) {
			throw new Exception("A Senha é obrigatória!");
		}
		if (usuario.getTpUsuario() == null || usuario.getTpUsuario().trim().isEmpty()) {
			throw new Exception("Tipo de Usuario é obrigatório!");
		}
		
		
	}

	public void remover(int id) {
		usuarioDao.remover(id);
	}

	public List<Usuario> buscarPorNome(String nome) {
		return usuarioDao.buscarPorNome(nome);
	}

	public Usuario buscarPorId(int id) {
		return usuarioDao.buscarPorId(id);
	}
	
	
}
