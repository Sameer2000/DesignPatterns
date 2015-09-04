package com.app.items;

import com.app.item.Pizza;

public class GrillPizza extends Pizza
{

   @Override
   public int cost()
   {
      return cost + 50;
   }

}
