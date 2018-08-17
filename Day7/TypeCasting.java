package Day7;

public class TypeCasting {

	public static void main(String[] args) {
	
		Float F = new Float("23.56");
        int i = F.intValue();
        System.out.println(i);
        
        Short S = new Short("23");
       float a = S.floatValue();
        System.out.println(a);
        
        Float  B= new Float("23.56");
       double d = B.floatValue();
        System.out.println(d);
        
        Integer I = new Integer("56");
       float m = I.floatValue();
        System.out.println(m);

	}

}
