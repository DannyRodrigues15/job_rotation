package test;

import java.util.Scanner;

public class Test5 {

	public void reverseWords (){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		
		String word = scanner.next();
        String result = ""; 

        result = getReverse(word, result);
        
        System.out.println(result);
        
        scanner.close();
	}

	private String getReverse(String word, String result) {
		for(int i = word.length() - 1; i >= 0; i--){
            result = result + word.charAt(i);
        }
		return result;
	}

}
