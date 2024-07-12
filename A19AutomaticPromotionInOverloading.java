/*
  In overloading if the compiler is unable to find the method with exact 
  match we won't get any compile time error immediately.

  First the compiler promotes the argument to the next level and checks 
  whether the matched method is available or not if it is available then 
  that method will be considered if it is not available then the compiler 
  promotes the argument once again to the next level.

  This process will be continued until all possible promotions still if 
  the matched method is not available then we will get a compile time error. 
  This process is called automatic promotion in overloading. 

  The following are various possible automatic prmotion in overloading.

  byte --> short -->
                     int --> long --> float --> double
            char -->
 */


class Promotion{
    public void show(byte n){
        System.out.println("byte "+n);
    }
    public void show(short n){
        System.out.println("short "+n);
    }
    public void show(char n){
        System.out.println("char "+n);
    }
    public void show(int n){
        System.out.println("int "+n);
    }
    public void show(long n){
        System.out.println("long "+n);
    }
    public void show(double n){
        System.out.println("byte "+n);
    }
} 

class Promotion2{
        public void show(short n){
        System.out.println("short "+n);
    }
    public void show(char n){
        System.out.println("char "+n);
    }
    public void show(int n){
        System.out.println("int "+n);
    }
    public void show(long n){
        System.out.println("long "+n);
    }
    public void show(double n){
        System.out.println("byte "+n);
    }
} 

class Promotion3{
     
    public void show(char n){
        System.out.println("char "+n);
    }
    public void show(int n){
        System.out.println("int "+n);
    }
    public void show(long n){
        System.out.println("long "+n);
    }
    public void show(double n){
        System.out.println("byte "+n);
    }
} 

class Promotion4{
     
    public void show(int n){
        System.out.println("int "+n);
    }
    public void show(long n){
        System.out.println("long "+n);
    }
    public void show(double n){
        System.out.println("byte "+n);
    }
} 

public class A19AutomaticPromotionInOverloading {
    public static void main(String[] args) {

        Promotion p = new Promotion();
        
        p.show(2); // By default it will print int

        // but if we specify :
        p.show((byte)9);

        short n = 10;
        p.show(n);


        //What if inputed type is not available
        Promotion2 p2 = new Promotion2();
        p2.show((byte)12);    // but byte is not available so it will promote to short 

        Promotion3 p3 = new Promotion3();
        p3.show((byte)56);  // byte not available -> short not available -> promoted to int

        Promotion4 p4 = new Promotion4();
        p4.show((char)'A'); // char not available -> promoted to int 
    }
}
