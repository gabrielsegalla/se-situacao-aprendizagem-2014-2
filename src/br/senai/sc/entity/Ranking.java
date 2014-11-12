package br.senai.sc.entity;

import java.io.Serializable;
import javax.persistence.*;


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
	private Usuario usuario;
	private Evento evento;

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
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="idEvento", nullable=false)
	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}