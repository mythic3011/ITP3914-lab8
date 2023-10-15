import java.util.Scanner;

public class Pattern2 {
    public static void main(String [] args){
        // init
        Scanner input = new Scanner(System.in);

        // init variable
        int num;
        String s = "";
        System.out.print("number ? ");
        num = input.nextInt();
        //
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=num-i; j++)
                System.out.print(" ");
            for (int k = 1 ; k<=i;k++){
                System.out.print(k);
            }
            System.out.println(s);
        }
    }
}