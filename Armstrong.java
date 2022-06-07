// WAP in java to print Armstrong number from 1 to 1000

public class Armstrong {
    public static void main(String [] args){
        System.out.println("Armstrong numbers:");

        // starting loop from 1 to 1000
        for(int i=1; i<1000; i++){
            // if number is equal to cube of individual digit
            // then it is armstrong

            int sum = 0, num = i;
            // to eject out digits
            while(num != 0){
                int rem = num%10;
                sum += rem*rem*rem;
                num = num/10;
            }

            // check condition and display
            if(i == sum){
                System.out.println(i);
            }
        }
    }
}
