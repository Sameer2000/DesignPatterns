package com.app.test;

import com.app.item.Pizza;
import com.app.item.Toppings;
import com.app.item.toppings.ExtraCheeze;
import com.app.items.GrillPizza;
import com.app.items.PanPizza;
import com.app.items.RoastedPizza;

public class TestDecoration
{
   
   public static void main(String[] args){
      Pizza grilPizza = new GrillPizza();
      System.out.println("grill pizza : "+grilPizza.cost());
      Pizza panPizza = new PanPizza();
      System.out.println("pan pizza : "+panPizza.cost());
      Pizza roastedPizza = new RoastedPizza();
      System.out.println("roasted pizza : "+roastedPizza.cost());
      Pizza extraCheeePizza = new ExtraCheeze( roastedPizza );
      System.out.println("toppings: "+extraCheeePizza.cost());
   }

}
