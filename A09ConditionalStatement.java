public class A09ConditionalStatement {
    public static void main(String[] args) {
        
        // if statement
        int a = 19; 
        if(a>=18){
            System.out.println("Adult");
        }


        // if-else statement 
        int age = 12;
        if(age>=18){
            System.out.println("You are an Adult");
        }else{
            System.out.println("You're not an Adult");
        }


        // if-else-if
        int age2 = 89;
        if(age2<=12){
            System.out.println("Child");
        }else if(age2>12 && age2<18){
            System.out.println("Teenager");
        }else if(age2>=18 && age2<=50){
            System.out.println("Adult");
        }else{
            System.out.println("Old");
        }


    }
}
