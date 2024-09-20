package com.bill;

import java.util.Scanner;

public class Pizza {
    protected int price;
    private Boolean veg;
    
    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 150;
    protected int backPackPrice = 20;
    
    protected int basePizzaPrice;
    
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedFortakeaway = false;
    
    Scanner sc = new Scanner(System.in);
    
    public Pizza(Boolean veg)
    {
    	this.veg = veg;
    	
    	if(this.veg)
    	{
    		this.price = 300;
    	}
    	else
    	{
    		this.price =400;
    	}
    	basePizzaPrice = this.price;
    }
    public void addExtraToppings()
    {
    	System.out.println(" Want Extra Topping (y/n)? =>");
    	char ch = sc.next().charAt(0);
    	switch(ch)
    	{
    	case('y'):
    	isExtraToppingsAdded = true;
    	this.price += extraCheesePrice;
    	break;
    	case('n'):
    	isExtraToppingsAdded = false;
    	break;
    	
    	}
    }
    public void addExtracheese()
    {
    	System.out.println("Want Extra cheese (y/n)? =>");
    	char ch = sc.next().charAt(0);
    	switch(ch)
    	{
    	case('y'):
    	isExtraCheeseAdded = true;
    	this.price += extraCheesePrice;
    	break;
    	case('n'):
    	isExtraCheeseAdded = false;
    	break;
    	
    	}
    }
    public void takeAway()
    {
    	System.out.println("Want TakeAway (y/n)? =>");
    	char ch = Character.toLowerCase(sc.next().charAt(0));
    	switch(ch)
    	{
    	case('y'):
    		 isOptedFortakeaway  = true;
    	     this.price += backPackPrice;
    	     break;
    	
    	case('n'):
    		isOptedFortakeaway = false;
    	    break;
    	}
    }
    public void getBill()
    {
    	String bill = " ";
    	
    	System.out.println(("Pizza : "+basePizzaPrice));
    	if(isExtraCheeseAdded)
    	{
    		bill += "Extraa Cheese : "+extraCheesePrice+ "\n";
    	}
    	if(isExtraToppingsAdded)
    	{
    		bill += "Extraa Toppings  : "+extraToppingsPrice+ "\n";
    	}
    	if(isOptedFortakeaway)
    	{
    		bill += "Take away : "+backPackPrice+ "\n";
    	}
    	bill +="\n Total Amount : "+this.price +"\n";
    	
    	System.out.println(bill);
    	System.out.println("\n\n\nThanks you !!!! Visit Again.....");
    	System.out.println("-----------------------------------------");
    	
    	
    }

}
