import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class D10_Regex {
	
	// # Á¤±Ô Ç¥Çö½Ä (Regular Expression)
	//	- ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â Ç¥Çö½Ä
	//	- ÇØ´ç ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´Â ¹®ÀÚ¿­À» °Ë»öÇÒ ¼ö ÀÖ´Ù
	
	// # Pattern Å¬·¡½º
	//	- Á¤±Ô Ç¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º
	
	// # Matcher Å¬·¡½º
	//	- ÆĞÅÏÀ» ÀÌ¿ëÇÏ¿© ´ë»ó ¹®ÀÚ¿­À» °Ë»öÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º
	
	
	public static void main(String[] args) {
		
		// [] : ÇØ´ç À§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã ¼ö ÀÖ´ÂÁö Á¤ÀÇÇÑ´Ù
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "saeep"));
		
		
		// []³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Íµé
		// 1. abc  : abc¸¸ Çã¿ë
		// 2. ^abc : abc¸¦ Á¦¿ÜÇÑ ¸ğµÎ¸¦ Çã¿ë
		// 3. a-z  : aºÎÅÍ z±îÁö Çã¿ë
		// 4. &&   : ±³ÁıÇÕ
		
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sZeep"));
		System.out.println(Pattern.matches("s[aeiou]eep", "sfeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		// # ¿©·¯¹®ÀÚ¸¦ °£´ÜÇÏ°Ô Ç¥ÇöÇÏ´Â °Íµé
		// 1.   .   : ÇØ´ç ÀÚ¸®¿¡ ¸ğµç ¹®ÀÚ¸¦ Çã¿ë - ¡Ø []¹Û¿¡ ½á¾ßÇÔ 
		// 2.  \d   : ÇØ´ç ÀÚ¸®¿¡ ¼ıÀÚµéÀ» Çã¿ë 
		// 3.  \D   : ÇØ´ç ÀÚ¸®¿¡ ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		// 4.  \s   : ÇØ´ç ÀÚ¸®¿¡ °ø¹éÀ» Çã¿ë
		// 5.  \S   : ÇØ´çÀÚ¸®¿¡ °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		// 6.  \w   : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë [a-zA-Z_0-9]
		// 7.  \W   : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		
		System.out.println(Pattern.matches("s.eep", "s$eep"));
		System.out.println(Pattern.matches("s...p", "sxxxp"));
		System.out.println(Pattern.matches("s\\deep", "s1eep"));
		System.out.println(Pattern.matches("s\\Deep", "sÇÑeep"));
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\Seep", "s0eep"));
		System.out.println(Pattern.matches("\\S\\S\\S\\S\\S", "g%s2g"));
		System.out.println(Pattern.matches("..[\\d]..", "sg4sp"));
		
		// # ÇØ´ç ÆĞÅÏÀÌ Àû¿ëµÉ ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇÇÏ´Â ¹æ¹ı
		// 1. Ex{n}   : ¾Õ¿¡ ÀÖ´Â ÆĞÅÏÀÌ n±ÛÀÚ Àû¿ëµÈ´Ù
		// 2. Ex{n,m} : ¾Õ¿¡ ÀÖ´Â ÆĞÅÏÀÌ ÃÖ¼Ò n±ÛÀÚ ÀÌ»ó ÃÖ´ë m±ÛÀÚ ÀÏÄ¡ÇØ¾ßÇÔ
		// 3. Ex{n,}  : n±ÛÀÚ ÀÌ»ó ÀÏÄ¡ÇØ¾ßÇÔ
		// 4. Ex?     : ÇÑ¹ø È¤Àº 0¹ø
		// 5. Ex+     : ÃÖ¼Ò ÇÑ¹øÀÌ»ó
		// 6. Ex*     : 0¹ø È¤Àº ¿©·¯¹ø
		
		System.out.println(Pattern.matches("....[\\d]{4}", "sgsp1234"));
		System.out.println(Pattern.matches("[\\w]{2,12}", "aaaaaa"));
		System.out.println("À¯È¿ÇÑ ¾ÆÀÌµğ : " +
		Pattern.matches("[\\w°¡-ÆR] {2}", "ilililllilli"));
		
		String email = "abc@gamil.com";
		System.out.println("ÀÌ¸ŞÀÏ ÆĞÅÏ : " +
				Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		
		// # Pattern.matches(regex, str)
		//	- Àü´ŞÇÑ ¹®ÀÚ¿­ÀÌ Á¤±ÔÇ¥Çö½Ä°ú ÀÏÄ¡ÇÏ¸é true
		
		// # Pattern.compile(regex)
		//	- Àü´ŞÇÑ Á¤±Ô Ç¥Çö½ÄÀ» ÀÌ¿ëÇØ »ı¼ºÇÑ ÀÎ½ºÅÏ½º¸¦ ¹İÈ¯ÇÑ´Ù
		Pattern email_regex = Pattern.compile("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+");
		
		Pattern split_regex = Pattern.compile("/");
		
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # java.util.regex.Matcher
		//	- ¹®ÀÚ¿­À» Ã³À½ºÎÅÍ ³¡±îÁö °Ë»çÇÏ¸é¼­
		//	  ÇØ´ç Á¤±ÔÇ¥Çö½Ä°ú ÀÏÄ¡ÇÏ´Â ÀÎµ¦½º¸¦ Ã£Àº °á°ú
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		
		// find : Á¤±ÔÇ¥Çö½ÄÀ» ÅëÇØ Ã£Àº°ÍÀÌ ÀÖÀ¸¸é true
		while (matcher.find()) {
			System.out.println("Ã£Àº °Í : " + matcher.group());
			System.out.println(matcher.start() + " to " + matcher.end());
		}
		
		
		
	}

}
