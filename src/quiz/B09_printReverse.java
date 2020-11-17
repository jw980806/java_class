package quiz;

import java.util.Scanner;

// 사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요

public class B09_printReverse {

	public static void main(String[] args) {
		
		System.out.println("문장을 입력해주세요");
		String str = new Scanner(System.in).nextLine();
		String reverse = "";
		for(int i = str.length() -1; i >= 0; i--) {
			reverse += str.charAt(i);
		}System.out.println(reverse);
		
		StringBuffer sb = new StringBuffer();
		System.out.println("\n\n문장을 입력해주세요2");
		String str2 = new Scanner(System.in).nextLine();
		sb.append(str2);
		System.out.println(sb.reverse());
		
		// StringBuffer는 += 대신 append사용
		StringBuilder str3 = new StringBuilder("heelo");
		str3.append(", world!");
		
		//다만들고 앙 뒤에 String 으로 변환해서 사용
		String build_result = str.toString();
		System.out.println(build_result);
		
		
	}
}
