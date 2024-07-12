public class A24EnhancedForLoop {
    public static void main(String[] args) {
        

        // Enhanced for loop for 1-D Array: 
        
        int arr1 [] = {1,2,3,4,5,6};
        //printing array from enhanced for loop
        for (int i : arr1) {
            System.out.print(i+" ");
        } 
        System.out.println("");
        // i fetched each element of an array arr1 and printed on console


        // Enhanced for loop for 2-D Array:

        int arr2 [][] = {{1,2,3}, 
                         {4,5,6}};
        for(int i[] : arr2){
            for(int j: i ){
                System.out.print(j+" ");
            }
            System.out.println("");
        } 


        // Enhanced for loop for jagged Array:

        int arr3 [][] = {{1,2}, 
                         {3,4,5},
                         {6,7,8,9}};
        for(int i[]: arr3){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println("");
        }



    }
}
