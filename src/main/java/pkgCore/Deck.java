package pkgCore;

import java.util.ArrayList;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {


	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(int numberOfDecks)
	{
		for (int i = 0; i < numberOfDecks; i++)
		{
			for (int j = 0; j<4; j++)
			{
				for (int k = 0; k<13; k++)
				{
					deck.add(new Card(eRank.values()[k], eSuit.values()[j]));
				}
			}
		}
	}





}
