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
	List li;
	@Before
	public void Instance()
	{
		is = mock(ISpecie.class);
		
		when(is.getArea()).thenReturn(10);
		
		IAnimal ia = AnimalTest.getInstance();
		
		List<IAnimal> la = new ArrayList();
		
		la.add(ia);
		
		li = new ArrayList();
		
		li.add("a");
		li.add("b");
		li.add("c");
		
		when(is.getAnimals()).thenReturn(li);
		
	}
	
	@Test
	public void testArea() {
		
		assertEquals(10 , is.getArea());	
	}
	
	@Test
	public void testAnimals() {
		
		assertEquals(li , is.getAnimals());	
	}

}
