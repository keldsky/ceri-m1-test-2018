package fr.univavignon.rodeo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;


public class EnvironmentTest {


	IEnvironment ie;
	
	List<ISpecie> li;
	
	
	public static IEnvironment getInstance()
	{
		IEnvironment ie = mock(IEnvironment.class);
		
		when(ie.getAreas()).thenReturn(10);
		
		ISpecie is = SpecieTest.getInstance();
		
		List<ISpecie> li = new ArrayList();
		
		li.add(is);
		
		when(ie.getSpecies()).thenReturn(li);
		
		return ie;
	}
	
	@Before
	public void Instance()
	{
		ie = mock(IEnvironment.class);
		
		when(ie.getAreas()).thenReturn(10);
		
		ISpecie is = SpecieTest.getInstance();
		
		li = new ArrayList();
		
		li.add(is);
		
		when(ie.getSpecies()).thenReturn(li);
		
	}
	
	@Test
	public void testAreas() {
		
		assertEquals(10 , ie.getAreas());	
	}
	
	@Test
	public void testSpecies() {
		
		assertEquals(li , ie.getSpecies());	
	}

}
