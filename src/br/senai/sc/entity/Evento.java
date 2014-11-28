package br.senai.sc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the evento database table.
 * 
 */
@Entity
@Table(name="evento")
@NamedQuery(name="Evento.findAll", query="SELECT e FROM Evento e")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Date data;
	private String horario;
	private String nome;
	private int ponto;
	private List<Ranking> rankings;

	public Evento() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	@Column(nullable=false, length=200)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Column(nullable=false)
	public int getPonto() {
		return this.ponto;
	}

	public void setPonto(int ponto) {
		this.ponto = ponto;
	}


	//bi-directional many-to-one association to Ranking
	@OneToMany(mappedBy="evento", fetch=FetchType.EAGER)
	public List<Ranking> getRankings() {
		return this.rankings;
	}

	public void setRankings(List<Ranking> rankings) {
		this.rankings = rankings;
	}

	public Ranking addRanking(Ranking ranking) {
		getRankings().add(ranking);
		ranking.setEvento(this);

		return ranking;
	}

	public Ranking removeRanking(Ranking ranking) {
		getRankings().remove(ranking);
		ranking.setEvento(null);

		return ranking;
	}

}