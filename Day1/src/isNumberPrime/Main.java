package isNumberPrime;

public class Main {
    public static void main(String[] args) {
        //prime numbers up to one hundred
        boolean isPrime = false;

        outer:
        for(int i = 2; i<=100; i++) {
             for (int j = 2; j<i; j++) {
                if(i % j == 0) continue outer;
                else isPrime = true;
             }

             if(isPrime || i == 2) System.out.println(i + " is prime.");
             isPrime = false;
        }
    }
}
