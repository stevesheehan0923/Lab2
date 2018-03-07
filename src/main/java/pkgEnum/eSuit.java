package pkgEnum;

public enum eSuit {
	HEARTS(1), CLUBS(2), DIAMONDS(3), SPADES(4);

	private int iSuitNbr;
	
	private eSuit(int SuitNbr)
	{
		this.iSuitNbr = SuitNbr;
		
	}
	
	private int getiSuitNbr()
	{
		return iSuitNbr;
	}

}
