package com.app.item;

public abstract class Toppings extends Pizza 
{

   protected Pizza pizza;
   
   public Toppings(Pizza pizza)
   {
      this.pizza = pizza;
   }
   
   @Override
   public int cost()
   {
      return pizza.cost();
   }
   
}
