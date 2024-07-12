import java.util.Arrays;
import java.util.Scanner;
public class A35AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String:");
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1, str2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
        

    }
}
