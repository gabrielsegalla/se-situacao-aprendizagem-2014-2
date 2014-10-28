package dao;

import Modelo.RankingModelo;


public interface RankingDAO extends DAO<RankingModelo> {
	
	RankingModelo buscarRankingPorNome(String nome);
	
}
