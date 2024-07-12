import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Assignment {
    public static void main(String[] args) {
        // int n=5;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<n; j++){
        //         if(j==0||i==(n-1)/2){
        //             System.out.print("*");
        //         }
        //     }
        //     for(int j=0; j<n; j++){
        //         if(j==0);
        //     }
        //     System.out.println(" ");
        // }


        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
            
        //     for (int k = 1; k <= (2 * i) - 1; k++) {
        //         if (k == 1 || k == (2 * i) - 1 || i == n / 2 + 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
            
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row and Column of 1st Matrix: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("Enter Elements of First Matrix: ");
        int arr1[][] = new int[row1][col1];
        for (int i = 0; i < arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++){
                arr1[i][j] = sc.nextInt(); 
            }
        }

        // for (int i[] : arr1) {
        //     for(int j: i){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }

        System.out.println("Enter Row and Column of 2nd Matrix: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        System.out.println("Enter Elements of Second Matrix: ");
        int arr2[][] = new int[row2][col2];
        for (int i = 0; i < arr2.length; i++) {
            for(int j=0; j<arr2[i].length; j++){
                arr2[i][j] = sc.nextInt(); 
            }
        }

        if(col1 != row2){
            System.out.println("MM is not possible");
        }else{
            int res[][] = new int[row1][col2];
            for (int i = 0; i < res.length; i++) {
                for(int j=0; j<res[i].length; j++){
                    for(int k =0; k<row1; k++){
                        res[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for (int i = 0; i < res.length; i++) {
                for(int j=0; j<res[i].length; j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println(" ");
            }
        }


    }
}