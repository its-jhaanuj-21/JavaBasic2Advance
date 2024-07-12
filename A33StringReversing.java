public class A33StringReversing {
    public static void main(String[] args) {
        
        // anuj jha  -->  ahj juna

        String s1 = "anuj jha";
        System.out.println(s1);
        String s2 = "";

        for(int i=s1.length()-1; i>=0; i--){
            s2 = s2 + s1.charAt(i);
        }

        System.out.println(s2);



        // anuj jha --> jha anuj

        String s3 = "";
        String starr[] = s1.split(" ");

        for(int i=starr.length-1; i>=0; i--){
            s3 = s3+starr[i]+" ";
        }
        System.out.println(s3);


        // anuj jha --> juna ahj

        String s4 = "";
        String starr2[] = s1.split(" ");

        for (String elem : starr2) {
            for(int i=elem.length()-1; i>=0; i--){
                s4 = s4+elem.charAt(i);
            }
            s4 = s4+" ";
        }
        System.out.println(s4);

        System.out.println(Math.sqrt(64));
    }
}
