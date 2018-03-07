package pkgEnum;

public enum eRank {

	TWO(1), THREE(2), FOUR(3), FIVE(4), SIX(5), SEVEN(6), EIGHT(7), NINE(8), TEN(9), JACK(10), QUEEN(11), KING(
			12), ACE(13);

	private int iRankNbr;

	private eRank(int iRankNbr) {
		this.iRankNbr = iRankNbr;
	}

	public int getiRankNbr() {
		return iRankNbr;
	}

}
