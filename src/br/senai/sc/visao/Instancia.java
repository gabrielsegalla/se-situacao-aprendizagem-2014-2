package br.senai.sc.visao;

public class Instancia {
	private static Pperfil perfil;
	
	public Pperfil getInstancia(){
		if(perfil==null){
			perfil = new Pperfil();
		}
		return perfil;
	}
	
}
