package spaceinvaders;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SpaceInvaderTest {

	
	@Test
	public void test_AuDebut_JeuSpaceInvaderEstVide() {
		SpacesInvaders spaceinvaders = new SpacesInvaders(15, 10);
		assertEquals("" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" , spaceinvaders.toString());
	    }
}
