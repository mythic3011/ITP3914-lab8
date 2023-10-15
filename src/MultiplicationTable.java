public class MultiplicationTable {
    public static void main(String[]args){
        // init variable
        String k = "+";
        String e = "    ";
        int [][] mtable = new int [10][10];
        // print 0 to mtable.length
        for(int i = 0; i < mtable.length; i++){
            e += i + "  ";
        }
        System.out.println(e);
//        System.out.println("    0  1  2  3  4  5  6  7  8  9");

        // print line
        for (int i = 0; i < mtable.length; i++){
            k += "---";
        }
        System.out.println(k);

        for (int i = 0 ; i < mtable.length; i++){
            System.out.print(i+ "|");
            for (int j = 0 ;j < mtable[i].length; j++){
                // cal value and insert it into array
                mtable[i][j] = i * j;
                // if var of table less
                if(mtable[i][j] < 10){
                    System.out.print(" ");
                }
                System.out.print(" " + mtable[i][j]);
                // for advanced method
                // use printf to format output
                // System.out.printf("%2d", mtable[i][j]);
            }
            System.out.println();
        }
    }
}