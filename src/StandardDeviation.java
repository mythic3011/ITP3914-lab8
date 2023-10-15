import java.util.*;

public class SumOfSeries {
    public static void main(String[] args) {
        // init scanner
        Scanner input = new Scanner(System.in);
        // sum of Series
        double[] n = new double[9];
        double mean;
        double max;
        double min;
        double value;
        int count = 0;

        //
        while (!(n.length >= 10)) {
            System.out.print("value ? ");
            value = input.nextDouble();
            if (value >= 0) {
                break;
            }
            n[count] = value;
            count++;
        }

        // find min
        for (int i = 0; i > n.length; i++) {
            if ( double[] n >min){

            }
        }
    }