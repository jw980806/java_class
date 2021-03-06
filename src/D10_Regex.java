import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class D10_Regex {
	
	// # 정규 표현식 (Regular Expression)
	//	- 문자열의 패턴을 표현하는 표현식
	//	- 해당 패턴과 일치하는 문자열을 검색할 수 있다
	
	// # Pattern 클래스
	//	- 정규 표현식을 다루는 클래스
	
	// # Matcher 클래스
	//	- 패턴을 이용하여 대상 문자열을 검색할 때 사용하는 클래스
	
	
	public static void main(String[] args) {
		
		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의한다
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "saeep"));
		
		
		// []내부에 정의할 수 있는 것들
		// 1. abc  : abc만 허용
		// 2. ^abc : abc를 제외한 모두를 허용
		// 3. a-z  : a부터 z까지 허용
		// 4. &&   : 교집합
		
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sZeep"));
		System.out.println(Pattern.matches("s[aeiou]eep", "sfeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		// # 여러문자를 간단하게 표현하는 것들
		// 1.   .   : 해당 자리에 모든 문자를 허용 - ※ []밖에 써야함 
		// 2.  \d   : 해당 자리에 숫자들을 허용 
		// 3.  \D   : 해당 자리에 숫자를 제외한 모든것을 허용
		// 4.  \s   : 해당 자리에 공백을 허용
		// 5.  \S   : 해당자리에 공백을 제외한 모든것을 허용
		// 6.  \w   : 일반적인 문자들을 허용 [a-zA-Z_0-9]
		// 7.  \W   : 일반적인 문자들을 제외한 모든것을 허용
		
		System.out.println(Pattern.matches("s.eep", "s$eep"));
		System.out.println(Pattern.matches("s...p", "sxxxp"));
		System.out.println(Pattern.matches("s\\deep", "s1eep"));
		System.out.println(Pattern.matches("s\\Deep", "s한eep"));
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\Seep", "s0eep"));
		System.out.println(Pattern.matches("\\S\\S\\S\\S\\S", "g%s2g"));
		System.out.println(Pattern.matches("..[\\d]..", "sg4sp"));
		
		// # 해당 패턴이 적용될 문자의 개수를 정의하는 방법
		// 1. Ex{n}   : 앞에 있는 패턴이 n글자 적용된다
		// 2. Ex{n,m} : 앞에 있는 패턴이 최소 n글자 이상 최대 m글자 일치해야함
		// 3. Ex{n,}  : n글자 이상 일치해야함
		// 4. Ex?     : 한번 혹은 0번
		// 5. Ex+     : 최소 한번이상
		// 6. Ex*     : 0번 혹은 여러번
		
		System.out.println(Pattern.matches("....[\\d]{4}", "sgsp1234"));
		System.out.println(Pattern.matches("[\\w]{2,12}", "aaaaaa"));
		System.out.println("유효한 아이디 : " +
		Pattern.matches("[\\w가-힣] {2}", "ilililllilli"));
		
		String email = "abc@gamil.com";
		System.out.println("이메일 패턴 : " +
				Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		
		// # Pattern.matches(regex, str)
		//	- 전달한 문자열이 정규표현식과 일치하면 true
		
		// # Pattern.compile(regex)
		//	- 전달한 정규 표현식을 이용해 생성한 인스턴스를 반환한다
		Pattern email_regex = Pattern.compile("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+");
		
		Pattern split_regex = Pattern.compile("/");
		
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # java.util.regex.Matcher
		//	- 문자열을 처음부터 끝까지 검사하면서
		//	  해당 정규표현식과 일치하는 인덱스를 찾은 결과
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		
		// find : 정규표현식을 통해 찾은것이 있으면 true
		while (matcher.find()) {
			System.out.println("찾은 것 : " + matcher.group());
			System.out.println(matcher.start() + " to " + matcher.end());
		}
		
		
		
	}

}
