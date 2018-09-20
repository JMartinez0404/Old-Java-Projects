package pack;

public class PizzaQueue 
{
	Queue pizzaQueue = new Queue();
	
	public void enqueue(Pizza thispizza)
	{
		pizzaQueue.enqueue(thispizza);
	}

	public Object dequeue()
	{
		return pizzaQueue.dequeue();
	}

	public void deliver()
	{
		Pizza thispizza = pizzaQueue.dequeue();
		
		if (thispizza == null)
		{
			System.out.println("No deliveries pending");
			return;
		}
		else
		{
			System.out.println("Deliver a pizza with " + thispizza.ingrediants + " to "
					+ thispizza.address);
		}
	}
}
