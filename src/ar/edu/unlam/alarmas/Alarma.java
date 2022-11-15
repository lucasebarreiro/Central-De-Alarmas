package ar.edu.unlam.alarmas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Alarma  {

	private Integer idAlarma;
	private Integer codigoActivacionDesactivacion;
	private String codigoConfig;
	private String nombre;
	private List<Usuario> usuariosValidos = new ArrayList<>();
	private Set<Accion> acciones = new TreeSet<>();
	private Set<Sensor> sensores = new HashSet<>();
	private Boolean estado;
	
	public Alarma(Integer idAlarma, Integer codigoActivacionDesactivacion, String codigoConfig, String nombre) {
		super();
		this.idAlarma = idAlarma;
		this.codigoActivacionDesactivacion = codigoActivacionDesactivacion;
		this.codigoConfig = codigoConfig;
		this.nombre = nombre;
	}
	
	public Integer cantidadUsuariosValidos() {
		return usuariosValidos.size();
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(idAlarma);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alarma other = (Alarma) obj;
		return Objects.equals(idAlarma, other.idAlarma);
	}



	public Integer getIdAlarma() {
		return idAlarma;
	}

	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}

	public Integer getCodigoActivacionDesactivacion() {
		return codigoActivacionDesactivacion;
	}

	public void setCodigoActivacionDesactivacion(Integer codigoActivacionDesactivacion) {
		this.codigoActivacionDesactivacion = codigoActivacionDesactivacion;
	}

	public String getCodigoConfig() {
		return codigoConfig;
	}

	public void setCodigoConfig(String codigoConfig) {
		this.codigoConfig = codigoConfig;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario> getUsuariosValidos() {
		return usuariosValidos;
	}

	public void setUsuariosValidos(List<Usuario> usuariosValidos) {
		this.usuariosValidos = usuariosValidos;
	}

	public Set<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(Set<Accion> acciones) {
		this.acciones = acciones;
	}

	public Set<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(Set<Sensor> sensores) {
		this.sensores = sensores;
	}

	public Integer cantidadSensoresAlarma() {
		return sensores.size();
	}
	
	
	
	
	
}
