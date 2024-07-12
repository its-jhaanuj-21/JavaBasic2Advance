/*
 * Types of Inheritance: 
 * 1. Single Level Inheritance
 * 2. Multilevel Inheritance
 * 3. Hybrid Inheritance
 * 
 * NOTE: Java Doesn't support Multiple Inheritance
 */

//------------------------------------------------------
//Single Level: 
class Animal1{
    void sleep(){
        System.out.println("Animal1 needs sleep");
    }
}

class Tiger extends Animal1{

}
//------------------------------------------------------

//------------------------------------------------------
//Multilevel Inheritance
class Animal2{
    void sleep(){
        System.out.println("Animal2 Needs Sleep");
    }
}

class Dog extends Animal2 {

}

class Puppy extends Dog{

}

//------------------------------------------------------

//------------------------------------------------------
// Hybrid Inheritance
class Demo1{
    void disp(){
        System.out.println("Display method of demo1");
    }
}
class Demo2 extends Demo1{

}
class Demo3 extends Demo1{

}

public class A46TypesOfInheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();

        Puppy p = new Puppy();
        p.sleep();


        Demo2 d2 = new Demo2();
        d2.disp();
        Demo3 d3 = new Demo3();
        d3.disp();
    }
}
