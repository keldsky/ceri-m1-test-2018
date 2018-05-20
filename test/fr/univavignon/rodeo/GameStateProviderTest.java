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

public class GameStateProviderTest {
	
	IGameStateProvider igsp;
	
	
	@Before
	public void Instance()
	{
		igsp = mock(IGameStateProvider.class);
		
		doThrow(new IllegalArgumentException()).when(igsp).get(null);
		
        when(igsp.get("player")).thenReturn(GameStateTest.getInstance());
        
        when(igsp.get("player").getName()).thenReturn("player");
        
		IGameState newstate = GameStateTest.getInstance();
		
		igsp.save(newstate);
		
        when(igsp.get("NewState")).thenReturn(GameStateTest.getInstance());
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetNull(){ 

		igsp.get(null);    
        
	}	
	
	@Test
	public void testGet(){ 
		
        assertEquals(igsp.get("player").getName(),"player");
  
	}

	@Test
	public void testSave(){ 

        assertEquals(igsp.get("NewState").getName(),"player");
}

}
