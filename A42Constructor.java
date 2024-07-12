/*
    Constructor : 
    • Object creation is not enough, compulsorily we should perform initialization then only the object is in  
    position to provide the response properly.
    • Whenever we are creating an object some piece of the code will be executed automatically to perform
    initialization of an object. This piece of code is nothing but a constructor.
    • Main objective of the constructor is nothing but initialisation of Object.

    In Java, a constructor is a block of codes similar to the method. It is called when an instance of 
    the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

    It is a special type of method which is used to initialize the object.
    Every time an object is created using the new() keyword, at least one constructor is called.


    Rules for creating Java constructor: 
    ------------------------------------
    • Constructor name must be the same as its class name.
    • A Constructor must have no explicit return type.
    • A Java constructor cannot be abstract, static, final, and synchronized; it will give compile-time error.
    • The modifiers applicable for constructors are private,public,protected,default.
    • Return type concept not applicable for constructor, even if we provide it won't result in compile 
    time errors, if we do so then the Java language will treat this as anormal method".


    There are 3 types of constructors in Java:
    --------------------------------------------
    • default - constructor 
    • Construcctor (no-arg constructor)
    • Parameterized constructor
    

    Default Constructor:
    --------------------
    • For every java class constructor concept is applicable.
    • If we don't write any constructor, then the compiler will generate a default constructor.
    • If we write at least one constructor then the compiler won't generate any default constructor, so we say
    every java class will have a compiler generated default constructor or programmer written constructor but
    not both simultaneously.
  
 */


class constructorExmaple{

    private int num;
    private String name;
    // void constructorExmaple(int num, String name){   // if we add return type it will act as method
    constructorExmaple(int num, String name){
        System.out.println("parametrized constructor"); 
        this.num = num;
        this.name = name;
    }

    int getNum(){
        return num;
    }
    String getName(){
        return name;

    }

    constructorExmaple(){
        System.out.println("Default Constructor");
    }
}
public class A42Constructor {
    public static void main(String[] args) {
      
        constructorExmaple ce = new constructorExmaple(10, "Anuj");
        
        String name =  ce.getName();
        int num = ce.getNum();
        
        System.out.println(name);
        System.out.println(num);

         constructorExmaple ce0 = new constructorExmaple(); // for this we have to create a constructor in class coz we have created a parametrized constructor so java compiler will not make a default constructor by its own. 
    }
}
