public class A36PangramString {
    public static void main(String[] args) {
        boolean flag = true;
        String s1 = "The Quick Brown Fox Jumps Over a Lazy Dog";
        s1 = s1.toUpperCase();
        s1 = s1.replace(" ", "");
        char strarr[] = s1.toCharArray();
        
        int arr[] = new int[26];

        for(int i=0; i<strarr.length; i++){
            arr[strarr[i]-65]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                System.out.println("Not a Panagram");
                flag = false;
            }
        }
        if(flag){
            System.out.println("Pangram");
        }


        /************************************************************ */

        // Assignment
        // Q1. WAP to remove duplicates from string.
        // String strr1 = "ABCDABFG";
        // String strr2 = "";
        // for (int i = 0; i < strr1.length(); i++) {
        //     char currentChar = strr1.charAt(i);
        //     if (strr2.indexOf(currentChar) == -1) {
        //         strr2 += currentChar;
        //     }
        // }
        // System.out.println(strr2);


        // // Q2. WAP to remove duplicates from string.
        // String strr1 = "ABCDABFG";
        // String strr2 = "";
        // for (int i = 0; i < strr1.length(); i++) {
        //     char currentChar = strr1.charAt(i);
        //     if (strr2.indexOf(currentChar) == -1) {
        //         strr2 += currentChar;
        //     }
        // }
        // System.out.println(strr2);
       

        //3.	WAP to check if "2552" is palindrome or not. 
        // String strr1 = "2552";
        // String strr2 = "";
        // for(int i=strr1.length()-1; i>=0; i--){
        //     strr2 = strr2 + strr1.charAt(i);
        // } 
        // if(strr1.equals(strr2)){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not Palindrome");
        // }


        // String strr1 = "AeIoucghjkl%^&*()";
        // int v = 0;
        // int c = 0;
        // int sp = 0;
        // strr1 = strr1.toLowerCase();
        // for(int i=0 ;i<strr1.length(); i++){
        //     char ch = strr1.charAt(i);
        //     if(ch>='a'&&ch<='z'){
        //         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        //             v++;
        //         }else{
        //             c++;
        //         }
        //     }else{
        //         sp++;
        //     }
        // }
        // System.out.println("Vowels: "+v);
        // System.out.println("Constant: "+c);
        // System.out.println("Special Char: "+sp);
        
        
        //7.	WAP to find if String contains all unique characters.
        String strr1 = "ABCDEFGHA";
        String strr2 = "";
        boolean flags = true;
        for (int i = 0; i < strr1.length(); i++) {
            char currentChar = strr1.charAt(i);
            if (strr2.indexOf(currentChar) == -1) {
                strr2 += currentChar;
            }else{
                flags = false;
            }
        }
        if(flags){
            System.out.println("String with unique charcters");
        }else{
            System.out.println("String without unique charcters");
        }





















    }
}
