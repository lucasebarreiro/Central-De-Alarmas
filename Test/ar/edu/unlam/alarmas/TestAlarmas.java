package ar.edu.unlam.alarmas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAlarmas {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		
		Usuario admin = new Administrador(40378915, "Lucas");
		Alarma alarma = new Alarma(1,12345,"CodigoConfig", "Nombre");
		
		((Administrador) admin).registrarAlarma(alarma);
		
		Integer valorEsperado=1;
		Integer valorObtenido= ((Administrador)admin).cantidadAlarmasCentral();
		
		assertEquals(valorEsperado, valorObtenido);
		
		
	}
	
	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() throws codigoAlarmaIncorrectoException {
		
		Usuario admin = new Administrador(40378915, "Lucas");
		Usuario config = new Configurador(40234566, "Lucas");
		Alarma alarma = new Alarma(1,12345,"contra", "Nombre");
		////////////////////////////////////////////////
		Integer dniUsuarioAAgregar=40000000;
		Integer idAlarma=1;
		String codigoConfigAlarma="contra";
		
		
		((Administrador) admin).agregarUsuarioAUnaAlarma(config,alarma, dniUsuarioAAgregar, idAlarma, codigoConfigAlarma);
		
		Integer valorEsperado=1;
		Integer valorObtenido= alarma.cantidadUsuariosValidos();
		
		assertEquals(valorEsperado, valorObtenido);		
		
	}
	
	@Test
	public void AlAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnaSensorduplicadoException() throws sensorDuplicadoException, alarmaInexistente {
		
		Usuario admin = new Administrador(40378915, "Lucas");
		Usuario config = new Configurador(40234566, "Lucas");
		Alarma alarma = new Alarma(1,12345,"contra", "Nombre");
		Sensor sensor = new Sensor(1, false);
		Sensor sensor2 = new Sensor(1, false);
		
		((Administrador) admin).registrarAlarma(alarma);
		////////////////////////////////////////////////
		Integer dniUsuarioAAgregar=40000000;
		Integer idAlarma=1;
		String codigoConfigAlarma="contra";
		
		((Administrador)admin).agregarSensorAAlarma(sensor, alarma);
		((Administrador)admin).agregarSensorAAlarma(sensor2, alarma);
		
		Integer valorEsperado=1;
		Integer valorObtenido= alarma.cantidadSensoresAlarma();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
