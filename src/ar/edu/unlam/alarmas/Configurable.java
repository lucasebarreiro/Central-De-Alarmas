package ar.edu.unlam.alarmas;

public interface Configurable {
	
	public void agregarUsuarioAUnaAlarma(Usuario config, Alarma alarma, Integer dniUsuarioAAgregar, Integer idAlarma, String codigoConfigAlarma) throws codigoAlarmaIncorrectoException;
	public void agregarSensorAAlarma(Sensor sensor, Alarma alarma) throws sensorDuplicadoException, alarmaInexistente;
}
