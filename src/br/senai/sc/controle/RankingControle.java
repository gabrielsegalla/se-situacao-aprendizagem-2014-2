/**
 * 
 */
package br.senai.sc.controle;

import java.util.List;

import br.senai.sc.dao.RankingDao;
import br.senai.sc.entity.Ranking;

/**
 * @author Gabriel Segalla
 * 
 */
public class RankingControle {

	Ranking ranking;
	RankingDao rankingdao;

	public RankingControle() {

	}

	public Ranking buscarPorId(int id) {
		return rankingdao.buscarPorId(id);
	}

	public List<Ranking> buscarPorNome(String nome) {
		return rankingdao.buscarPorNome(nome);
	}
}