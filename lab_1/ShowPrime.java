// WAP in java to print prime number from 1 to 100

public class ShowPrime {
    public static void main(String [] args){
        System.out.println("Prime numbers:");
        // calculation for prime number
        // divided by 1 and itself

        for(int i=1; i<100; i++){
            int flag = 0;
            for(int j=1; j<=i/2; j++){
                if(i%j == 0){
                    flag ++;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }
        }
    }
}