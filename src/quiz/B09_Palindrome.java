package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	// 사용자로부터 단어를 하나 입력받고
	// 해당 단어가 회문이라면 "PALINDROME"을 출력
	// 회문이 아니라면 "NOT PALINDROME"을 출력해보세요
	
	// ※ 대칭이 되는 단어를 뜻함
	
	public static void main(String[] args) {
		System.out.println("영어를 입력하세요 > ");
		String word = new Scanner(System.in).next();
		//for문으로 풀어야함
		int end = word.length()-1;
		for(int i= 0; i < word.length();i++) {
			if(word.charAt(i) != word.charAt(end)) {
				System.out.println("NOT PALINDROME");
				break;
			}else if (i >= end/2) {
				System.out.println("PALINDROME");
				break;
			}
			else
				end--;
		}
		
		//////////////////////////////////////////////////
		
		boolean palin = true;
		for(int i = 0, len = word.length(); i < len/2; ++i) {
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(len - 1 - i);
			
			if (ch1 != ch2) {
				palin = false;
			}
		}
		if (palin) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		
		////////////////////////////////////////////////
		
		StringBuilder strb = new StringBuilder(word);
		String reverse = strb.reverse().toString(); // 여태까지 빌드한 문자열을 뒤집어 준다
		
		int half = word.length() /2;
		boolean palin2 = true;
		for(int i = 0; i < half; ++i) {
			if(word.charAt(i) != reverse.charAt(i)) {
				palin2 = false;
				break;
			}
		}
		System.out.println(palin2? "PALINDROME":"NOT PALINDROME");
		
		
		
		
	}
}
