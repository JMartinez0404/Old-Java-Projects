package pack;

import java.util.*;

public class Queue
{
	private LinkedList<Pizza> list;
	
	public Queue()
	{
		list = new LinkedList<Pizza>();
	}

	public void enqueue(Pizza item)
	{
		list.add(item);
	}

	public Pizza dequeue()
	{
		Pizza item;
		if(list.peek() == null)
			return null;
		else
		{
			item = list.remove(0);
			return item;
		}
	}
}