package com.app.design.childs;

import com.app.behaviours.EatingBehaviour;
import com.app.behaviours.WearingBehaviour;
import com.app.behaviours.childs.LongDress;
import com.app.behaviours.childs.NonVegitarian;
import com.app.design.Humans;

public class Chinese extends Humans{

	EatingBehaviour eatingBehaviour;
	WearingBehaviour wearingBehaviour;
	
	public Chinese() {
		eatingBehaviour = new NonVegitarian();
		wearingBehaviour = new LongDress();
	}
	
	@Override
	public void display() {
		System.out.println("I am a chinese");
	}

	@Override
	public void eat() {
		eatingBehaviour.eat();
	}

	@Override
	public void wear() {
		wearingBehaviour.dress();
	}

	
	
}
