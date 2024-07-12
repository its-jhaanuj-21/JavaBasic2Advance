public class A11SwitchCase {
    public static void main(String[] args) {
        
        int day = 4;

        switch(day){
            case 1: 
              System.out.println("Mon");
              break;                       
            case 2:
              System.out.println("Tues");
              break;
            case 3:
              System.out.println("Wed");
              break;
            case 4:
              System.out.println("Thru");
              break;
            case 5:
              System.out.println("Fri");
              break;
            case 6:
              System.out.println("Sat");
              break;
            case 7:
              System.out.println("Sun");
              break;
            default:
              System.out.println("Wrong Choice");
        }

        // Note : if break is not used then all cases will execute after that one one matching case within switch
        

    }
}
