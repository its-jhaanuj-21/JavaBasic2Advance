import java.util.Scanner;
public class A13InputScannerClass {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the age: ");
        int age = scan.nextInt();
        System.out.println("Age is: "+age);
        // sc.close();

        System.out.print("Enter Average: ");
        double avg = scan.nextDouble();
        System.out.println("Average is: "+avg);

        System.out.println("Enter Name: ");
        String name = scan.next();
        System.out.println("Name is: "+name);

        scan.nextLine(); // If we not use this in b/w next() and nextLine() last char of next() will come in nextLine() and we will not able to use nextLine().

        System.out.print("Enter Full Name: ");
        String fName = scan.nextLine();
        System.out.println("Full name is: "+fName);

        System.out.println("Enter a character:");
        char ch = scan.next().charAt(0);
        System.out.println("Character is: "+ch);


        // scn.nextInt();  //-> int
        // scn.nextByte(); //-> byte
        // scn.nextShort(); //-> short
        // scn.nextLong(); //-> long
        // scn.nextFloat(); //-> float
        // scn.nextDouble(); //-> double
        // scn.next();       //-> String without white Space
        // scn.nextLine();   //-> String with white Space
        // scn.nextBoolean(); //-> boolean value
        // scn.next().charAt(); //-> character

        scan.close();
    }

}
