package com.app.item.toppings;

import com.app.item.Pizza;
import com.app.item.Toppings;

public class ExtraCheeze extends Toppings
{

   public ExtraCheeze( Pizza pizza )
   {
      super( pizza );
   }

   @Override
   public int cost()
   {
      return super.cost() + 2;
   }
   
}
