import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        // Since PI can't be changed final keyword is needed
        final double PI = Math.PI;
        // init variable
        double x; // value of x
        double sum; // sum of series
        double term; // term of series
        double sign; // sign of term
        double power; // power of x
        double fact; // factorial

        // init scanner
        Scanner input = new Scanner(System.in);

        // for loop
        // get value of x
        System.out.print("x ? ");
        x = input.nextDouble();

        // if x less than -PI or more than +PI print invalid value
        if (x < -PI || x > PI) {
            System.out.println("invalid value");
        } else {
            // calculate sum of series
            sum = 0;
            sign = 1;
            // start from 1 to 27
            for (int i = 1; i <= 27; i += 2) {
                power = Math.pow(x, i);
                fact = 1;
                for (int j = 1; j <= i; j++) {
                    fact *= j;
                }
                // calculate term
                term = sign * power / fact;
                // add term to sum
                sum += term;
                // change sign
                sign *= -1;
            }
            System.out.printf("sin(%.2f) = %.2f\n", x, sum);
        }
    }
}
