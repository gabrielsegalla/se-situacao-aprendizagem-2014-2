package br.senai.sc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.entity.Evento;
import br.senai.sc.entity.Ranking;
import br.senai.sc.utils.JpaUtils;

public class RankingDao {
	
	private EntityManager entityManager;
	
	public RankingDao() {
		JpaUtils.getInstance().createEntityManagerFactory();
		entityManager = JpaUtils.getInstance().getEntityManager();
	}
	
	public Ranking buscarPorId(int id) {
		return entityManager.find(Ranking.class, id);
	}
	
	public List<Ranking> buscarPorNome(String nome) {
		Query query = entityManager.createQuery(
				"From Ranking u where u.nome LIKE :nome", Ranking.class);
		query.setParameter("nome", nome);
		 return query.getResultList();
	}

}
