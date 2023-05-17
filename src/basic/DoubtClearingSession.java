package basic;

public class DoubtClearingSession {

//	public static void main(String[] args) {
//		String a = "Java";
//		String b = "Selenium";
//		String d = " ";
//		String c = a + "\n" + b;
//		System.out.println(a.concat(d).concat(b).concat(c));
//		
//		String a1 = "TEsT   ";
//		String a2 = "tesT";
//	
//		System.out.println(a1.trim().equals(a2));
//		System.out.println(a1.trim().equalsIgnoreCase(a2));

//		String q="Teasting         ";
//	    String q1="     teasting ";
//	    
//	    System.out.println(q.equalsIgnoreCase(q1)); //iska bhi poutput right nahi he
//	    System.out.println(q.equals(q1));
//	    
//	    String a=q.trim();
//	    String b=q1.trim(); 
//	    System.out.println(a.equals(b));
//	    System.out.println(a.equalsIgnoreCase(b));
//	    System.out.println(q+":"+q1);  
//	    System.out.println(a+":"+b);  
//	    
//	    String s = "Hi, I am QA and I do Automation.";
//	    System.out.println(s.indexOf('I'));
//	    System.out.println(s.indexOf('d', 15));
//	    
//	}

	public static void main(String[] args) {
		sum();
		division();
		subtraction();
		car();

	}

	public static void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Result of Sum :" + c);
	}

	public static void division() {
		int d = 50;
		int e = 50;
		int f = d / e;
		System.out.println("Result of division:" + f);
		sum();
	}

	public static void subtraction() {
		int s =40;
		int s1= 30;
		int s2=s-s1;
//		System.out.println("Result of subtracti
	}
	public static void car() {
		String s = "spenderplus";
		String s1 = "Honda";
		int s3 = s.length();
		int s4 = +s1.charAt(2);
//		System.out.println(s3);
//		System.out.println(s4);
		String s5= s.replace("spenderplus","Karisma");
		System.out.println(s5);
		System.out.println(s+"  "+s1+" ");
		System.out.println(s.concat(s5));  
		System.out.println(s5.indexOf('s')); //-1 kas ala
	}
		
	   
		

}
