package isPerfectNumber;

public class Main {
    public static void main(String[] args) {
        //check if the number is perfect
        int number = 4;
        int sumOfDivisors = 0;

        for (int i = 1; i<=number; i++) {
             if(number % i == 0) sumOfDivisors += i;
        }

        System.out.println(number*2 == sumOfDivisors ? "Number is perfect." : "Number is not perfect!");
    }
}
