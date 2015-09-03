package com.app.design.test;

import com.app.design.Humans;
import com.app.design.childs.Chinese;
import com.app.design.childs.Indian;
import com.app.design.childs.Russian;

public class TestStategy {
	
	public static void main(String[] args){
		Humans chinese = new Chinese();
		chinese.display();
		chinese.eat();
		chinese.wear();
		
		System.out.println("---------------------");
		
		Humans indian = new Indian();
		indian.display();
		indian.eat();
		indian.wear();
		
		System.out.println("---------------------");
		
		Humans russian = new Russian();
		russian.display();
		russian.eat();
		russian.wear();
	}

}
