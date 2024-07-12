public class A10TernaryOperator {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        int res = (a>b)?a:b;
        System.out.println(res);

        String result = (a<b)?"a is less" : "b is less";
        System.out.println(result);

        int c = 30;
        int grt = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(grt);

    }
}
