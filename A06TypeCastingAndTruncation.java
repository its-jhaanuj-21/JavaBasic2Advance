public class A06TypeCastingAndTruncation {
    public static void main(String[] args) {
        
        /*
         * Type Casting: 
         * Conversion of one data type to another. 
         * Type casting occure when we assign a value of one primitive data type to another type.
         * 
         * 2 types of type casting: implicit type casting & Explicit type casting
         * 
         * Implicit Type casting: 
         * Automatically occur if we store smaller bits data type to higher bits data type
         * It is also called Numeric type promotion and Widening Casting
         * byte -> short -----> int -> long -> float -> double
         *              char -> int -> long -> float -> double
         * 
         * Explicit Type casting: 
         * Manually converting a large type to a smaller size type of data.
         * It is also called Narrowing Casting.
         * It causes Lossy conversion.
         * 
         * 
         * 
         * 
         */
        

        // Widening Casting :

        byte a=10;   // 2 byte
        char b = 'A'; // 2 byte
        short c = 20;; // 4 byte
        int d = 344;  // 4 byte
        long e = 8378l; // 8 byte
        float f = 4.5f;  // 4 byte
        double g = 76787.87;  // 8 byte

        g = f; // storing float in double
        System.out.println(g);
        f = e; // storing long in float
        System.out.println(f);
        e = d; // storing int in long
        System.out.println(e);
        d = c; // storing short in int
        System.out.println(d);

        /********************************************************** */
        // c = b; // we cannot convert char to short; // This is because char in Java is an unsigned 16-bit data type, while short is a signed 16-bit data type.
        // b = a; // Cannot convert byte to char  // This is because byte is an 8-bit signed data type, while char is a 16-bit unsigned data type.
        /********************************************************* */

        c = a;  // storing byte in short 
        System.out.println(c);

        d = b; // storing char in int : 'char' can only store from 'int', not byte and short.
        System.out.println(d);
        
        //=-----------------------------------------------------------------

        // Narrowing Casting: 

        float f1 = 878.4f;
        int i;
        i = (int)f1; // We explicitly converting float to int 
        System.out.println(i); // 878 : we loss decimal values.
    }
}
