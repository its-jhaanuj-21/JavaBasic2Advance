public class A04Variables {
    public static void main(String[] args) {
        
        /*
         * Variables are the storage location in memory.
         * 
         * Syntax:  DataType VariableName = Value 
         */
         
        int num1 = 10;
        int num2 = 20;
        int age = 23;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(age);

         /* Varible is defined only once, we cannot 
         * define multiple varible of same name. 
         * But, 
         * we can assine different value to variable.
         */

        int num3 = 10;
        // int num3 = 20; //Error: variable num3 is already defined 
        num3= 20;
        System.out.println(num3);

        // Vriable name should be written in camleCase: Each word begin with capital leter 
        String firstName = "Anuj";



        
    }
}
