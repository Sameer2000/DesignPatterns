package com.app.behaviours.childs;

import com.app.behaviours.EatingBehaviour;

public class NonVegitarian implements EatingBehaviour {

	@Override
	public void eat() {
		System.out.println("I m a Non - vegetarian");
	}

	
}
