package fr.univavignon.rodeo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class EnvironmentProviderTest {
	
	IEnvironmentProvider iep;
	
	List<String> ls;
	
	@Before
	public void Instance()
	{
		iep = mock(IEnvironmentProvider.class);
		when(iep.getEnvironment("Home")).thenReturn(EnvironmentTest.getInstance());
		
		ls = new ArrayList();
		ls.add("aaa");
		ls.add("bbb");
		
		when(iep.getAvailableEnvironments()).thenReturn(ls);
		
		
	}
	
	@Test
	public void testAvailableEnvironments() {
		
		assertEquals(20 ,iep.getAvailableEnvironments());	
	}
	
	@Test
	public void testEnvironment() {
		
		assertEquals(EnvironmentTest.getInstance() , iep.getEnvironment("Home"));	
		
	}
	
	
	
	
    
  

}
