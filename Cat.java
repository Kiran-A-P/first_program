package com.psl.training;

public class Cat extends Animal implements Flyable {

	 

		//@override
		public void move(){
	  System.out.println("cat moves");

	}
		
		public void MakeNoise()
		{
			System.out.println("cat makes noise");
		}

		public void Fly(){
			System.out.println("cat flys");
		}

}
