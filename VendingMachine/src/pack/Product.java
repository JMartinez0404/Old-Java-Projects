package pack;

public class Product
{
	String nameOfProduct;
	int productAmount;
	int productPrice;
	
	Product(String nameOfProduct, int productAmount, int productPrice)
	{
		this.nameOfProduct = nameOfProduct;
		this.productAmount = productAmount;
		this.productPrice = productPrice;
	}
	
	public String toString()
	{
		String str = "There are " + productAmount + " " + nameOfProduct
				+ " left. They cost " + productPrice + " coin/s each.";
		
		return str;
	}
	
	public String getName()
	{
		return nameOfProduct;
	}
	
	public int getAmount()
	{
		return productAmount;
	}
	
	public int getPrice()
	{
		return productPrice;
	}
	
	public String addProducts(int num)
	{
		productAmount += num;
		
		return num + " products have been added.";
	}
	
	public String sellProduct()
	{
		productAmount -= 1;
		
		return "One " + nameOfProduct + " has been dispensed.";
	}
}