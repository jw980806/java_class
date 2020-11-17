package quiz;

import java.util.Scanner;

public class B05_CheckWord {

	// 사용자로부터 단어를 하나 입력받고 
	// 첫번째 단어와 마지막 단어가 일치하면 "OK"를 출력
	// 아니라면 "NOT OK"를 출력해보세요
	
	public static void main(String[] args) {
		
		System.out.println("단어를 입력해주세요");
		String word = new Scanner(System.in).next();
		int end = word.length()-1;
		//System.out.println(end);
		if (word.charAt(0) == word.charAt(end))
			System.out.println("OK");
		else
			System.out.println("NOT OK");

	}

}
