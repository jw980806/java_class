import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class D10_Regex {
	
	// # ���� ǥ���� (Regular Expression)
	//	- ���ڿ��� ������ ǥ���ϴ� ǥ����
	//	- �ش� ���ϰ� ��ġ�ϴ� ���ڿ��� �˻��� �� �ִ�
	
	// # Pattern Ŭ����
	//	- ���� ǥ������ �ٷ�� Ŭ����
	
	// # Matcher Ŭ����
	//	- ������ �̿��Ͽ� ��� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	
	
	public static void main(String[] args) {
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����Ѵ�
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "saeep"));
		
		
		// []���ο� ������ �� �ִ� �͵�
		// 1. abc  : abc�� ���
		// 2. ^abc : abc�� ������ ��θ� ���
		// 3. a-z  : a���� z���� ���
		// 4. &&   : ������
		
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sZeep"));
		System.out.println(Pattern.matches("s[aeiou]eep", "sfeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		// # �������ڸ� �����ϰ� ǥ���ϴ� �͵�
		// 1.   .   : �ش� �ڸ��� ��� ���ڸ� ��� - �� []�ۿ� ����� 
		// 2.  \d   : �ش� �ڸ��� ���ڵ��� ��� 
		// 3.  \D   : �ش� �ڸ��� ���ڸ� ������ ������ ���
		// 4.  \s   : �ش� �ڸ��� ������ ���
		// 5.  \S   : �ش��ڸ��� ������ ������ ������ ���
		// 6.  \w   : �Ϲ����� ���ڵ��� ��� [a-zA-Z_0-9]
		// 7.  \W   : �Ϲ����� ���ڵ��� ������ ������ ���
		
		System.out.println(Pattern.matches("s.eep", "s$eep"));
		System.out.println(Pattern.matches("s...p", "sxxxp"));
		System.out.println(Pattern.matches("s\\deep", "s1eep"));
		System.out.println(Pattern.matches("s\\Deep", "s��eep"));
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\Seep", "s0eep"));
		System.out.println(Pattern.matches("\\S\\S\\S\\S\\S", "g%s2g"));
		System.out.println(Pattern.matches("..[\\d]..", "sg4sp"));
		
		// # �ش� ������ ����� ������ ������ �����ϴ� ���
		// 1. Ex{n}   : �տ� �ִ� ������ n���� ����ȴ�
		// 2. Ex{n,m} : �տ� �ִ� ������ �ּ� n���� �̻� �ִ� m���� ��ġ�ؾ���
		// 3. Ex{n,}  : n���� �̻� ��ġ�ؾ���
		// 4. Ex?     : �ѹ� Ȥ�� 0��
		// 5. Ex+     : �ּ� �ѹ��̻�
		// 6. Ex*     : 0�� Ȥ�� ������
		
		System.out.println(Pattern.matches("....[\\d]{4}", "sgsp1234"));
		System.out.println(Pattern.matches("[\\w]{2,12}", "aaaaaa"));
		System.out.println("��ȿ�� ���̵� : " +
		Pattern.matches("[\\w��-�R] {2}", "ilililllilli"));
		
		String email = "abc@gamil.com";
		System.out.println("�̸��� ���� : " +
				Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		
		// # Pattern.matches(regex, str)
		//	- ������ ���ڿ��� ����ǥ���İ� ��ġ�ϸ� true
		
		// # Pattern.compile(regex)
		//	- ������ ���� ǥ������ �̿��� ������ �ν��Ͻ��� ��ȯ�Ѵ�
		Pattern email_regex = Pattern.compile("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+");
		
		Pattern split_regex = Pattern.compile("/");
		
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # java.util.regex.Matcher
		//	- ���ڿ��� ó������ ������ �˻��ϸ鼭
		//	  �ش� ����ǥ���İ� ��ġ�ϴ� �ε����� ã�� ���
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		
		// find : ����ǥ������ ���� ã������ ������ true
		while (matcher.find()) {
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println(matcher.start() + " to " + matcher.end());
		}
		
		
		
	}

}
