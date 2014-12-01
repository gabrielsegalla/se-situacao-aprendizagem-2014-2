package br.senai.sc.utils;

import java.util.List;

import br.senai.sc.dao.EventoDao;
import br.senai.sc.entity.Evento;

public class TesteQuey {

	public static void main(String[] args) {
		EventoDao dao  = new EventoDao();
		List<Evento> eventos = dao.findAll();
		for (Evento e : eventos) {
		System.out.println(e.getNome() + "Horario:" + e.getHorario() );


	}

	}}
