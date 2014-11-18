package br.senai.sc.utils;

import br.senai.sc.dao.UsuarioDao;
import br.senai.sc.entity.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setCpf("000.000.500-00");
		usuario.setNome("dhjsadsg");
		usuario.setTpUsuario("Aluno");
		usuario.setLogin("loggin");
		usuario.setSenha("senfha");
		
		UsuarioDao dao = new UsuarioDao();
		dao.salvar(usuario);
	}

}
