public class A29ImmutableStrings {
    public static void main(String[] args) {
        
        String s1 = "String in 'String Constant Pool'(SCP) of Heap ";
        System.out.println(s1);
        String s2 = new String("String in Heap area outisde the SCP");
        System.out.println(s2);


        /*
            In String Constant Pool (SCP) duplicates are not allowed : 
            if diff refrences store same value then there will be only one value in SCP 
            and all refrence points that particular value

            Garbage Collector cannot access SCP Area, Even though Object does not have 
            any reference still object is not eligible for GC. 
            All SCP objects will be destroyed only at the time of JVM ShutDown.
        
        */ 
        String str1 = "Hello";
        String str2 = "Hello";

         /*                                 Heap
                                  *************************
                                  *                       * 
                                  *                       *
            **************        *                       *
            *            *        *                       *
            *            *        *   ****************    *
            **************        *   *              *    *
            *    str1    *------------->    Hello    *    *
            *    str2    *        *   *              *    *
            **************        *   ****************    *
                                  *          SCP          *
                                  *************************                                            
         */

        
        /*
         *   In heap area outside the SCP duplicats are allowed
         */

        String str3 = new String("HelloWorld");
        String str4 = new String("HelloWorld");


        /*                                 Heap
                                  *************************
            **************        *                       * 
            *   str3     *------->*     HelloWorld        *
            *   str4     *------->*     HelloWorld        *
            *            *        *                       *
            *            *        *   ****************    *
            **************        *   *              *    *
            *    str1    *------------->    Hello    *    *
            *    str2    *        *   *              *    *
            **************        *   ****************    *
                                  *          SCP          *
                                  *************************                                            
         */




         /*
             Although memory is allocated in heap area outise the SCP when we create 
             a refrence with the help of new keyword but it also store a copy of data \
             in SCP which is not refrenced by any external varibale. Only JVM handles that part.
          */

          /*                                 Heap
                                  *************************
            **************        *                       * 
            *   str3     *------->*     HelloWorld        *
            *   str4     *------->*     HelloWorld        *
            *            *        *                       *
            *            *        *   ****************    *
            **************        *   *              *    *
            *    str1    *------------->    Hello    *    *
            *    str2    *        *   *              *    *
            **************        *   *  HelloWorld  *    *
                                  *   ****************    *                   
                                  *          SCP          *
                                  *************************                                            
         */


        System.out.println(str1==str2);  // true : str1 and str2 are refrencing same object

        System.out.println(str3==str4); // false : str3 and str4 are referncing different objects

        System.out.println(str3.equals(str4)); // true 

        
    }
}
