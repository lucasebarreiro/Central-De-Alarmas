package ar.edu.unlam.alarmas;

import java.util.Objects;

public class Sensor {

	private Integer idNumerico;
	private Boolean estado;
	
	public Sensor(Integer idNumerico, Boolean estado) {
		super();
		this.idNumerico = idNumerico;
		this.estado = estado;
	}

	public Integer getIdNumerico() {
		return idNumerico;
	}

	public void setIdNumerico(Integer idNumerico) {
		this.idNumerico = idNumerico;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idNumerico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensor other = (Sensor) obj;
		return Objects.equals(idNumerico, other.idNumerico);
	}
	
	
	
	
	
	
	
}
