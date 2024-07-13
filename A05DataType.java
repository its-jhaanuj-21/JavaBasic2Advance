public class A05DataType {
    public static void main(String[] args) {

        /*
         * 2 types :
         * Primitive : byte, short, int, long, float, double, char, boolean (8 Primitive
         * data type)
         * Non-Primitive : class, interface, array, string, etc....
         *
         * Syntax: DataType VariableName = Data (Value/Literal)
         * 
         * Numeric Data Type:
         * Integer Data type : by defalut int type
         * byte : 1 Byte = 8 bit => -2^(8-1) to (2^(8-1))-1 => -128 to 127
         * short : 2 Byte = 16 bit => -2^(16-1) to (2^(16-1))-1 => -32768 to 32767
         * int : 4 Byte = 32 bit => -2^32-1 to (2^32-1)-1 => -2147483648 to 2147483647
         * long : 8 Byte = 64 bit => -2^64-1 to (2^64-1)-1 => -9223372036854775808 to
         * 9223372036854775807
         * 
         * Real/Floating Data Type : by default double type
         * float : 4 Bytes = 32 bits
         * double : 8 Bytes = 64 bits
         * 
         * logical data type:
         * boolean : size of a boolean primitive type is not explicitly defined in terms
         * of bytes. The boolean type represents one of two values: true or false.
         * However, the actual size in memory can vary based on the JVM
         * implementation.
         * 
         * Character Data Type: Store Unicode UTF
         * char : 2 Bytes = 16 bit
         * 
         */

        // byte:
        byte byteNum1 = -128;
        byte byteNum2 = 127;
        // byte byteNum3 = -129; // Error: Type mismatch: cannot convert from int to
        // byte
        // Note : By default every integer type number is of 'int' type.
        System.out.println(byteNum1);  // -128
        System.out.println(byteNum2);  // 127
        System.out.println(((Object) byteNum1).getClass().getSimpleName()); // Return the data type of variable
        // Object class is the superclass of All classes in java
        System.out.println(Byte.SIZE); // Return size in bits
        System.out.println(Byte.BYTES); // Return Size in Bytes
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.TYPE);

        // short:
        short shortNum1 = -32768;
        short shortNum2 = 32767;
        // short shortNum3 = 327679; // Error: Type mismatch: cannot convert from int to
        // short
        System.out.println(shortNum1);
        System.out.println(shortNum2);
        System.out.println(((Object) shortNum1).getClass().getSimpleName());
        System.out.println(Short.SIZE);
        System.out.println(Short.BYTES);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        // int:
        int intNum1 = -2147483648;
        int intNum2 = 2147483647;
        // int intNum3 = 2147483648; // Error: The literal 2147483648 of type int is out
        // of range
        System.out.println(intNum1);
        System.out.println(intNum2);
        System.out.println(((Object) intNum1).getClass().getSimpleName());
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // long:
        long longNum1 = -5456564651l;
        long longNum2 = 546564651L;
        // long longNum3 = 4546546579; //Error: The literal 45465465465 of type int is
        // out of range
        // If we not use l/L as sufix it will treat literal as int type.
        // long longNum3 = -9223372036854775809l; // Error: The literal
        // 9223372036854775809l of type long is out of range
        System.out.println(longNum1);
        System.out.println(longNum2);
        System.out.println(((Object) longNum1).getClass().getSimpleName());
        System.out.println(Long.SIZE);
        System.out.println(Long.BYTES);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // ******************************************************************/
        // Note : Result of expression of byte or short is int type.
        byte a = 10;
        byte b = 20;
        // byte c = a+b; // Error : Type mismatch: cannot convert from int to byte
        System.out.println(((Object) (a + b)).getClass().getSimpleName()); // Integer
        int c = a + b;

        //--------------------------------------------------------------------
        byte n1 = 34;
        short n2 = 23;
        // short sum = n1+n2;    // TypeMishmatched Error : cannot convert from int to short
        int sum = n1+n2;  // short + byte --> return int  (implicite type conversion)
        System.out.println(((Object)sum).getClass().getSimpleName());

        
        byte s1 = 23;
        short s2 = 33;
        int s3 = 78;
        long s4 = 999;
        // int sum2  = s1+s2+s3+s4;  // TypeMishmatched Error : cannot convert from long to int
        long sum2  = s1+s2+s3+s4;  // short+byte+int+long => long
        System.out.println(((Object)sum2).getClass().getSimpleName());

        //--------------------------------------------------------------------

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
         */



        // ------------------------------------------------------------------------------

        // float:

        // float floatNum1 = 34.87; // Error: Type mismatch: cannot convert from double
        // to float
        // By default floating values are of double type and double can't store in float
        // coz double > float
        // use f/F as suffix to store float data type
        float floatNum2 = 454.56f;
        System.out.println(floatNum2);
        System.out.println(((Object) floatNum2).getClass().getSimpleName());
        System.out.println(Float.SIZE);
        System.out.println(Float.BYTES);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.TYPE);

        // double
        double doubleNum1 = 48754.838;
        System.out.println(doubleNum1);
        System.out.println(((Object) doubleNum1).getClass().getSimpleName());
        System.out.println(Double.SIZE);
        System.out.println(Double.BYTES);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.TYPE);

        //-------------------------------------------------------------

        int intval = 55;
        float fval = 5.0f;
        long lval = 1200;
        float sum3 = intval+fval+lval;     // float
        System.out.println(sum3);
        System.out.println(((Object)sum3).getClass().getSimpleName());



        // -------------------------------------------------------------

        // boolean
        boolean bool1 = false;
        boolean bool2 = true;
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(((Object) bool1).getClass().getSimpleName());
        System.out.println(Boolean.TYPE);

        // -------------------------------------------------------------

        // character:

        char ch = 'A';
        System.out.println(ch);
        System.out.println(((Object) ch).getClass().getSimpleName());
        System.out.println(Character.SIZE);
        System.out.println(Character.BYTES);
        System.out.println(Character.MIN_VALUE); // blank space " "
        System.out.println(Character.MAX_VALUE); // ?


        //-------------------------------------------------------------

        char c1 = 'A';   // 65
        int abcd = 1;
        System.out.println(c1);
        System.out.println(c1+abcd);
        System.out.println(((Object)(c1+abcd)).getClass().getSimpleName()); // return INT
        //-------------------------------------------------------------

    }
}
