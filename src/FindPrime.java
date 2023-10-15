public class FindPrime {
    public static void main(String[] args) {
        int count = 1;
        System.out.print(2);  // Two is the first prime number
        int num = 2;
        int calculatio = 0; //
        while (count < 20) {
            num++;// try next number
            boolean isPrime = true;
            // skip 2 and all even numbers (divisible by 2)
            for (int i = 3; i < num; i += 2) {
                if (num % i == 0)    // divisible by i
                    isPrime = false;    // not a prime
                calculatio++;
            }
            if (isPrime) {
                count++;    // one more prime is found
                System.out.print(", " + num);
            }
        }
        System.out.println("\nDone");
        System.out.println("Total calculation = " + calculatio);
    }
}