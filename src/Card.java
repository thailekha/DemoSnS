
public class Card {

	private String type;
	private int value;
	
	public Card(String type, int value)
	{
		this.type = type;
		this.value = value;
	}
	
	public String getCardType()
	{
		return type;
	}
	
	public int getCardValue()
	{
		return value;
	}
	
	public void updateCardType(String type)
	{
		this.type = type;
	}
	
	public void updateCardValue(int value)
	{
		this.value = value;
	}
}
