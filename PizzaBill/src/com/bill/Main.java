package com.bill;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------Welcome to PizzaMania---------------------\n");
		System.out.println("Which pizza : (1. Veg Pizza 2. Non-Veg Pizza 3. Delux Veg Pizza 4.Delux Non-Veg Pizza) ==>");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			Pizza vegPizza = new Pizza(true);
			vegPizza.addExtraToppings();
			vegPizza.addExtracheese();
			vegPizza.getBill();
			break;
		case 2:
			Pizza nonVegPizza = new Pizza(false);
			nonVegPizza.addExtraToppings();
			nonVegPizza.addExtracheese();
			nonVegPizza.takeAway();
			nonVegPizza.getBill();
			break;
		case 3:
			DeluxPizza veg = new DeluxPizza(true);
			veg.basePizzaPrice = 550;
			veg.addExtraToppings();
			veg.addExtracheese();
			veg.takeAway();
			veg.getBill();
			break;
		case 4:
			DeluxPizza nonVeg = new DeluxPizza(false);
			nonVeg.basePizzaPrice = 650;
			nonVeg.addExtraToppings();
			nonVeg.addExtracheese();
			nonVeg.takeAway();
			nonVeg.getBill();
			break;

			}
		
			
		
	}

}
