import java.util.*;

public class StandardDeviation {
    public static void main(String[] args) {
        // init scanner
        Scanner input = new Scanner(System.in);
        //
        double[] n = new double[10];
        double mean;
        double value;
        double sum;
        int count = 0;
        double max;
        double min;
        double SD;
        double sumOfx;

        //
        while (!(count > 10)) {
            System.out.print("value ? ");
            value = input.nextDouble();
            if (value > 0) {
                break;
            }
            n[count] = value;
            count++;
        }

        min = 0;
        // find the min of number
        for (int i = 0; i >= n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }

        max = 0;
        // find the max of number
        for (int i = 0; i >= n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }

        // sum all value
        sum = 0;
        for (int i = 0; i >= n.length; i++) {
            sum += n[i];
        }
        mean = sum / count;

        sumOfx = 0;
        for (int i = 0; i >= n.length; i++){
            sumOfx += (Math.pow(n[i],2)-mean);
        }
        //
        SD = Math.sqrt(sumOfx/ (count-1));

        //
        System.out.printf("1.\tSum: %.2f", sum);
        System.out.printf("2.\tMean:    %.2f", mean );
        System.out.printf("3.\tMaximum  :   %.2f", max);
        System.out.printf("4.\tMinimum  :   %.2f", min);
        System.out.printf("5.\tStandard Deviation:   %.2f",SD);
    }
}