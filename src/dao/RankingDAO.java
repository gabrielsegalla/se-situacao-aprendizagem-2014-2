package dao;

import modelo.RankingModelo;


public interface RankingDAO extends DAO<RankingModelo> {
	
	RankingModelo buscarRankingPorNome(String nome);
	
}
