package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		
		Deck d = new Deck(1);
		assertEquals(d.deck.size(), 52);
		Deck d2 = new Deck(6);
		assertEquals(d2.deck.size(), 312);
		
		
		
	
	}

}
