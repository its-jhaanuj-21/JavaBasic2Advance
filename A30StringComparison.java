public class A30StringComparison {
    public static void main(String[] args) {
        
        /*
         *  Two ways to compare String :
         *  == oerator  : Compare refrences 
         *  equals()    : Compare value 
         */
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s1==s2);        // false
        System.out.println(s1.equals(s2)); // true 


        String st1 = "Helloworld";
        String st2 = "Helloworld";
        String st3 = "HelloWorld";

        System.out.println(st1==st2);    // true
        System.out.println(st1==st3);    // false
        System.out.println(st1.equals(st2));  // true
        System.out.println(st1.equals(st3));  // false

    }
}
