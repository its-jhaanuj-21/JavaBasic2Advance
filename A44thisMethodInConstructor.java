/*
    l. The first line inside the constructor can be super()/ this().
    2. If we are not writing anything then compiler will generate super(); -> for the parent class constructor.
    
    
    super()
        • It should be the first line in the constructor.
        • It should be used only in constructor.
        • It will take control to the parent class constructor.
    this()
        • It should be the first line in the constructor.
        • It should be used only in constructor.
        • It will make the call of the current class constructor.

 */


class ConstThis{
    private int a; 
    private String n; 

    ConstThis(){
        this(10, "AAKASH");
        System.out.println("Normal Constructor");
        a = 10;
        n = "Anuj";
    }

    ConstThis(String n){
        System.out.println("Constructor with string as parameter");
        a = 19;
        this.n = n;
    }

    ConstThis(int a, String n){
        System.out.println("Constructor as string and number as parameter");
        this.a = a;
        this.n = n;
    }

    void disp(){
        System.out.println("Name: "+n);
        System.out.println("Num: "+a);
    }


}

public class A44thisMethodInConstructor {
    public static void main(String[] args) {
        ConstThis ct = new ConstThis();
        ct.disp();

    }
}
