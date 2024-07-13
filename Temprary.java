public class Temprary {
    public static void main(String[] args) {
        System.out.println(23); // int 
        byte abc = (byte)128;   //-128 to 127
        System.out.println(abc);

        byte n1 = 34;
        short n2 = 23;
        // short sum = n1+n2;    // TypeMishmatched Error : cannot convert from int to short
        int sum = n1+n2;  // short + byte --> return int   (implicite type conversion)
        System.out.println(((Object)sum).getClass().getSimpleName());


        byte s1 = 23;
        short s2 = 33;
        int s3 = 78;
        long s4 = 999;
        // int sum2  = s1+s2+s3+s4;  // TypeMishmatched Error : cannot convert from long to int
        long sum2  = s1+s2+s3+s4;  // short+byte+int+long => long
        System.out.println(((Object)sum2).getClass().getSimpleName());
        
        
        
        
        /*
        *   short +  byte   -> int 
        *   byte + byte  -> int 
        *   short + short  -> int 
        *   int + int -> int 
        *   int + short  -> int 
        *   short + long  -> long
        *   int + short + long -> long
        * 
        * 
        * 
        * 
        */
        
        
        
        float fnum1 = 23.25f;
        float fnum2 = (float)23.25;

        int intval = 55;
        float fval = 5.0f;
        long lval = 1200;
        float sum3 = intval+fval+lval;
        System.out.println(sum3);
        System.out.println(((Object)sum3).getClass().getSimpleName());
        
        
        
        
        char c = 'A';   // 65
        int abcd = 1;
        System.out.println(c);
        System.out.println(c+abcd);
        System.out.println(((Object)(c+abcd)).getClass().getSimpleName()); // return INT

  
        // BYTE : -128  to 127  singed data type 
        // CHAR :  Always +ve  " "  ---------->  ?   unsigend data type
        // Short : -32768  to  32767 


        short sdata; 
        char cdata = ' ';
        sdata = (short)cdata;
        System.out.println(sdata);








        
    }
}
