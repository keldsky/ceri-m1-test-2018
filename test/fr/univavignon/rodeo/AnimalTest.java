package fr.univavignon.rodeo;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class AnimalTest {
	
	IAnimal ia;
	
	public static IAnimal getInstance()
	{
		IAnimal ia = mock(IAnimal.class);
		
		when(ia.getXP()).thenReturn(20);
		when(ia.isSecret()).thenReturn(true);
		when(ia.isEndangered()).thenReturn(true);
		when(ia.isBoss()).thenReturn(true);
		
		return ia;
	}
	
	@Before
	public void Instance()
	{
		ia = mock(IAnimal.class);
		when(ia.getXP()).thenReturn(20);
		when(ia.isSecret()).thenReturn(true);
		when(ia.isEndangered()).thenReturn(true);
		when(ia.isBoss()).thenReturn(true);
	}
	
	@Test
	public void testXP() {
		
		assertEquals(20 , ia.getXP());	
	}
	
	@Test
	public void testSecret() {
		
		assertEquals(true , ia.isSecret());	
	}
	
	@Test
	public void testEndangered() {
		
		assertEquals(true , ia.isEndangered());	
	}
	
	@Test
	public void testBoss() {
	
		assertEquals(true , ia.isBoss());	
	}
	
	
    
  
}