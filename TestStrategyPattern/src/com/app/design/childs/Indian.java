package com.app.design.childs;

import com.app.behaviours.EatingBehaviour;
import com.app.behaviours.WearingBehaviour;
import com.app.behaviours.childs.LongDress;
import com.app.behaviours.childs.Vegetarian;
import com.app.design.Humans;

public class Indian extends Humans{
	
	private EatingBehaviour eatingBehaviour;
	
	private WearingBehaviour wearingBehaviour;
	
	public Indian() {
		this.eatingBehaviour = new Vegetarian();
		this.wearingBehaviour = new LongDress();
	}

	@Override
	public void display() {
		System.out.println("I m an indian");
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
