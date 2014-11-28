package br.senai.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name = "usuario")
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String cpf;
	private String login;
	private String nome;
	private String senha;
	private String tpUsuario;
	private Integer pontosu;
	private Date dataNasc;
	private List<Ranking> rankings;

	public Usuario() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(unique = true, nullable = false, length = 14)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(length = 45)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(nullable = false, length = 45)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontosu() {
		return pontosu;
	}

	public void setPontosu(Integer pontosu) {
		this.pontosu = pontosu;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length = 45)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Column(nullable = false, length = 45)
	public String getTpUsuario() {
		return this.tpUsuario;
	}

	public void setTpUsuario(String tpUsuario) {
		this.tpUsuario = tpUsuario;
	}

	// bi-directional many-to-one association to Ranking
	@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
	public List<Ranking> getRankings() {
		return this.rankings;
	}

	public void setRankings(List<Ranking> rankings) {
		this.rankings = rankings;
	}

	public Ranking addRanking(Ranking ranking) {
		getRankings().add(ranking);
		ranking.setUsuario(this);

		return ranking;
	}

	public Ranking removeRanking(Ranking ranking) {
		getRankings().remove(ranking);
		ranking.setUsuario(null);

		return ranking;
	}

	public void login(String login, int senha) {

	}
}