public class A31StringConcatination {
    public static void main(String[] args) {

        // Using 'concat' method
        
        String s1 = new String("Hello");
        s1.concat("Wolrd"); // New object "Hello World" will create in Heap without any refrence
        System.out.println(s1);     // Hello 
        s1 = s1.concat(" World"); // Assigning old refence to newly created object
        System.out.println(s1);    // Hello World



        String st1 = "pwjava";  // In SCP
        String st2 = st1.concat("ABCD");  // Although no 'new' keyword, still created in heap outside SCP; coz we using inbuilt method
        String st3 = new String("pwjava");
        st3=st3.concat("skill");
        System.out.println(st1);  // pwjava
        System.out.println(st2);  // pwjavaskill
        System.out.println(st3);  // pwjavaskill

        /*                                 Heap
                                  *************************
            **************        *                       * 
            *   st2      *------->*     pwjavaABCD        *
            *   st3      *------->*     pwjava            *
            *            *  |---->*     pwjavaskill       *
            *            *        *   ****************    *
            **************        *   *              *    *
            *    st1     *------------->   pwjava    *    *
            *            *        *   *              *    *
            **************        *   *  pwjavaABCD  *    *
                                  *   *  pwjava      *    *   
                                  *   *              *    *
                                  *   ****************    *                   
                                  *          SCP          *
                                  *************************                                            
         */

/************************************************************************************************************* */

        // Using + operator  

        String str1 = "Anuj";  // store in SCP
        String str2 = "Anuj" + " Kumar"; // compile time contatination  : store in SCP 
        String str3 = "Anuj" + " Kumar" + " Jha"; // compile time contatination  :  store in SCP
        String str4 = str1+str3; // run time contatination :  store in Heap coz str1 & str2 are varibale whose value will be determined at runtime.
    
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


        /*                                 Heap
                                  ***************************
            **************        *                         * 
            *   str4     *------->*   AnujAnuj Kumar Jha    *
            *            *        *                         *
            *            *        *   ******************    *
            **************        *   *                *    *
            *    str1    *------->*   * Anuj           *    *
            *    str2    *------->*   * Anuj Kumar     *    *
            *    str3    *------->*   * Anuj Kumar Jha *    *
            **************        *   *                *    *   
                                  *   *                *    *
                                  *   ******************    *                   
                                  *          SCP            *
                                  ***************************                                            
         */


        // Using 'concat' method we can concatinate only one word | but using + operator we can concatinate multiple words


        
        // using + operator we can concatinate number also with string.
        String str = "abcd" + 100 + 90;
        System.out.println(str);

        


       
    }
}
