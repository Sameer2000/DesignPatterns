package com.app.item.toppings;

import com.app.item.Pizza;
import com.app.item.Toppings;

public class Mushroom extends Toppings
{

   public Mushroom( Pizza pizza )
   {
      super( pizza );
   }
   
   @Override
   public int cost()
   {
      return super.cost() + 5;
   }

}
