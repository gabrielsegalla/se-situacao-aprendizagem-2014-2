package br.senai.sc.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the ranking database table.
 * 
 */
@Entity
@Table(name="ranking")
@NamedQuery(name="Ranking.findAll", query="SELECT r FROM Ranking r")
public class Ranking implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Evento idEvento;
	private Usuario idUsuario;
	
	public Ranking() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario", nullable=false)
	public Usuario getUsuario() {
		return this.idUsuario;
	}

	public void setUsuario(Usuario usuario) {
		this.idUsuario = usuario;
	}


	//bi-directional many-to-one association to Evento
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="idEvento", nullable=false)
	public Evento getEvento() {
		return this.idEvento;
	}

	public void setEvento(Evento evento) {
		this.idEvento = evento;
	}

}