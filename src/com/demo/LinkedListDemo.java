package com.demo;

import com.beans.Node;

public class LinkedListDemo
{
	private Node head = null;
	
	public static void main(String[] args)
	{
		LinkedListDemo demo = new LinkedListDemo();
		demo.addElement(5);
		demo.addElement(4);
		demo.addElement(2);
		demo.printElement();
		//demo.removeElement(4);
		//demo.removeElement(5);
		demo.printElement();
		
		//demo.printElement();
		
	}
	
	
    void addElement(int data)
    {
    	if(head == null)
    	{
    		head = new Node();
    		head.setData(data);
    		head.setNext(null);
    		return ;
    	}
    	
    	Node temp = new Node();
    	temp.setData(data);
    	temp.setNext(null);
    	
    	Node current = head;
    	
    	while(current.getNext()!= null)
    	{
    		current = current.getNext();
    	}
    	
    	current.setNext(temp);
    	
    }
    
    void removeElement(int data)
    {
    	Node current  = head;
    	Node previous = null;
    	
    	while(current!=null)
    	{
    		if(current.getData() == data)
    		{
    			break;
    		}
    	  previous = current;
    	  current  = current.getNext();
    	  
    	}
    	
    	previous.setNext(current.getNext());
    }
    
    void printElement()
    {
       Node temp = head;
       System.out.println("");
       while(temp!=null)
       {
    	   System.out.print(temp.getData() + " -> ");
    	   temp = temp.getNext();
       }
    }
    

}
