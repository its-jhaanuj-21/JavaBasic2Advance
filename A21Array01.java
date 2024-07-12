/*
 * It refers to index collection of fixed no of homogeneous data elements.
 * Single variable holding multiple values which improves readability of the program.
 * 
 * 3 types of array :
 *   1-D Arrays
 *   Multidimensional Array (2-D Array)
 *   Jagged Arrays
 */

public class A21Array01 {
    public static void main(String[] args) {
        // storing multiple values in different variable
        int a1 = 10; 
        int a2 = 20;
        int a3 = 30;
        int a4 = 40;

        /***************************************** */

        //------------------- 1-D Array----------------
        // Declaration of array:
        int ar1[];
        int []ar2;
        int[] ar3;
        // int ar3[5];  // Wrong syntax: compile time error. we cannot specified the size.


        // Array store multiple values in a single variable.
        // Storing Values in array if they are known;
        int arr1[] = {10, 20, 30, 40};
        float arr2[] = {1.3f, 3.4f, 6.78f};
        char arr3[] = {'A' ,'B', 'C'};
        String arr4[] = {"Aman", "Raj", "Aakash"};

        // we can print value of an array by it's index value : starts with 0
        System.out.println(arr1[0]); // 10
        System.out.println(arr1[1]); // 20
        System.out.println(arr1[2]); // 30 
        System.out.println(arr1[3]); // 40
        
        System.out.println(arr2[2]); // 6.78

        System.out.println(arr3[2]); // C

        System.out.println(arr4[1]); // Raj


        // changing values of array by index value:
        int arr5[] ={10, 20, 30, 40, 50};
        arr5[0] = 100;
        arr5[1] = 200;

        // Printing all values of array;
        for(int i=0; i<arr5.length; i++){
            System.out.print(arr5[i]+" "); // 100 200 30 40 50
        }

        /********************************************************************************* */

        // Contruction of an array
        // Every array in java is an object so we need to use new operator to create an array

        int[] arr6;
        arr6 = new int[6];
                  //or
        int arr7[] = new int[5]; // An array with size of 5

        /*************************************************** */
        // Rules for Construction of an array: 

        // 1. At the time of Array construction compulsorily we should specify the size.

        // int [] arr8 = new int[]; //Variable must provide either dimension expressions or an array initializer
        int [] arr8 = new int[6];


        // 2. It is legal to have an array size of 0
        int [] arr9 = new int[0];
        System.out.println(arr9.length); // 0


        // 3. If we declare an array with negative size it would result in a Negative Array size exception.
        // int [] arr10 = new int[-9]; // CE : NegativeArraySizeException 


        // 4. The allowed datatypes to specify the size are byte,short,int,char.

        byte a = 10;
        short b = 20; 
        int c = 234;
        char d = 'A';
        int [] arr11 = new int[a];
        int [] arr12 = new int[b];
        int [] arr13 = new int[c];
        int [] arr14 = new int[d];
        
        // float and long will generate an compilation error
        // int [] arr15 = new int[45.6f];  // cannot convert from float to int
        // int [] arr16 = new int[45l];  // cannot convert from long to int



        // 5. The maximum allowed array size in java is the maximum value of int size.
        // int arr15[] = new int[2147483647];  // Valid, But : java.lang.OutOfMemoryError: Requested array size exceeds VM limit
        // int arr16[] = new int[2147483648]; // CE


        /***********************************************************************/
        // Memory Representation of an array: 
        /*  Since every array is an object and uses new keyword for creation. 
            So values of an array is stored in heap area.
        */
        int arr17[] = {1,2,3,4};
        int num = 10;

        /*
         * 
         * 
                  *****************                Heap (Address: 10102)
    local varible * num   * 10    *                   ************
                  *****************                   *          *    
     array        * arr17 * 10102 *   ------------->  *  1 2 3 4 *  
                  *****************                   *          *
                                                      ************
         */

         System.out.println(arr17);  // [I@85ede7b

        





        






    }
}
