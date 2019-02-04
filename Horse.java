package com.psl.training;

public class Horse extends Animal implements Flyable {
	
	public void move(){
	System.out.println("horse can move");
	}
	
	public void Fly(){
		System.out.println("horse is flying");
	}

}
