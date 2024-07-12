public class A32StringMethods {
    public static void main(String[] args) {
        
        String str = "Anuj Kumar Jha";
        
        System.out.println(str.hashCode());
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.substring(5, 10));
        System.out.println(str.indexOf("K"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.replace("Jha", "XYZ"));
        
    }
}
