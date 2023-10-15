import java.util.Scanner;

public class Pattern4 {
    public static void main(String [] args){
        // init
        Scanner input = new Scanner(System.in);

        // init variable
        int num;
        String s = "";

        System.out.print("number ?");
        num = input.nextInt();
        // for (int i = 1; i<= num;i++){
        //     for(int j = 1 ; j < i ; j++){
        //         System.out.print(i);
        //     }
        // }
        for (int j = num; j > 0; j--){
            s = "";
            for (int i = 1 ; i <= j ; i++){
                s += i;
            }
            System.out.println(s);
        }
    }
}