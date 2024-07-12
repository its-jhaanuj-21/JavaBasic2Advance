class constOverloading{

    private int a; 
    private String n; 

    constOverloading(){
        a = 10;
        n = "Anuj";
    }

    constOverloading(String n){
        a = 19;
        this.n = n;
    }

    constOverloading(int a, String n){
        this.a = a;
        this.n = n;
    }

    void disp(){
        System.out.println("Name: "+n);
        System.out.println("Num: "+a);
    }
}

public class A43ConstructorOverloading {
    public static void main(String[] args) {
        constOverloading co1 = new constOverloading();
        co1.disp();

        constOverloading co2 = new constOverloading("Aman");
        co2.disp();

        constOverloading co3 = new constOverloading(12, "Aakash");
        co3.disp();
    }
}
