import java.util.*;

public class Player {

	private int order;
	private int money;
	private Card holdingCard;
	private ArrayList<Share> shareHolds;
	
	public Player(int order, int money)
	{
		this.order = order;
		this.money = money;
	}
	
	public void takeCard(Card card)
	{
		holdingCard = card;
	}
	
	public void buyShares(ArrayList<Share> shares)
	{
		shareHolds = shares;
	}
}
