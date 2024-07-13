public class A04Variables {
    public static void main(String[] args) {
        
        /*
         * Variables are the storage location in memory.
         * 
         * Syntax:  DataType VariableName = Value 
         */
        
        int abc;  // declaration        
        abc = 99;  // assignment 
        System.out.println(abc);  // 99
        abc = 100;  // 99 overwite with 100 in memory
        System.out.println(abc);  // 100
        
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
        // int num3; //Error: variable num3 is already defined 
        num3 = 20;
        System.out.println(num3);

        // Vriable name should be written in camleCase: Each word begin with capital leter 
        String firstName = "Anuj";

        // myName
        // firstName       //  --> camleCase
        // lastName
        // myJobProfileNumber


        /* Rules : for naming variable: 

        1. should not start with number
            121name   xx
            32name xx
        
        2. should not contain whiteSpace 
            first name  xx
            last name  xx

        3. only $ _ are the special character that are allowed


        4. first letter should be either _ , $ , alphabet
            _firstName
            $first_name


        */




        
    }
}
