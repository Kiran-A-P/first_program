package com.psl.training;

public class GamePanel {

		public void StartGame(Animal... animal){
			for(Animal ani:animal){
				
			
		moveAnimal(ani);
		if(ani instanceof Cat)
		((Cat)ani).MakeNoise();
		
		if(ani instanceof Flyable){
			((Flyable) ani).Fly();
		}
		
		}
		}
		
		void moveAnimal(Animal animal){
			animal.move();
		}

	}


