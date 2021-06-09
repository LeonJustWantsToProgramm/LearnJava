package GeneratorsAndValidators;

public class RandomNumbersGenerator {

	public static void main(String[] args) {
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
	}

	
	int randomWithRange(int min, int max){   //defining method for a random number generator
			
			int range = (max - min) + 1;
			return (int)(Math.random() * range) + min;
		}
			
		static RandomNumbersGenerator randomNumbers1 = new RandomNumbersGenerator(); 
		static int rand1 = randomNumbers1.randomWithRange(111111, 999999); 

		
		static RandomNumbersGenerator randomNumbers2 = new RandomNumbersGenerator(); 
		static int rand2 = randomNumbers2.randomWithRange(1, 6);

		
		static RandomNumbersGenerator randomNumbers3 = new RandomNumbersGenerator();
		static int rand3 = randomNumbers3.randomWithRange(2, 4);

}
