package Day7;

public class StringLength {

	public static void main(String[] args) {
		
		String s= new String();
		System.out.println("length of s is :"+s.length());
		
		
		char[] chars ={'j','a','v','a'};
		String s1 =new String(chars);
		System.out.println("length of char 'j','a','v','a' is :"+s1.length());
		
		
		String s2 = new String(s1+"J2EE");       
        System.out.println(s2.length());       
 
        //Using String.length() method 
 
        System.out.println("abc".length());        
 
        System.out.println("123456".length());     
 
        System.out.println("A".length());

	}

}
