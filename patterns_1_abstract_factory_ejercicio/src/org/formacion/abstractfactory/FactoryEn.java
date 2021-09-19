package org.formacion.abstractfactory;

public class FactoryEn implements AbstractFactory{

	@Override
	public Preguntas createPreguntas() {
		return new PreguntasEn();
	}

	@Override
	public Saludos createSaludos() {
		return new SaludosEn();
	}
	
	

}
