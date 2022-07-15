package test;

import java.util.Scanner;

public class Test2 {
	
	Integer secondaryNumber = 0;
	Integer mainNumber = 1;
	Integer auxiliaryNumber = null;

	public void fibonacci() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		Integer chosenNumber = scanner.nextInt();
		
		getCalculation(chosenNumber);
		
		scanner.close();
		
	}

	private void getCalculation(Integer chosenNumber) {
		while(mainNumber < chosenNumber) {
			auxiliaryNumber = mainNumber;
			mainNumber = mainNumber + secondaryNumber;
			secondaryNumber = auxiliaryNumber;
			
			if(mainNumber >= chosenNumber) {
				System.out.println(mainNumber);
				
				System.out.println(printResult(chosenNumber));
				
				break;
			}
			
			System.out.print(mainNumber + ", ");
		}
	}

	private String printResult(Integer chosenNumber) {
		if (mainNumber.equals(chosenNumber)) {
			return "O número " + chosenNumber + " pertence a sequência.";
		}
		return "O número " + chosenNumber + " não pertence a sequência.";
	}

}
