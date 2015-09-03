package com.app.design.childs;

import com.app.behaviours.EatingBehaviour;
import com.app.behaviours.WearingBehaviour;
import com.app.behaviours.childs.NonVegitarian;
import com.app.behaviours.childs.ShortDress;
import com.app.design.Humans;

public class Russian extends Humans{

	private EatingBehaviour eatingBehaviour;
	
	private WearingBehaviour wearingBehaviour;
	
	public Russian() {
		this.eatingBehaviour = new NonVegitarian();
		this.wearingBehaviour = new ShortDress();
	}
	
	@Override
	public void display() {
		System.out.println("I m a russian");
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
