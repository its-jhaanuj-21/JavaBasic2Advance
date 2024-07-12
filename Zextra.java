class extra {
    static int a;
    static int b;

    int x;
    int y;

    static{
        a = 10;
        b = 20;
        System.out.println("-----------------");
        System.out.println("In static block");
        System.out.println("-----------------");
    }

    {
        x = 30;
        y = 40;
        System.out.println("-----------------");
        System.out.println("In non-static block");
        System.out.println("-----------------");
    }

    static void sfun(){
        System.out.println("-----------------");
        System.out.println("In static function");
        System.out.println("static a: "+a);
        System.out.println("static b: "+b);
        // System.out.println("non-static x: "+x);
        System.out.println("-----------------");
    }

    void nsfun(){
        System.out.println("-----------------");
        System.out.println("In non-static function");
        System.out.println("non-static x: "+x);
        System.out.println("non-static y: "+y);
        System.out.println("static a: "+a);
        System.out.println("static b: "+b);
        System.out.println("-----------------");

    }
}

public class Zextra{
    public static void main(String[] args) {

        System.out.println("In Main");

        extra x = new extra();
        
        extra.sfun();

        x.nsfun();
        
    }
}