package Day7;

public class WrapperClasses {

	public static void main(String[] args) {
		
		byte b = 10;             
        Byte B = new Byte(b);
        System.out.println(B);
 
        short s = 15;           
        Short S = new Short(s); 
        System.out.println(S);
 
        int i = 20;                  
        Integer I = new Integer(i);
        System.out.println(I);
 
        long l = 25;            
        Long L = new Long(l);
        System.out.println(L);
        
        float f = 12.55f;            
        Float F = new Float(f); 
        System.out.println(F);
 
        double d = 18.58;          
        Double D = new Double(d);
        System.out.println(D);
 
        boolean bln = true;               
        Boolean BLN = new Boolean(bln);
        System.out.println(BLN);
 
        char c = 'C';                     
        Character C = new Character(c);   
        System.out.println(C);
		
	}

}
