package fr.univavignon.rodeo;

import java.util.List;

import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class AnimalTest {
	
	@Test
	public void testXP() {
		IAnimal ia = mock(IAnimal.class);
		when(ia.getXP()).thenReturn(20);
		assertEquals(20 , ia.getXP());	
	}
	
	@Test
	public void testSecret() {
		IAnimal ia = mock(IAnimal.class);
		when(ia.isSecret()).thenReturn(true);
		assertEquals(true , ia.isSecret());	
	}
	
	@Test
	public void testEndangered() {
		IAnimal ia = mock(IAnimal.class);
		when(ia.isEndangered()).thenReturn(true);
		assertEquals(true , ia.isEndangered());	
	}
	
	@Test
	public void testBoss() {
		IAnimal ia = mock(IAnimal.class);
		when(ia.isBoss()).thenReturn(true);
		assertEquals(true , ia.isBoss());	
	}
	
	
    
  
}