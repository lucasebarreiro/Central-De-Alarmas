package ar.edu.unlam.alarmas;

import java.util.HashSet;
import java.util.Set;

public class Administrador extends Usuario implements Configurable {
	
	private Set<Alarma> central = new HashSet<>();
	private Set<Usuario> centralUsuarios = new HashSet<>();
	
	

	public Administrador(Integer dni, String nombre) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
	}

	public void registrarAlarma(Alarma alarma) {
		central.add(alarma);
		
	}
	
	public Integer cantidadAlarmasCentral(){
		return central.size();
	}

	public void agregarUsuarioAUnaAlarma(Usuario config, Alarma alarma, Integer dniUsuarioAAgregar, Integer idAlarma, String codigoConfigAlarma) throws codigoAlarmaIncorrectoException {
		if (alarma.getCodigoConfig().equals(codigoConfigAlarma)) {
			alarma.getUsuariosValidos().add(config);
		}else {
			throw new codigoAlarmaIncorrectoException();
		}
	}

	public void agregarSensorAAlarma(Sensor sensor, Alarma alarma) throws sensorDuplicadoException, alarmaInexistente {
		if (central.contains(alarma)) {
			if (alarma.getSensores().contains(sensor)) {
				throw new sensorDuplicadoException();
			}else {
				alarma.getSensores().add(sensor);
				sensor.setEstado(true);
			}
		}else {
			throw new alarmaInexistente();
		}
		
	}

	

	

	
	
	
	

	
	
}
