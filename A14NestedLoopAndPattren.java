public class A14NestedLoopAndPattren {
    public static void main(String[] args) {
        
        /*
         *    * * * *
         *    * * * *
         *    * * * *
         *    * * * *
         */
        int n = 4;
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        /*
         *   *
         *   * *
         *   * * *
         *   * * * *
         * 
         */

         for(int row=1; row<=4; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();

        /*
                * * * *
                * * *
                * *
                *
         */
        for(int row=4; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         *    j=0 1 2 3 4 5
         *  i=0 * * * * * *
         *    1 *         *
         *    2 *         *     stars at : i=0, i=5, j=0, j=5
         *    3 *         *
         *    4 *         * 
         *    5 * * * * * * 
         */
        n = 6;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }


        /*            j=(n-1)/2
         *          j=0   |   j=n-1
         *  i=0       * * * * *
         *            *       *
         *  i=(n-1)/2 * * * * *
         *            *       *
         *  i=n-1     *       *
         * 
         * 
         */
        System.out.println(" ");
        n = 4;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||i==(n-1)/2||j==0||j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }



        /*            
         *          j=0      j=n-1
         *  i=0       *       *
         *            *       *
         *  i=(n-1)/2 * * * * *
         *            *       *
         *  i=n-1     *       *
         * 
         * 
         */
        System.out.println("  ");
        n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==(n-1)/2||j==0||j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }


        /*            j=(n-1)/2
         *          j=0   |   j=n-1
         *  i=0       * * * * *
         *                *    
         *  i=(n-1)/2     *    
         *                *   
         *  i=n-1     * * * * *
         * 
         * 
         */
        System.out.println("  ");
        n = 5; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||i==n-1||j==(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }


        /*            j=(n-1)/2
         *          j=0   |   j=n-1
         *  i=0       * * * * *
         *            *       
         *  i=(n-1)/2 * * * * *
         *            *       
         *  i=n-1     * * * * *  
         * 
         * 
         */
        System.out.println("");
        n = 5; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||i==(n-1)/2||i==n-1||j==0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }



         /*            j=(n-1)/2
         *          j=0   |   j=n-1
         *  i=0       * * * * *
         *            *       
         *  i=(n-1)/2 * * * * *
         *            *       
         *  i=n-1     *   
         * 
         * 
         */
        System.out.println("");
        n = 5; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||i==(n-1)/2||j==0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }




        /*                j=(n-1)/2
         *          j=0       |       j=n-1
         *  i=0         * * *   * * * *
         *            *       *
         *            *       *
         *            *       *
         *  i=(n-1)/2 * * * * *      
         *            *       *
         *            *       *
         *            *       *
         *  i=n-1     *       *
         * 
         */
        System.out.println("");
        n = 9; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j>0 && j<(n-1)/2 || 
                i==(n-1)/2 && j<(n-1)/2 || 
                j==0 && i>0 || 
                j==(n-1)/2 && i>0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }



         /*                j=(n-1)/2
         *          j=0       |       j=n-1
         *  i=0       * * * *   * * * *
         *            *       *
         *            *       *
         *            *       *
         *  i=(n-1)/2 *       *      
         *            *       *
         *            *       *
         *            *       *
         *  i=n-1     * * * *      
         * 
         */
        System.out.println("");
        n = 9; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j<(n-1)/2 || 
                i==(n-1) && j<(n-1)/2 || 
                j==0 || 
                j==(n-1)/2 && i>0 && i<n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }



         /*                j=(n-1)/2
         *          j=0       |       j=n-1
         *  i=0         * * *   * * * *          * * * *   * * * *
         *            *       *                  *       *
         *            *       *                  *       * 
         *            *       *                  *       *
         *  i=(n-1)/2 * * * * *                  *       *
         *            *       *                  *       *
         *            *       *                  *       *
         *            *       *                  *       *
         *  i=n-1     *       *                  * * * *
         * 
         */
        System.out.println("");
        n = 9; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j>0 && j<(n-1)/2 || 
                i==(n-1)/2 && j<(n-1)/2 || 
                j==0 && i>0 || 
                j==(n-1)/2 && i>0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("");
            for(int j=0; j<n; j++){
                if(i==0 && j<(n-1)/2 || 
                i==(n-1) && j<(n-1)/2 || 
                j==0 || 
                j==(n-1)/2 && i>0 && i<n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }



        //-------------------------------------------------------------------

        /*
         *  
         *        *     *
         *         *   *
         *          * *
         *           *  
         *          * *
         *         *   *
         *        *     *
         *    
         */
        System.out.println("");

         n = 7;
         for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
         }



          /*
          
                  * * * * * * *
                  * *       * *
                  *   *   *   *
                  *     *     *
                  *   *   *   *
                  * *       * *
                  * * * * * * *             
            
         */
        System.out.println("");

         n = 7;
         for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1 || i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
         }





      
                  
          /*          *
                    *   *
                  *       *
                *           *
              *               *
                *           *
                  *       *
                    *   *
                      *
          */

         System.out.println("");
         n=9;
         for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j == (n-1)+(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
         }
         
         
         
         
         /*
              * * * * * * * * *
              *     *   *     *
              *   *       *   *
              * *           * *
              *               *
              * *           * *
              *   *       *   *
              *     *   *     *
              * * * * * * * * *
          */
                           
         System.out.println("");
         n=9;
         for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1 ||
                   i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j == (n-1)+(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
         }





         /*
                 * * * * * * * * *
                 * *   *   *   * *
                 *   *       *   *
                 * *   *   *   * *
                 *       *       *
                 * *   *   *   * *
                 *   *       *   *
                 * *   *   *   * *
                 * * * * * * * * *
          */

        System.out.println(" ");
        n = 9;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||i==n-1||j==0||j==n-1 ||   //for outer boundry 
                   i==j || i+j==n-1 ||             //for diagonals
                   i+j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2 || i-j==(n-1)/2)  // for rhombus
                   {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }


        /*
         *     * * * * * * * * *
               *     *   *     *
               *   *       *   *
               * *           * *
               *               *
               * *           * *
               *   *       *   *
               *     *   *     *
               * * * * * * * * *
         * 
         */

        System.out.println(" ");
        n = 9;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2 || j==0&&i<(n-1)/2 || i+j==(n-1)/2 ||         // for upper left side
                i==n-1&&j<(n-1)/2 || j==0&&i>(n-1)/2 || i-j==(n-1)/2 ||          // for lower left side
                i==n-1&&j>(n-1)/2 || j==(n-1)&&i>(n-1)/2 || i+j==(n-1)+(n-1)/2 || //for lower right side
                i==0&&j>(n-1)/2 || j==(n-1)&&i<(n-1)/2 || j-i==(n-1)/2)           //for upper right side
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }



        /*
         *     * * * * * * * * *
               * * * *   * * * *
               * * *       * * *
               * *           * *
               *               *
               * *           * *
               * * *       * * *
               * * * *   * * * *  
               * * * * * * * * *
       
         */


        System.out.println(" ");
        n = 9;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2 || j==0&&i<(n-1)/2 || i+j<=(n-1)/2 ||         //for upper left side
                i==n-1&&j<(n-1)/2 || j==0&&i>(n-1)/2 || i-j>=(n-1)/2 ||          //for lower left side
                i==n-1&&j>(n-1)/2 || j==(n-1)&&i>(n-1)/2 || i+j>=(n-1)+(n-1)/2 ||//for lower right side
                i==0&&j>(n-1)/2 || j==(n-1)&&i<(n-1)/2 || j-i>=(n-1)/2)          //for upper right side 
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }


        
        //---------------------------Assignment-------------------------------

        // Write a program to print A, B, C, D, E, F, G, H using programming pattern
        n = 7;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0&&j>0&&j<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i==n-1&&j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<(n-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(i==0&&j>0&&j<(n-1)/2 || j==0&&i>0&&i<(n-1) || i==(n-1)&&j<(n-1)/2&&j>0 || j==(n-1)/2&&i>0&&i<(n-1)/2-1 || j==(n-1)/2&&i<(n-1)&&i>(n-1)/2+1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(j==0 || i==0&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2 || j==(n-1)/2&&i>0&&i<n-1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }


            for(int j=0; j<n; j++){
                if(j==0 || i==0&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }


            for(int j=0; j<n; j++){
                if(j==0 || i==0&&j<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(i==0&&j>0&&j<(n-1)/2 || j==0&&i>0&&i<(n-1) || i==(n-1)&&j<(n-1)/2&&j>0 || j==(n-1)/2&&i>0&&i<(n-1)/2-1 || j==(n-1)/2&&i<(n-1)&&i>(n-1)/2-1 || i==(n-1)/2&&j<(n-1)/2&&j>1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }


            for(int j=0; j<n; j++){
                if(j==0 || i==(n-1)/2&&j<(n-1)/2 || j==(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }


        // Write a program to print Triangle using star pattern programming logic.

        n = 6;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        // Program to print Pattern;
        /*
         * 
         * 
         *      * * * * * * * * * * * * * *
                * * * * * *   * * * * * * *
                * * * * *       * * * * * *
                * * * *           * * * * *  
                * * *               * * * *
                * *                   * * *
                *                       * *
                *                         *
                *                         *
                *                         *
                *                         *
                *                         *
                *                         *
                * * * * * * * * * * * * * *
         */

        n = 14; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||j==n-1||i==n-1||j==0 || i+j<=(n-1)/2 || j-i>=(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }



        // Program to print PW SKILLS
        n = 7;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2&&j>0||j==0||j==(n-1)/2&&i<(n-1)/2&&i>0||i==(n-1)/2&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(j==0||j==(n-1)||i+j==(n-1)&&i>=(n-1)/2||i==j&&i>=(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("       ");
            for(int j=0; j<n; j++){
                if(i==0&&j<=(n-1)/2&&j>0 || j==0&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2&&j>0 || 
                j==(n-1)/2&&i>(n-1)/2&&i<(n-1) || i==(n-1)&&j<(n-1)/2 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("");
            for(int j=0; j<n; j++){
                if(j==0||i-j==(n-1)/2||i+j==(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("");
            for(int j=0; j<n; j++){
                if(i==0||j==(n-1)/2||i==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("       ");
            for(int j=0; j<n; j++){
                if(j==0||i==(n-1)&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }


            System.out.print("");
            for(int j=0; j<n; j++){
                if(j==0||i==(n-1)&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }


        // My Name: 
        System.out.println("");
        n = 7; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2&&j>0||j==0&i>0||j==(n-1)/2&i>0||i==(n-1)/2&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(j==0||i==j||j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("      ");
            for(int j=0; j<n; j++){
                if(i==0||j==(n-1)/2&&i<(n-1)||i==(n-1)&&j<(n-1)/2&&j>0 || j==0&&i>(n-1)/2&&i<(n-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            
            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2&&j>0||j==0&i>0||j==(n-1)/2&i>0||i==(n-1)/2&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("");
            for(int j=0; j<n; j++){
                if(j==0||i==(n-1)&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("");
            for(int j=0; j<n; j++){
                if(i==0||j==(n-1)/2||i==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println(" ");
        }





        //----------------------------------------------------------------------


        // Self Practice 

        System.out.println("");
        n = 7; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2&&j>0||j==0&i>0||j==(n-1)/2&i>0||i==(n-1)/2&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2&&j>0||j==0&i>0||j==(n-1)/2&i>0||i==(n-1)/2&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("");
            for(int j=0; j<n; j++){
                if(j==0||i-j==(n-1)/2||i+j==(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(i==0&&j<(n-1)/2&&j>0||j==0&i>0||j==(n-1)/2&i>0||i==(n-1)/2&&j<(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("");
            for(int j=0; j<n; j++){
                if(i==0&&j<=(n-1)/2&&j>0 || j==0&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2&&j>0 || 
                j==(n-1)/2&&i>(n-1)/2&&i<(n-1) || i==(n-1)&&j<(n-1)/2 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=0; j<n; j++){
                if(j==0 || i==(n-1)/2&&j<(n-1)/2 || j==(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            

            System.out.println(" ");
        }




    }
}
