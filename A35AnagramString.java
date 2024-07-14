import java.util.Arrays;
import java.util.Scanner;
public class A35AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");   
        String s1 = sc.nextLine();      // LiSteN On
        System.out.println("Enter 2nd String:");  // No SiLenT 
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase();  // listen on
        s2 = s2.toLowerCase();  // no silent

        s1 = s1.replace(" ", "");  // listenon
        s2 = s2.replace(" ", "");  // nosilent

        char str1[] = s1.toCharArray();    // ['l', 'i', 's', 't', 'e', 'n', 'o', 'n']
        char str2[] = s2.toCharArray();    // ['n', 'o', 's', 'i', 'l', 'e', 'n', 't']

        Arrays.sort(str1);      // ['e', 'i', 'l', 'n', 'n', 'o', 's', 't']
        Arrays.sort(str2);      // ['e', 'i', 'l', 'n', 'n', 'o', 's', 't']

        if(Arrays.equals(str1, str2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
        
              // CAR    
              // RAC
              // ACR

    }
}
