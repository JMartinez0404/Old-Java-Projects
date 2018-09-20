package pack;


public class Main
{	
	public static void main(String[] args)
	{  
		PizzaQueue Q = new PizzaQueue(); 

		Q.enqueue(new Pizza("pepperoni", "1234 Bobcat Trail"));
		Q.enqueue(new Pizza("sausage", "2345 University Drive"));
		Q.deliver();
		Q.enqueue(new Pizza("extra cheese", "3456 Rickster Road"));
		Q.enqueue(new Pizza("everything", "4567 King Court"));
		Q.enqueue(new Pizza("coffee beans", "5678 Java Circle"));
		Q.deliver();
		Q.deliver();
		Q.deliver();
		Q.deliver();
		Q.deliver();
	}

}
