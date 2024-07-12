public class A12Loop {
    public static void main(String[] args) {

        /*
         * There are 3 types of Loop
         * 1. For loop 
         * 2. While Loop : execute if while condition return true
         * 3. Do while loop : execute one time then check while condition 
         * 
         */

        //---------------------------------------------------------
        // For loop 

        for(int i=0; i<10; i++){
            System.out.print("* ");  // Will print 10 times
        }

        System.out.println();
        
        for(int i = 1; i<=10; i++){
            System.out.print(i + " ");
        }
        System.out.println("");



        //----------------------------------------------------
        // while loop 

        int i = 0; 
        while(i<10){
            System.out.print("+ ");
            i++;
        }

        System.out.println();
        int j = 1;
        while (j<=10){
            System.out.println(j);
            j++;
        }


        //--------------------------------------------------
        // do while

        int i1 = 0;
        do{
            System.out.print("*");
            i1++;
        }while(i1<10);

    }
}
