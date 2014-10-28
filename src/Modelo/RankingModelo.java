package Modelo;

public class RankingModelo {

	private String nome;
	private String pontos;
	private String posicao;
	
	public RankingModelo(String nome, String pontos, String posicao) {
		super();
		this.nome = nome;
		this.pontos = pontos;
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPontos() {
		return pontos;
	}

	public void setPontos(String pontos) {
		this.pontos = pontos;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
}
