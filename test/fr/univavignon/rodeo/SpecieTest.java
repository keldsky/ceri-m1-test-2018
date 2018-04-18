package fr.univavignon.rodeo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class SpecieTest {
	
	
	ISpecie is;
	
	List<IAnimal> la;
	
	public static ISpecie getInstance()
	{
		ISpecie is = mock(ISpecie.class);
		
		when(is.getArea()).thenReturn(10);
		
		IAnimal ia = AnimalTest.getInstance();
		
		List<IAnimal> la = new ArrayList();
		
		la.add(ia);
		
		when(is.getAnimals()).thenReturn(la);
		
		return is;
	}
	
	@Before
	public void Instance()
	{
		is = mock(ISpecie.class);
		
		when(is.getArea()).thenReturn(10);
		
		IAnimal ia = AnimalTest.getInstance();
		
		la = new ArrayList();
		
		la.add(ia);
		
		when(is.getAnimals()).thenReturn(la);
		
	}
	
	@Test
	public void testArea() {
		
		assertEquals(10 , is.getArea());	
	}
	
	@Test
	public void testAnimals() {
		
		assertEquals(la , is.getAnimals());	
	}

}
