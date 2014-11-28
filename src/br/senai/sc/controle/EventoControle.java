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
	 * Esse metodo valida os campos(V� se eles estao vazios) e salva ou altera o
	 * agendamento
	 * */

	public void salvar(Evento evento) throws Exception {

		if (evento.getNome() == null || evento.getNome().trim().isEmpty()) {
			throw new Exception("N�o foi informado o nome do evento!");
		}
		if (evento.getData() == null) {
			throw new Exception("A data do Evento � obrigat�ria!");
		}
		if (evento.getHorario() == null || evento.getHorario().trim().isEmpty()|| evento.getHorario() == "Selecione") {
			throw new Exception("A data de fim do Evento � obrigat�ria!");
		}
		Integer ponto = evento.getPonto();
		if (ponto == null || ponto < 0) {
			throw new Exception("Os pontos s�o obrigat�rios");
		}
		if (evento.getData() == null) {
			throw new Exception("A data  � obrigat�ria!");
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
