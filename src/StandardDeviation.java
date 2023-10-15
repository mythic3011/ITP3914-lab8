import java.util.*;

public class StandardDeviation {
    public static void main(String[] args) {
        // init scanner
        Scanner input = new Scanner(System.in);
        // init array
        double[] n = new double[10];
        // init variable
        int count = 0;
        double max;
        double min;
        double SD;
        double sumOfx;
        double mean;
        double sum;

        while (count < 10) {
            System.out.print("value ? ");
            double value = input.nextDouble();
            // if value less than zero break loop
            if (value < 0) {
                System.out.println("invalid value");
                break;
            }else{
                // insert value into array
                n[count] = value;
                count++;
            }
        }

        // if count more than 1
        if (count >= 1) {
            min = n[0];
            max = n[0];
            // find the min of number and max of number
            for (int i = 0; i < count; i++) {
                if (n[i] < min) {
                    min = n[i];
                }
                if (n[i] > max) {
                    max = n[i];
                }
            }

            // sum all value
            sum = 0;
            for (int i = 0; i < count; i++) {
                sum += n[i];
            }
            // find mean
            mean = sum / count;

            // find standard deviation
            sumOfx = 0; // sum of x
            for (int i = 0; i <count; i++) {
                sumOfx += (Math.pow(n[i], 2) - mean);
            }
            // find standard deviation
            SD = Math.sqrt(sumOfx / (count - 1));

            // print result
            System.out.printf("1.\tSum: %.2f\n", sum);
            System.out.printf("2.\tMean: %.2f\n", mean);
            System.out.printf("3.\tMaximum: %.2f\n", max);
            System.out.printf("4.\tMinimum: %.2f\n", min);
            System.out.printf("5.\tStandard Deviation: %.2f\n", SD);
        }
    }
}