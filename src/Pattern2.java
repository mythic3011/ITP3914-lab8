import java.util.Scanner;

public class Pattern {
    public static void main(String [] args){
        // init
        Scanner input = new Scanner(System.in);

        // init variable
        int num;
        String s;
        System.out.print("number ? ");
        num = input.nextInt();
        //
        for (int i=1; i<=num; i++) {
            s = "";
            for (int k = 1 ; k<=i;k++){
                s += k;
            }
            System.out.println(s);
        }
    }
}