package br.senai.sc.controle;

import java.util.List;

import br.senai.sc.dao.EventoDao;
import br.senai.sc.entity.Evento;

/**
 * @author gabriel segalla
 * 
 */

public class EventoControle {

	Evento evento;
	EventoDao eventoDao;

	public EventoControle() {
		if (eventoDao == null) {
			eventoDao = new EventoDao();
		}
	}

	/**
	 * Esse metodo valida os campos(Vê se eles estao vazios) e salva ou altera o
	 * agendamento
	 * */

	public void salvar(Evento evento) throws Exception {

		if (evento.getNome() == null || evento.getNome().trim().isEmpty()) {
			throw new Exception("Não foi informado o nome do evento!");
		}
		if (evento.getData() == null) {
			throw new Exception("A data do Evento é obrigatória!");
		}
		if (evento.getHorario() == null || evento.getHorario().trim().isEmpty()|| evento.getHorario() == "Selecione") {
			throw new Exception("A data de fim do Evento é obrigatória!");
		}
		Integer ponto = evento.getPonto();
		if (ponto == null || ponto < 0) {
			throw new Exception("Os pontos são obrigatórios");
		}
		if (evento.getData() == null) {
			throw new Exception("A data  é obrigatória!");
	}}

	public void remover(int id) {
		eventoDao.remover(id);
	}

	public List<Evento> listar() {
		return eventoDao.listar();
	}

	public Evento buscarPorId(int id) {
		return eventoDao.buscarPorId(id);
	}

	public List<Evento> buscarPorNome(String nome) {
		return eventoDao.buscarPorNome(nome);
	}

}
