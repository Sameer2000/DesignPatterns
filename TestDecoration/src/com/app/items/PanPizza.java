package com.app.items;

import com.app.item.Pizza;

public class PanPizza extends Pizza
{

   @Override
   public int cost()
   {
      return cost + 120;
   }

}
