public class A39MoreOnMutableString {
    public static void main(String[] args) {
        
        // StringBuffer
        /*
         * If the content will chnage frequently then it is not recommended to 
         * go for String object coz for every new chnage a new object will be created.
         * 
         */
        StringBuffer sb = new StringBuffer();
        // Creates an empty StringBuffer object with default initial capacity of '16'.
        System.out.println(sb.capacity()); // 16

        // Capacity remains 16 if we reach upto 16 character.
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity()); // 16

        // If we exceed the character limit that is greater than 16:
        // Then, new capacity = (current capacity+1)*2
        sb.append("rstuv");
        System.out.println(sb.capacity()); // 34 [(16+1)*2 = 34]

        System.out.println(sb.length()); // 21



        // If we add string to the contructor at starting the new capacity will be :
        // 16 + s.length()
        StringBuffer sb2 = new StringBuffer("Avengers");
        System.out.println(sb2.length()); // 8
        System.out.println(sb2.capacity());  // 24 [16+8 = 24]



        // If creates an empty String with the specified initial Capacity
        StringBuffer sb3 = new StringBuffer(20);
        System.out.println(sb3.capacity()); // 20
        System.out.println(sb3.length());  // 0
        sb3.append("AmanBhatarwal");  
        System.out.println(sb3.length()); // 13
        System.out.println(sb3.capacity()); // 20
        sb3.append("AmanBhatarwal");
        System.out.println(sb3.capacity()); // 42 [(20+1)*2 = 42]
        System.out.println(sb3.length()); // 26 


        // Note : All the above mentioned conditions are also applicable for StringBuilder


        // Some methods of StringBuffer and StringBuilder
        StringBuilder buildstr = new StringBuilder(120);
        System.out.println(buildstr.capacity());  // Return Capacity
        buildstr.append("Anuj Kmar Jha");    // Add Strings 
        System.out.println(buildstr);
        buildstr.insert(6,'u');      // insert character at index
        System.out.println(buildstr);
        System.out.println(buildstr.length());    // Return length of string
        System.out.println(buildstr.charAt(5));   // Return character at index
        buildstr.setCharAt(1, 'N');      // Replaces chracter at index
        System.out.println(buildstr);
        buildstr.trimToSize();              // Reduces the capacity to length of string present          
        System.out.println(buildstr.capacity()); 
        System.out.println(buildstr.reverse());  // Reverse the string 
        System.out.println(buildstr.reverse());  
        buildstr.delete(4, 10);      // deletes the character from the specified index to end-1.
        System.out.println(buildstr);
        buildstr.deleteCharAt(3);        // Removes the char at the specified position in this sequence.  
        System.out.println(buildstr);
        buildstr.delete(0, buildstr.length());
        System.out.println(buildstr);
        buildstr.append("ANUJKUMARJHA");
        System.out.println(buildstr);
        buildstr.setLength(4);   // It is used to consider only the specified no of characters and remove all the remaining characters.
        System.out.println(buildstr);


        // About StringBuilder (1.5v): 
       /*  StringBuilder is same as StringBuffer(1.OV) with few differences
            • No methods are synchronized
            • At a time more than one thread can operate so it is not ThreadSafe.
            • Threads are not required to wait so performance is high.
            • Introduced in jdk 1.5 version
       */

       /*
           String vs StringBuffer vs StringBuilder
            • String
                we opt if the content is fixed and it won't change frequently
            • StringBuffer
                we opt if the content changes frequently but ThreadSafety is required
            • StringBuilder
                we opt if the content changes frequently but ThreadSafety is not required 
        */


        // Method Chaining 
        StringBuffer buffstr = new StringBuffer();
        buffstr.append("Anuj").insert(4," Jha").reverse();
        System.out.println(buffstr);

        





















        // StringBuilder sbb = new StringBuilder("ABCD");
        // String sb22 = new String(sbb);
        // System.out.println(sb22);

        // String sx = new String("XXXX");
        // StringBuilder sbbbb = new StringBuilder(sx);
        // System.out.println(sbbbb);

        // String acc = "XCXCXCX";
        // StringBuilder sxxx = new StringBuilder(acc);
        // System.out.println(sxxx);


        // byte arr[] = {65, 66, 67, 68};
        // String nn = new String(arr);
        // System.out.println(nn);
    }
}
