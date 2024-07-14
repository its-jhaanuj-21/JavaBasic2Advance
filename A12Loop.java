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



        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        /*
         * i = 1    i<=5(True)  => Enter into loop
         *     print(i) 1     increase i by 1 =>  i++ => i = 2
         * 
         * i = 2    i<=5(True)  => Enter into loop
         *     print(i) 2     increase i by 1 =>  i++ => i = 3
         * 
         * i = 3    i<=5(True)  => Enter into loop 
         *     print(i) 3     increase i by 1 =>  i++ => i = 4
         * 
         * i = 4    i<=5(True)  => Enter into loop 
         *     print(i) 4     increase i by 1 =>  i++ => i = 5
         * 
         * i = 5    i<=5(True)  => Enter into loop 
         *     print(i) 5     increase i by 1 =>  i++ => i = 6
         * 
         * i = 6    i<=5(False) => Exit the loop 
         * 
         */

         for(int i = 1 ; i<=10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        for(int i = 2; i<=10; i=i+2){
            System.out.println(i);
        }



        for(int i=10; i>=1; i--){
            System.out.println(i);
        }

        for(int i=10; i>=1; i=i-2){
            System.out.println(i);
        }


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

        int i1 = 10;
        while(i1>=1){
            System.out.println(i1);
            i1--;
        }

        int i2 = 1;
        while (i2<=5) {
            System.out.print(i2+" ");          // 1 2 3 4 5
            i2++;
        }


        //--------------------------------------------------
        // do while

        int i3 = 0;
        do{
            System.out.print("*");
            i3++;
        }while(i3<10);

    }
}
