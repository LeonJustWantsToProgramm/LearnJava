package schleifenUndArrays;

public class WhileSchleifeMitArray {

	public static void main(String[] args) {
		
		int [] countdown = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int Zahl = 0;
		
		while(Zahl < countdown.length) {
			System.out.println(countdown[Zahl]);
			Zahl++;
		}
		System.out.println("hoffentlich funktioniert das...");
	}
}
