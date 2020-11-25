package power_series;
import java.util.Scanner;

public class e_to_the_x {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("power to raise e to: ");
        int x = scan.nextInt();
        System.out.println("level of accuracy: ");
        int iterations = scan.nextInt();

        System.out.println("e^" + x + " = " + calculate(x, iterations));
    }

    //calculates the sum
    public static float calculate(int x, int iterations) {
        if(x==0)
            return 1;
        float sum=0;
        for(int i = 0; i <= iterations; i++) {
            sum+= (Math.pow(x, i))/(factorial(i));
        } return sum;
    }

    //recursive factorial calculator
    public static int factorial(int sample) {
        if(sample==1 || sample==0)
            return 1;
        else
            return sample * factorial(sample-1);
    }

}
