package pack;

public class VendingMachine
{
	int coins;
	
	VendingMachine(int coins)
	{
		this.coins = coins;
	}
	
	public void toString(Product pro1, Product pro2, Product pro3)
	{
		System.out.println("-----Welcome to the Vending Machine-----");
		System.out.println("Here is a list of items you can buy:");
		System.out.println(pro1.toString());
		System.out.println(pro2.toString());
		System.out.println(pro3.toString());
	}
}
