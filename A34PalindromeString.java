import java.util.Scanner;
public class A34PalindromeString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str1 = sc.nextLine();

        String str2 = "";

        for(int i=str1.length()-1; i>=0; i--){
            str2 = str2 + str1.charAt(i);
        }

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}
