/*
 * Two methods are said to be overloaded if and only if both have the same name but different argument
   types.
   
   In overloading, the compiler is responsible to perform method resolution(decision) based on the reference 
   type(but not based on run time object). Hence overloading is also considered as compile time 
   polymorphism(or) static polymorphism (or)early binding.
 * 
 */

class Addition{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public double sum(double a, double b){
        return a+b;
    }

    public double sum(double a, int b){
        return a+b;
    }
}
public class A18MethodOverloading{
    public static void main(String[] args) {
        
        Addition ad = new Addition();
        System.out.println(ad.sum(12, 3));
        System.out.println(ad.sum(12, 3, 6));
        System.out.println(ad.sum(45.6, 56.4));
        System.out.println(ad.sum(12.5,8));
    }
}