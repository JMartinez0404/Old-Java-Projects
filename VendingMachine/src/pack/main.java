package pack;

import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		int coinBalance;
		String selection = "";
		int input;
		Scanner in = new Scanner(System.in);
		VendingMachine mach = new VendingMachine(0);
		Product coke = new Product("coke", 10, 5);
		Product skittles = new Product("skittles", 12, 3);
		Product gum = new Product("gum", 20, 1);
		
		System.out.println("How many coins do you have?" );
		coinBalance = in.nextInt();
		
		while(!selection.equals("exit"))
		{
			System.out.println();
			System.out.println();
			mach.toString(coke, skittles, gum);
			System.out.println("Please type the name of a product you would like to buy: ");
			System.out.println("*Please type 'exit' if you would like to leave.");
			System.out.println("*Please type 'stock' to stock a product.");
			System.out.println("*Please type 'money' to remove money from machine.");
			selection = in.next();
			
			if(selection.equals("stock"))
			{
				System.out.println("Which product would you like to restock?");
				selection = in.next();
				
				if(selection.equals("coke"))
				{
					System.out.println("How many cokes would you like to add?");
					input = in.nextInt();
					System.out.println(coke.addProducts(input));
				}
				else if(selection.equals("skittles"))
				{
					System.out.println("How many skittles would you like to add?");
					input = in.nextInt();
					System.out.println(skittles.addProducts(input));
				}
				else if(selection.equals("gum"))
				{
					System.out.println("How much gum would you like to add?");
					input = in.nextInt();
					System.out.println(gum.addProducts(input));
				}
				
				selection = "";
			}
			
			if(selection.equals("money"))
			{
				System.out.println(mach.coins + " coin/s have been removed form the machine");
				mach.coins = 0;
			}
			
			if(selection.equals("coke"))
			{
				if(coke.getAmount() == 0)
				{
					System.out.println("There are no more cokes :(");
				}
				else
				{
					System.out.println("Please enter " + coke.getPrice() + " coins.");
					input = in.nextInt();
					
					if(input < coke.getPrice())
					{
						System.out.println("Insufficient funds. Returning coins.");
						System.out.println("You have " + coinBalance + " coins left.");
					}
					else if(input >= coke.getPrice() && input <= coinBalance)
					{
						coinBalance -= input;
						System.out.println(coke.sellProduct());
						System.out.println("Thank you. Returning extra coins.");
						coinBalance += input - coke.getPrice();
						System.out.println("You have " + coinBalance + " coins left.");
						mach.coins += coke.getPrice();
					}
					else if(input > coinBalance)
					{
						System.out.println("Number of coins exceeds your total coins.");
					}
				}
			}
			
			if(selection.equals("skittles"))
			{
				if(skittles.getAmount() == 0)
				{
					System.out.println("There are no more skittles :(");
				}
				else
				{	
					System.out.println("Please enter " + skittles.getPrice() + " coins.");
					input = in.nextInt();
					
					if(input < skittles.getPrice())
					{
						System.out.println("Insufficient funds. Returning coins.");
						System.out.println("You have " + coinBalance + " coins left.");
					}
					else if(input >= skittles.getPrice() && input <= coinBalance)
					{
						coinBalance -= input;
						System.out.println(skittles.sellProduct());
						System.out.println("Thank you. Returning extra coins.");
						coinBalance += input - skittles.getPrice();
						System.out.println("You have " + coinBalance + " coins left.");
						mach.coins += skittles.getPrice();
					}
					else if(input > coinBalance)
					{
						System.out.println("Number of coins exceeds your total coins.");
					}
				}
			}
			
			if(selection.equals("gum"))
			{
				if(gum.getAmount() == 0)
				{
					System.out.println("There is no more gum :(");
				}
				else
				{
					System.out.println("Please enter " + gum.getPrice() + " coins.");
					input = in.nextInt();
					
					if(input < gum.getPrice())
					{
						System.out.println("Insufficient funds. Returning coins.");
						System.out.println("You have " + coinBalance + " coins left.");
					}
					else if(input >= gum.getPrice() && input <= coinBalance)
					{
						coinBalance -= input;
						System.out.println(gum.sellProduct());
						System.out.println("Thank you. Returning extra coins.");
						coinBalance += input - gum.getPrice();
						System.out.println("You have " + coinBalance + " coins left.");
						mach.coins += gum.getPrice();
					}
					else if(input > coinBalance)
					{
						System.out.println("Number of coins exceeds your total coins.");
					}
				}
			}
		}
		
		System.out.println("Thank you for your money!");
	}
}

