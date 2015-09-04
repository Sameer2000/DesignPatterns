package com.app.item.toppings;

import com.app.item.Pizza;
import com.app.item.Toppings;

public class Onion extends Toppings
{

   public Onion( Pizza pizza )
   {
      super( pizza );
   }
   
   @Override
   public int cost()
   {
      return super.cost() + 3;
   }
   

}
