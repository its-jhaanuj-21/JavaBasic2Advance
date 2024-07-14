import java.util.Scanner;

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


        System.out.println(12%2);
        System.out.println(12%5);

        System.out.println( 1 % 5 );
        System.out.println( 2 % 5 );
        System.out.println( 3 % 5 );
        System.out.println( 4 % 5 );
        System.out.println( 5 % 5 );
        System.out.println( 6 % 5 );



        int an = 8;
        int bb = an++ + --an + an++;
        //        8   +   8  +  8   
        System.out.println(bb); // 24
        System.out.println(an); // 9


        int x1 = 6;
        int z1 = x1++ - ++x1 + x1++ + --x1;
        //        6   -  8   +  8   +  8  
        System.out.println(z1); // 14
        System.out.println(x1);  // 8

        int x2 = 5;
        int z2 = x2++ + x2++ - --x2 + x2-- - x2++;
        //        5   + 6    -  6   +  6   -  5
        System.out.println(z2); // 6
        System.out.println(x2); // 6


        int u = 3;
        int v = 4;
        int anu = ++u + --v - v++ + --u + ++v + u - v;
        //        
        System.out.println(u);   // 3
        System.out.println(v);   // 5
        System.out.println(anu);  // 10.
        



        int zzz1 = 10;
        zzz1 += 5;
        zzz1 -= 5;
        zzz1 *= 5;
        zzz1 -= 5;
        System.out.println(zzz1); //




        // int age = 18;
        int age = 19 ;
        if(age>=18){
            System.out.println("Adult");
        }
        
        
        int age2 = 16;
        if(age2>=18){
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }

        int age3 = 69;
        if(age3<=12){
            System.out.println("Child");
        } else if (age3>12 && age3<18){
            System.out.println("Teeager");
        } else if (age3>=18 && age3<=30) {
            System.out.println("Adult");
        } else if (age3>30 && age3<=50) {
            System.out.println("Middle Age");
        } else{
            System.out.println("Old");
        }
        

        // WAP to check temp 
        //    1  - 10 -> chilled
        //    11 - 20 -> cold
        //    21 - 30 -> mild 
        //    31 - 40 -> hot
        //    41 - 50 - > very hot
        //    50 >    -> mar hi jaoge bsdke

        int num1 = 10;
        int num2 = 20;

        int res = (num1>num2) ? num1 : num2;
        System.out.println(res + "is greatest");

        String res2 = (num1>num2) ? num1 + "is greatest" : num2 + "is greatest";
        System.out.println(res2);



        int gcdnum1 = 8;
        int gcdnum2 = 6;
        int product = gcdnum1*gcdnum2;

        while(gcdnum2 != 0){
            if(gcdnum1>gcdnum2){
                gcdnum1 = gcdnum1-gcdnum2;
            }else{
                gcdnum2 = gcdnum2-gcdnum1;
            }
        }

        // while(gcdnum2!=0){
        //     int temp = gcdnum2;
        //     gcdnum1 = gcdnum1%gcdnum2;
        // }


        System.out.println("GCD: "+gcdnum1);
        System.out.println("LCM: "+product/gcdnum1);
        /*         
                     n1           n2          while n2!=0
                     8             6           6!=0  True
        n1>n2 -> 8-6=2             6           6!=0  True
        n1<n2 ->     2        6-2= 4           4!=0  True
        n1<n2        2        4-2= 2           2!=0  True
        n1=n2        2        2-2= 0           0!=0  False
               

        lcm = Product of two num / HCF
        
        num1xnum2 = HCFxLCM

         */


         int number_1 = 6;
         int number_2 = 4;

        //  number_1 = number_1 + number_2;  // n1 = 6+4 = 10
        //  number_2 = number_1 - number_2;  // n2 = 10-4 = 6
        //  number_1 = number_1 - number_2;  // n1 = 10-6 = 4
         
         number_1 = number_1 * number_2;  // n1 = 6*4 = 24
         number_2 = number_1 / number_2;  // n2 = 24/4 = 6
         number_1 = number_1 / number_2;  // n1 = 24/6 = 4

         System.out.println("number_1: " + number_1);
         System.out.println("number_2: " + number_2);






        for(int i=1; i<=5; i++){
            System.out.println("Anuj");
        }

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


        for(int i = 1 ; i<=10; i++){    // i = i+1
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        
        for(int i = 2; i<=10; i=i+2){
            System.out.println(i);
        }
        
        System.out.println("--------------------------");
        
        for(int i=10; i>=1; i--){   // i-- => i = i-1
            System.out.println(i);
        }


        for(int i=10; i>=1; i=i-2){
            System.out.println(i);
        }



        System.out.println("------while---------");
        int i = 0;
        while(i<=5){
            System.out.println(i);
            i++;  // i = i+1;
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
        System.out.println();


        System.out.println("-------do-while()-------");

        int i4 = 0;
        do{
            System.out.println(i4);
            i4++;  // i = i+1;
        }while(i4<=5);


        System.out.println("-------Scanner---------");

        Scanner scn =  new Scanner(System.in);
        // System.out.print("Enter Integer: ");
        // int inputInteger1 = scn.nextInt();
        // System.out.println("Inputed Integer: "+inputInteger1);
        
        // System.out.print("Enter float: ");
        // float inputfloat1 = scn.nextFloat();
        // System.out.println("Inputed Float: "+inputfloat1);
        
        // System.out.print("Enter String: ");
        // String inputString = scn.next();   // It doesn't accept white space
        // System.out.println("Inputed String: "+inputString);
        
        // // scn.nextLine();
        
        // System.out.print("Enter String with white space: ");
        // String inputString2 = scn.nextLine();   
        // System.out.println("Inputed String: "+inputString2);
        
        // System.out.print("Enter String: ");
        // String inputString44 = scn.next();   // It doesn't accept white space
        // System.out.println("Inputed String: "+inputString44);

        System.out.println("Enter an integer: ");
        int number = scn.nextInt(); // Reads the integer, but not the newline
        
        scn.nextLine();

        System.out.println("Enter a string: ");
        String text = scn.nextLine(); // Reads the leftover newline
        
        System.out.println("Number: " + number);
        System.out.println("Text: " + text); // text will be empty


        // scn.nextInt();  //-> int
        // scn.nextByte(); //-> byte
        // scn.nextShort(); //-> short
        // scn.nextLong(); //-> long
        // scn.nextFloat(); //-> float
        // scn.nextDouble(); //-> double
        // scn.next();       //-> String without white Space
        // scn.nextLine();   //-> String with white Space
        // scn.nextBoolean(); //-> boolean value
        

        System.out.println("Enter Character: ");
        char ch = scn.next().charAt(0);
        System.out.println(ch);
        
        
        
        





        
    }
}
