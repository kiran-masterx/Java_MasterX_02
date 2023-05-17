package basic;

public class StringManipulationConcept {

	public static void main(String[] args) {
		String s = "Hi, I am QA and I do Automation.";
		
		//1. Length of string
		System.out.println("length of the string is: " + s.length());
		
		//2. Get the character at 10th position: 
		//The index of the string will start from 0. 
		System.out.println("getting the char at specific postion: " + s.charAt(0));
		System.out.println("getting the char at specific postion: " + s.charAt(4));
		System.out.println("getting the char at specific postion: " + s.charAt(10));
		
		//3. Getting the index of nth char. 
		//It will consider the letters based on the case
		System.out.println("Getting the index of first 'i': " + s.indexOf('i'));
		System.out.println("Getting the index of 't': " + s.indexOf('t'));
		System.out.println("Getting the index of 'A': " + s.indexOf('A'));
		System.out.println("Getting the index of 'a': " + s.indexOf('a'));
		
		//4. Ignore the first 'A' and get the index of next char 'A'.
		System.out.println("getting the index of second char by ignoring the first: " + s.indexOf('A', 11));
		System.out.println("getting the index of second char by ignoring the first: " + s.indexOf('a', 10));
		
		String s1 = "Hello.";
		String s2 = "hello.";
		System.out.println(s1.length());
		
		//5. Index of a word
		System.out.println("getting index of a word: "+ s.indexOf("QA"));
		System.out.println("getting index of a word: "+ s.indexOf("Automation"));
		
		//6. Comparing two strings: If matches then give true, otherwise gives false
		System.out.println(s1.equals(s2));  // It means exactly equals
		System.out.println(s1.equalsIgnoreCase(s2)); // It means lower case letters should be equal. 
		//It first convert into the lower case then will check it is equal or not
		
		String p = "Hi, I am QA and I do Automation.";
		//7. Sub-Strings : Small part of the string
		String p1 = p.substring(16);
		System.out.println(p1);
		
		String p2 = p.substring(9, 20);
		System.out.println(p2);
	
		//8. trim(): removing unwanted blank spaces from string from starting and ending
		String q = "   TESTING   ";
		String q1 = "                    Testing ";
		System.out.println("Matching q and q1: " + q.equals(q1));
		String a = q.trim();
		String b = q1.trim();
		System.out.println(q + ":" + q1);
		System.out.println(a + ":" + b);
		System.out.println("Matching a and b: " + a.equalsIgnoreCase(b));
		
		//9. replace(): It will replace the particular char to another from string
		String d = "31/09/2003";
		System.out.println(d.replace("/", "-"));
		System.out.println(d.replace("/", ":"));
		String n = p.replace("QA and", "Tester");
		System.out.println(n);
		
	}

}
