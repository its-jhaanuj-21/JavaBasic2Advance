/*
         * 
         * A Java program consists some of Members are:
            1. Instance Member
            2. Static Member
                Instance Member: An instance member is essentially anything within a class that is not marked as static. That
                is, that it can only be used after an instance of the class has been made (with the new keyword). This is
                because instance members belong to the object, whereas static members belong to the class.

                Static Member: Static members are those which belong to the class and you can access these members
                without instantiating the class. The static keyword can be used with methods, fields, classes (inner/nested),
                blocks.
         * 
         * 
         * 
         * 
         * 
         * 'static' keyword
            The static keyword is mainly used for memory management in Java. A static keyword can be applied to
            variables, blocks, methods, and classes. The static keyword is a property of a class rather than 
            an instance of the class. The static keyword is used for a constant variable or a method that 
            is the same for every instance of a class.
            
            Where is the "static" keyword applicable?
            The static keyword is a non-access modifier in Java and is applicable for the following:
            1. Variables
            2. Methods
            3. Blocks
            4. Class

            Static Variable: 
            • If we declare any variable as static, then it is called a static variable. 
            • When a variable is declared as static, then a single copy of that variable 
            is created and shared among all of the objects at the class level. 
            • Static variables are global variables. 
            • All instances of the class share the same static variable. 
            • We can create static variables at the class level only.
            • It makes our program more efficient, as every object doesn't allocate separate memory to a static variable.
            • If the value of a variable is not varied from object to object such type of variables is not recommended to be
            declared as instance variables.
            • We have to declare such types of variables at class level by using static modifiers.
            • In the case of instance variables for every object a separate copy will be created but in the case of static
            variables for the entire class only one copy will be created and shared by every object of that class.
            • Static variables will be created at the time of class loading and destroyed at the time of class unloading
            hence the scope of the static variable is exactly the same as the scope of the .class file.
            • Static variables will be stored in the method area. Static variables should be declared within the class
            directly but outside of any method or block or constructor.
            • Static variables can be accessed from both instance and static areas directly. We can access static
            variables either by class name or by object reference but usage of class name is recommended.
            • But within the same class it is not required to use class names we can access directly.

           
            Static Method:
            • A static method is a method that belongs to a class rather than an instance of a class. 
            • This means you can call a static method without creating an object of the class. 
            • Static methods are sometimes called class methods.
            • Methods which are available at the class level are referred to as "static methods".
            • These methods are referred to as utility methods.
            • Inside the static methods we can access only static variables.
            • If we try to access the instance variables directly then it would result in "CompileTimeError".

            There are a few other reasons why you might want to use static methods:
            • You can access static methods from outside of the class in which they are defined. This is not possible with
            non-static methods.
            • Subclasses can override static methods, but non-static methods cannot.
            • Static methods are executed when an instance of the class is created, whereas non-static methods are not.
            • Static methods can be used to create utility classes that contain general-purpose methods.

           
            Static Blocks: 
            • It is used to initialize static data members. 
            • It is used to initialize before the main method at the time of class loading. 
            • It gets executed only once when the class gets loaded. 
            • It is not necessary to execute it again when creating different objects after the first time.
            • These are the blocks which gets executed automatically at the loading the .class files
            • If we want to perform any activity at the time of loading a .class file we have to define that activity inside the
            static block.
            • We can write any no of static blocks, those static blocks will be executed from top to bottom.
            • Normally a static block is used to perform initialization of the static variables.
            
            
            Static Class: 
            • In Java, a "static class" is a class that can be instantiated without having to create an instance of the containing class. 
            • A static class is defined as a member of another class and can only access static members of the containing class.


             Execution Sequence :
                1. static variable
                2. static block
                3. static method  --> (when called from main method)
                4. non static varibale (insatance variable)
                5. non static block
                6. non static method
         * 
         * 
         * 
         */


class StaticDemo{
    static int a;                  // 1st execution : static variable created in heap area with deafault value
    static int b;

    int m;                         // 5th execution : instance variable will allocated in heap under demo1 class
    int n;

    static{                        // 2nd execution : static variable will get instansiated 
        a = 10;                        
        b = 20;
        System.out.println("Control in static block");
    }

    {                              // 6th execution : instance varible will get instansiated
        m = 100;
        n = 200;
        System.out.println("Control in non-static block / Initialization block");

    }

    static void disp1(){           // 8th Execution : will come in stack and deallocate after execution 
        System.out.println("Value of static var a: "+a);
        System.out.println("Value of static var b: "+b);
        // System.out.println(m);  // can't call instance variable in static method
    }

    void disp2(){                  // 10th execution : will come in statck and deallocate after execution 
        System.out.println("Value of non-static/instance var m: "+m);
        System.out.println("Value of non-static/instance var n: "+n);
        // System.out.println(a);  // we can call static varibale in non - static method
    }
}

public class A40StaticKeyword {
    public static void main(String[] args) { // 3rd Execution
        System.out.println("In main function: ");
        StaticDemo d = new StaticDemo();     // 4th Execution : class demo1 will created in heap, and refrence 'd' in stack will point to Demo1.  
        StaticDemo.disp1();             // 7th Execution : call disp1 (static method: without creating an object)
        d.disp2();                 // 9th execution : call disp2.
       
        // d.disp1();  // Warning : The static method disp1() from the type Demo1 should be accessed in a static way
    }
}
