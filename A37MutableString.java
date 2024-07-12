public class A37MutableString {
    public static void main(String[] args) {
        
        /*   
         * Two types of Mutable String: 
         * Once if we create a String, on that String if we try to perform any operation 
         * and if those changes get reflected in the same object then such strings 
         * are called "Mutable String"
         * 
         * 1. StringBuffer   2. StringBuiilder
         * 
         * If the string needs to be thread-safe and we wish to operate 
         * in a multithreading environment, we should use the StringBuffer class. 
         * On the other hand, StringBuilder is not necessary if we don't want a multithreading environment 
         * However, if speed is our top priority, StringBuilder outperforms StringBuffer in terms of speed.
         * 
         * 
         *  
         * 
         */

        StringBuffer sb1  = new StringBuffer("Hello");
        System.out.println(sb1);
        sb1.append(" World");    // No new object will be cretaed: changes occure in the same object (String)
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Virat ");
        sb2.append("Kohli");
        System.out.println(sb2);



    }
}
