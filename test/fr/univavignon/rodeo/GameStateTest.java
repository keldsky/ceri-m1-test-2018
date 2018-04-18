package fr.univavignon.rodeo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.IAnimal;

public class GameStateTest {

	IGameState igs;
	
	
	@Before
	public void Instance()
	{
		igs = mock(IGameState.class);
		when(igs.getProgression()).thenReturn(10);
		igs.exploreArea();
		doThrow(new IllegalArgumentException() ).when(igs).catchAnimal(AnimalTest.getInstance());
		doThrow(new IllegalStateException() ).when(igs).catchAnimal(AnimalTest.getInstance());
	}
	
	@Test
	public void testProgression() {
		
		assertEquals(10 , igs.getProgression());	
	}
	
	
}
