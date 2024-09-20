package com.bill;

public class DeluxPizza extends Pizza {
	public DeluxPizza(Boolean veg)
	{
		super(veg);
	}
	@Override
	public void addExtracheese()
	{
		this.price += extraCheesePrice;
	}
	@Override
	public void addExtraToppings()
	{
		this.price += extraToppingsPrice;
	}

}
