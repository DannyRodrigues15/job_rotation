package test;

import java.util.Scanner;

public class Test3 {

	Scanner scanner = new Scanner(System.in);

	Integer[] month = new Integer[10];

	Integer lowerValue = 0;
	Integer highestValue = 0;
	Integer monthlyAverage = 0;
	Integer dayOfMonthLower = 0;
	Integer dayOfMonthHighest = 0;
	Integer dayOfMonthAverage = 0;

	public void billing() {

		getDailyBilling();

		monthlyAverage = monthlyAverage / month.length;
		
		getAboveAverageBilling();
		printResult();

		scanner.close();
	}


	private void getDailyBilling() {
		for (int i = 0; i < month.length; i++) {
			System.out.println("Faturamento do dia " + (i + 1) + ":");

			month[i] = scanner.nextInt();
			monthlyAverage = monthlyAverage + month[i];

			if (month[i] < lowerValue || lowerValue.equals(0)) {
				lowerValue = month[i];
				dayOfMonthLower = i;
			}

			if (month[i] > highestValue || highestValue.equals(0)) {
				highestValue = month[i];
				dayOfMonthHighest = i;
			}
		}
	}

	private void getAboveAverageBilling() {
		for (int i = 0; i < month.length; i++) {
			if (month[i] > monthlyAverage) {
				dayOfMonthAverage = dayOfMonthAverage + 1;
			}
		}
	}

	private void printResult() {
		System.out.println("Média Mensal: " + monthlyAverage);
		System.out.println("O menor valor foi " + lowerValue + " no dia " + (dayOfMonthLower + 1));
		System.out.println("O maior valor foi " + highestValue + " no dia " + (dayOfMonthHighest + 1));
		System.out.println(
				"o valor de faturamento diário foi superior à média mensal " + dayOfMonthAverage + " dias do mês");
	}
}
