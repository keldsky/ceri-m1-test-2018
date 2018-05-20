package fr.univavignon.rodeo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.*;

public class GameStateTest {

	IGameState igs;
	
	
	@Before
	public void Instance()
	{
		igs = mock(IGameState.class);
		when(igs.getProgression()).thenReturn(10);
		doThrow(new IllegalArgumentException() ).when(igs).catchAnimal(AnimalTest.getInstance());
		doThrow(new IllegalStateException()).when(igs).exploreArea();
		doThrow(new IllegalArgumentException()).when(igs).catchAnimal(null);		
		doThrow(new IllegalArgumentException()).when(igs).getSpecieLevel(null);
		ISpecie isp = SpecieTest.getInstance();
		SpecieLevel level = null ;
		when(igs.getSpecieLevel(isp)).thenReturn(level); 
	}
	
	public static IGameState getInstance()
	{
		IGameState igs = mock(IGameStatet.class);
		
		when(igs.getProgression()).thenReturn(10);
		doThrow(new IllegalArgumentException() ).when(igs).catchAnimal(AnimalTest.getInstance());
		doThrow(new IllegalStateException()).when(igs).exploreArea();
		doThrow(new IllegalArgumentException()).when(igs).catchAnimal(null);		
		doThrow(new IllegalArgumentException()).when(igs).getSpecieLevel(null);
		ISpecie isp = SpecieTest.getInstance();
		SpecieLevel level = null ;
		when(igs.getSpecieLevel(isp)).thenReturn(level); 
		
		return igs;
	}
	
	@Test
	public void testSpecieLevel(){ 
		ISpecie isp = SpecieTest.getInstance();
		SpecieLevel level = null ;
        assertEquals(igs.getSpecieLevel(isp), level);
        
}
	@Test
	public void testProgression() {
		
		assertEquals(10 , igs.getProgression());	
	}

	@Test(expected = IllegalStateException.class)
	public void testExploreAreaException(){ 
		
		igs.exploreArea();
        
        
	}

	
	/**
	 *  IllegalArgumentException 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalNull(){ 
		
		igs.catchAnimal(null);    
        
	}
	
	/**
	 * IllegalStateException 
	 */
	@Test(expected = IllegalStateException.class)
	public void testCatchAnimalNotFound(){ 

		igs.catchAnimal(AnimalTest.getInstance());    
	}	

	
	/**
	 * IllegalArgumentException 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetSpecieLevelException(){ 
		
		igs.getSpecieLevel(null);    
        
} 
	
}
