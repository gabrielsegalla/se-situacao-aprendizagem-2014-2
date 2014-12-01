package br.senai.sc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.entity.Evento;
import br.senai.sc.utils.JpaUtils;

public class EventoDao {

	private EntityManager entityManager;

	public EventoDao() {
		JpaUtils.getInstance().createEntityManagerFactory();
		entityManager = JpaUtils.getInstance().getEntityManager();
	}

	public Evento salvar(Evento evento) {
		entityManager.getTransaction().begin();
		try {
			if (evento.getId() == null) {
				entityManager.persist(evento);
			} else {
				entityManager.merge(evento);
			}
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			Logger.getLogger(EventoDao.class.getName()).log(Level.SEVERE, null,
					e);
		}
		entityManager.close();
		return evento;

	}

	public void remover(int id) {
		try {
			entityManager.getTransaction().begin();
			Evento evento = entityManager.getReference(Evento.class, id);
			entityManager.remove(evento);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			Logger.getLogger(EventoDao.class.getName()).log(Level.SEVERE, null,
					e);
		}
		 entityManager.close();
	}

	public List<Evento> listar() {
		 Query query = entityManager.createQuery("From Evento", Evento.class);
		return query.getResultList();
	}

	public Evento buscarPorId(int id) {
		return entityManager.find(Evento.class, id);
	}

	public List<Evento> buscarPorNome(String nome) {
		Query query = entityManager.createQuery(
				"From Evento u where u.nome LIKE :nome", Evento.class);
		query.setParameter("nome", nome);
		return query.getResultList();
	}
	public List<Evento> findAll(){
		EntityManager em = getEntityManager();
		List <Evento> eventos;
		try{
		Query q = em.createNamedQuery("Evento.findAll");
		eventos = q.getResultList();
		}catch (Exception e) {
		eventos = new ArrayList();
		}finally{
		em.close();
		}
		return eventos;
		}

	private EntityManager getEntityManager() {
		
		return entityManager;
	}
		
}
