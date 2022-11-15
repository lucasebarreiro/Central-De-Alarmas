package ar.edu.unlam.alarmas;

public class Accion implements Comparable<Accion> {

	private Integer idAccion;
	private Alarma alarma;
	private Usuario usuario;
	private String fecha;
	private TipoDeOperacion tipoOperacion;
	
	public Accion(Integer idAccion, Alarma alarma, Usuario usuario, String fecha, TipoDeOperacion tipoOperacion) {
		super();
		this.idAccion = idAccion;
		this.alarma = alarma;
		this.usuario = usuario;
		this.fecha = fecha;
		this.tipoOperacion = tipoOperacion;
	}

	public Integer getIdAccion() {
		return idAccion;
	}

	public void setIdAccion(Integer idAccion) {
		this.idAccion = idAccion;
	}

	public Alarma getAlarma() {
		return alarma;
	}

	public void setAlarma(Alarma alarma) {
		this.alarma = alarma;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public TipoDeOperacion getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(TipoDeOperacion tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	@Override
	public int compareTo(Accion o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
}
