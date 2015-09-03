package com.app.behaviours.childs;

import com.app.behaviours.EatingBehaviour;

public class Vegetarian implements EatingBehaviour{

	@Override
	public void eat() {
		System.out.println("i am a vegetarian");
	}

	
}
