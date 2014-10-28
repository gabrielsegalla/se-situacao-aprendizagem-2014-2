package Modelo;

public class ModeloProximosEventos {

	private String nomePalestra;
	private String data;
	private String horaDeInicio;
	private String horaDeTermino;
	private String pontos;
	
	public ModeloProximosEventos(String nomePalestra, String data, String horaDeInicio,
			String horaDeTermino, String pontos) {
		super();
		this.nomePalestra = nomePalestra;
		this.data= data;
		this.horaDeInicio = horaDeInicio;
		this.horaDeTermino = horaDeTermino;
		this.pontos = pontos;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNomePalestra() {
		return nomePalestra;
	}

	public void setNomePalestra(String nomePalestra) {
		this.nomePalestra = nomePalestra;
	}

	public String getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(String horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public String getHoraDeTermino() {
		return horaDeTermino;
	}

	public void setHoraDeTermino(String horaDeTermino) {
		this.horaDeTermino = horaDeTermino;
	}

	public String getPontos() {
		return pontos;
	}

	public void setPontos(String pontos) {
		this.pontos = pontos;
	}
	
	
}
