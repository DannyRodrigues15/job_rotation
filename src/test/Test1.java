package test;

public class Test1 {

	int index = 13;
	int add = 0;
	int k = 0;
	
	public void sum() {
		
		while (k < index) {
			k = k + 1;
			add = add + k;
		}
		
		System.out.println(add);

	}

}
