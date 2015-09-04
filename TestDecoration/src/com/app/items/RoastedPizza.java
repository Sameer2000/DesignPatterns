package com.app.items;

import com.app.item.Pizza;

public class RoastedPizza extends Pizza
{

   @Override
   public int cost()
   {
      return cost + 60;
   }

}
