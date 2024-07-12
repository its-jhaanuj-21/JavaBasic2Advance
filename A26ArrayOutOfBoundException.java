public class A26ArrayOutOfBoundException {
    public static void main(String[] args) {
        
        /* 
        If we try to featch the values of an array at out of bond (out of the length of the 
        array / index which is greter than available indexes) then we get an error 
        ArrayOutOfBondException
        */  

        int arr [] = {1,2,3,4};
        System.out.println(arr[0]); // valid
        System.out.println(arr[1]); // valid
        System.out.println(arr[2]); // valid
        System.out.println(arr[3]); // valid

        // System.out.println(arr[4]); // invalid 
    }
}
