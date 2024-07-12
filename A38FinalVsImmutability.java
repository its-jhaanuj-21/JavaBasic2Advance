public class A38FinalVsImmutability {
    public static void main(String[] args) {
        
        // Basic Final Variable
        final int a = 10;
        // a = 20;  // Error 

        // 
        
        StringBuffer sb = new StringBuffer("Virat");
        sb.append(" Kohli");
        System.out.println(sb);
        sb = new StringBuffer("Sachin");
        System.out.println(sb);
        
        final StringBuffer sb1 = new StringBuffer("Virat");
        sb1.append(" Kohli");
        // sb1 = new StringBuffer("Sachin");  // Error : Trying to change final local variable

        // Note: Final Keyword doesn't affect the immutability of the String. But it affect the reference.



    }
}
