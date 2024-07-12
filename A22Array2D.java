public class A22Array2D {
    public static void main(String[] args) {
        
        /*
         *  2-D Array is just like matrix that is store in rows and column
         * 
         */

        int num [][] = new int[2][3]; // 1st bolck: rows , 2nd block: column : 2rows 3column
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        num[1][0] = 4;
        num[1][1] = 5;
        num[1][2] = 6;

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }


        
        int num1[][] = { {1,2,3},
                         {4,5,6} };
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(num1[i][j]+" ");
            }
            System.out.println("");
        }



    }
}
