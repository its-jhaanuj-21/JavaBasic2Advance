import java.util.Scanner;

class Abc{
    public static void xyz(){
        System.out.println("Static Method");
    }
    public void xyz2(){
        System.out.println("Non-Static Method");
    }
}
public class test {
    public static void main(String[] args) {
    //    Abc obj = new Abc();
    //    obj.xyz2();
    //    Abc.xyz();
    //    System.out.println(obj);
       
       Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0);
       System.out.println(ch);

    }
}
