package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {
	
	AbstractFactory factory;
	
	@Test
	public void test_es() {
		//implementar Abstract factory
		factory = new FactoryEs();
		
		Preguntas preguntas = factory.createPreguntas();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		//implementar Abstract factor
		
		Saludos saludos = factory.createSaludos();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		//implementar Abstract factor
		
		factory = new FactoryEn();
		
		Preguntas preguntas = factory.createPreguntas();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		//implementar Abstract factor
		Saludos saludos = factory.createSaludos();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}
