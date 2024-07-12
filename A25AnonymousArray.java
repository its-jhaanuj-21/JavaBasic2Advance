class Calc{
    public int add(int a[]){
        int result = 0;
        for (int i : a) {
            result+=i;
        }
        return result;
    }
}

public class A25AnonymousArray {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5}; // here we have creted an array arr[]
        Calc c = new Calc();
        System.out.println(c.add(arr)); // printing sum of values of arr[]

        // Passing an anonymous array to a function.
        // In anonymous array we don't have to create a memory 
        // location / variable for storing values. 
        System.out.println(c.add(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
