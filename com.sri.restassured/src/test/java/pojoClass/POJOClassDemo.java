package pojoClass;

public class POJOClassDemo 
{
	private String product;
	private int price;
	private String color;
	private String[] sellers;
	
	public POJOClassDemo(String product,int price, String color, String[] sellers)
	{
		this.product=product;
		this.price=price;
		this.color=color;
		this.sellers=sellers;
	}
	
	public String getProduct()
	{
		return product;
	}
	
	public void setProduct()
	{
		this.product=product;
	}

	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setSellers(String[] sellers)
	{
		this.sellers=sellers;
	}
	
	public String[] getSellers()
	{
		return this.sellers;
	}
}
