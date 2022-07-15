package test;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	Double sp = 67836.43;
	Double rj = 36678.66;
	Double mg = 29229.88;
	Double es = 27165.48;
	Double others = 19849.53;
	
	String[] acronyms = new String[]{ "sp", "rj", "mg", "es", "others" };
	List<String> listStates = Arrays.asList(acronyms);

	public void regionalPercentage() {
		Double[] values = { sp, rj, mg, es, others };
		
		System.out.println(listStates.get(0));

		Double totalValue = 0.0;

		totalValue = getTotalBillingSum(values, totalValue);

		printResult(values, totalValue);
	}

	private void printResult(Double[] values, Double totalValue) {
		for (int i = 0; i < values.length; i++) {
			Double resultPercentage = getPercentage(values[i], totalValue);
			System.out.println("O percentual de " + listStates.get(i) + " é " + resultPercentage);
		}
	}

	private Double getTotalBillingSum(Double[] values, Double totalValue) {
		for (int i = 0; i < values.length; i++) {
			totalValue = totalValue + values[i];
		}
		return totalValue;
	}

	private Double getPercentage(Double local, Double totalValue) {
		Double sumPercentage = local / totalValue * 100;
		return sumPercentage;
	}

}
