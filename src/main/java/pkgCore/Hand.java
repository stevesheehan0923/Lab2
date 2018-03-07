package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			  
			if (c.getRank().getiRankNbr() == 13)
			{
				iScore[0]+=1;
				if (iScore[1] + 11 > 21)
				{
					iScore[1]+= 1;
				}
				else {
					iScore[1]+=11;
				}
				
			}
			else
			{
				if (c.getRank().getiRankNbr() >= 9)
				{
					iScore[0]+=10;
					iScore[1]+=10;
				}
				else
				{
					iScore[0]+=c.getRank().getiRankNbr()+1;
					iScore[1]+=c.getRank().getiRankNbr()+1;
				}
			}
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		
		
		cards.add(d.deck.get(0));
		d.deck.remove(0);
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
