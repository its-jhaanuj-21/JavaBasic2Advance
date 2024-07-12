public class A23JaggedArray {
    public static void main(String[] args) {
        /*
         * Jagged Array: Every rows have diffrent column
         */

        int arr1[][] = {{1,2,3},
                        {4,5},
                        {6,7,8,9}};
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }


        
        int arr2[][] = new int[3][];
        arr2[0] = new int[3];
        arr2[1] = new int[2];
        arr2[2] = new int[4];

        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[2][0] = 6;
        arr2[2][1] = 7;
        arr2[2][2] = 8;
        arr2[2][3] = 9;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
