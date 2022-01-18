package wrapper;

public class wrapper {

	public static void main(String[] args) {
        int a=10;
        Integer b= a; //Auto boxing   Primitive data type to wrapper class.
        Integer b1= Integer.valueOf(a); //Boxing
                  //Integer.parseInt(null)--return string to int
        
        
        Integer a1=100;  
        int i=a1.intValue();//converting Integer to int explicitly    ----unboxing
        int j=a1;// auto unboxing, now compiler will write a.intValue() internally    
        

	}

}
