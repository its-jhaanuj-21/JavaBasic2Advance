import java.lang.*; // Default package no need to add

// public class name should be same as .java file name
public class A01HelloWorld{

    // main() method
    
    // public static void main(String[] args) {
    // public static void main(String args[]) {
    // static public void main(String args[]) {
    // static public void main(String myargs[]) {
    static public void main(String... args) {
        // Print statement 
        System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[4]);
    }
}