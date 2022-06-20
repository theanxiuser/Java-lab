// WAP in java to print even number from 1 to 100

public class ShowEven{
    public static void main(String [] args){
        System.out.println("Even numbers:");
        // divided by 2 are even

        for(int i=1; i<100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}