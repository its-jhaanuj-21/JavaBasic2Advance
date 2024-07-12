class Demo1{
    int a, b;
    public Demo1(){
        this(30, 40);
        System.out.println("Parent class default constructor");
    }

    public Demo1(int x, int y){
        System.out.println("Parent class parametrized constructor");
        a = x;
        b = y;
    }
}
class Demo2 extends Demo1{
    int m, n;
    public Demo2(){
        this(10, 20);
        System.out.println("child class default constructor");
    }

    public Demo2(int x, int y){
        // super()   // by default super will call
        System.out.println("Child class parametrized constructor");
        m = x;
        n = y;
    }
}

public class A48ConstructorChaining {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
    }
}
