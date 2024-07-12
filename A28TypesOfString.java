/*
 * Two types of String in Java : 
 *   1.  Mutable String   : Changable     : StringBuilder & StringBuffer
 *   2.  Immutable String : Non Changable : String
 */
public class A28TypesOfString {
    public static void main(String[] args) {
        String name = "Anuj";
        System.out.println(name);    // Anuj
        name.concat(" Jha");     
        System.out.println(name);    // Anuj

        StringBuilder name2 = new StringBuilder("Anuj");
        System.out.println(name2);   // Anuj
        name2.append(" Jha");
        System.out.println(name2);   // Anuj Jha

         /*
              Before Any Opeartion 

                                  Heap (Address: 101)
                                     ****************
          ***************    ----->  *  Anuj        * Before any operation (name is refrencing)
          * name * 101  *            ****************   
          ***************         
          *             *         
          *             *            ****************
          ***************            *  Anuj        *  Before any operation (name2 is refrencing)
          * name2 * 102 *    ----->  ****************
          ***************          
             stack                 Heap (Address: 102)
                                                 
          
         */


          /*
                                  Heap (Address: 101)
                                     ****************
          ***************    ----->  *  Anuj        * 
          * name * 101  *            ****************   
          ***************            *  Anuj Jha    * After concat new object is created (No any refrence)
          *             *            ****************
          *             *
          ***************            ****************
          * name2 * 102 *    ----->  *  Anuj Jha    *  After append Anuj->Anuj Jha, (no new obj is created)  (name2 is refrencing)
          ***************            ****************   
             stack                 Heap (Address: 102)
                                                 
          
         */
    }
}
