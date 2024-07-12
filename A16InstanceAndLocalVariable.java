 /*
           Based on the behavior and position of declaration all variables are divided into the following 3 types.
           1. Instance variables
           2. Static variables
           3. Local variables


           Instance Variable:
           ***************** 
           1. If the value of a variable is varied from object to object such types 
              of variables are called instance variables.

           2. For every object a separate copy of instance variables will be created.

           3. Instance variables will be created at the time of object creation and 
              destroyed at the time of object destruction hence the scope of instance 
              variables is exactly the same as scope of objects.

           4. Instance variables will be stored on the heap as the part of the object.

           5. Instance variables should be declared within the class directly but outside 
              of any method or block or constructor.

           6. All Instance variable have some default vaule. Like int -> (0), String -> (null).

           7. Instance variables can be accessed directly from the Instance area. 
              But cannot be accessed directly from a static area.But by using 
              object reference we can access instance variables from static area


           Local Variable 
           **************
           1. Sometimes to meet temporary requirements of the programmer we can declare 
              variables inside a method or block or constructors such type of variables 
              are called local variables or automatic variables or temporary variables 
              or stack variables.

           2. Local variables will be stored inside the stack.

           3. The local variables will be created as part of the block execution in which 
              it is declared and destroyed once that block execution completes. Hence the 
              scope of the local variables is exactly the same as the scope of the block in 
              which we declared.
           
           4. Local variables don't have default value. We need to assigned the value either 
              it will give an error.
          
         */

public class A16InstanceAndLocalVariable {

    int a;        // Instance Variable 
    String name;  // Instance Variable
    int b = 10;   // Insta

    public static void main(String[] args) {

        // System.out.println(a);  // Error: Cannot make a static reference to the non-static field a (ponit 7)

        A16InstanceAndLocalVariable obj = new A16InstanceAndLocalVariable(); // Obj reference will store in stack with the address of its instances that is store in heap.

        /*
                                                    ****************
                  ***************                   *  b = 0       *  Instnace variables with default value
                  * obj * 10101 *    ------------>  *  name = null *    
                  ***************                   *  a = 0       *
                    Main stack                      ****************
                                                   Heap (Address: 10101)
            
              Note: In memory we have multiple stack but only one heap
          
         */

        System.out.println(obj.a);     // accessing instance variable with reference | will print default value : 0
        System.out.println(obj.b);     // accessing instance variable with reference | will print default value : 10
        System.out.println(obj.name);  // accessing instance variable with reference | will print default value : null
        obj.a=23; 
        obj.b=93;
        obj.name = "Anuj";
        /*
                                                    ****************
                  ***************                   *  b = 93      *  Instnace variables with new assigned value
                  * obj * 10101 *    ------------>  *  name = Anuj *    
                  ***************                   *  a = 23      *
                      stack                         ****************
                                                 Heap (Address: 10101)
          
         */
        System.out.println(obj.a);  // Now it will print new value of a in obj reference that is present in the heap area of obj 
        System.out.println(obj.b);
        System.out.println(obj.name);


        
        //creating new object:
        A16InstanceAndLocalVariable obj2 = new A16InstanceAndLocalVariable();
        /*
                                                 Heap (Address: 10102)
                                                    ****************
                  ***************                   *  b = 0       * Instnace variables with default value
                  * obj2 * 10102*   ------------->  *  name = null *   
                  ***************                   *  a = 0       *
                  *             *                   ****************
                  *             *                   ****************
                  ***************                   *  b = 93      *  Instnace variables with new assigned value
                  * obj * 10101 *    ------------>  *  name = Anuj *    
                  ***************                   *  a = 23      *
                      stack                         ****************
                                                 Heap (Address: 10101)
          
         */
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.name);
        obj2.a = 109;
        obj2.b = 346;
        obj2.name = "Aman";

        /*
                                                 Heap (Address: 10102)
                                                    ****************
                  ***************                   *  b = 346     * Instnace variables with new assigned value
                  * obj1 * 10102*   ------------->  *  name = Aman *   
                  ***************                   *  a = 0       *
                  *             *                   ****************
                  *             *                   ****************
                  ***************                   *  b = 93      *  Instnace variables with new assigned value
                  * obj * 10101 *    ------------>  *  name = Anuj *    
                  ***************                   *  a = 23      *
                      stack                         ****************
                                                 Heap (Address: 10101)
          
         */
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.name);


        /********************************************************************************************** */

        int num; // Local variable
        // System.out.println(num);  // Error: The local variable num may not have been initialized
        num =10;
        System.out.println(num);

         /*

                  ***************                 Heap (Address: 10102)
    local varible * num  * 10   *                   ****************
                  ***************                   *  b = 346     * Instnace variables with new assigned value
                  * obj1 * 10102*   ------------->  *  name = Aman *   
                  ***************                   *  a = 0       *
                  *             *                   ****************
                  *             *                   ****************
                  ***************                   *  b = 93      *  Instnace variables with new assigned value
                  * obj * 10101 *    ------------>  *  name = Anuj *    
                  ***************                   *  a = 23      *
                      stack                         ****************
                                                 Heap (Address: 10101)
          
         */







    }
}
