package checkFriendlyNumbers;

public class Main {
    public static void main(String[] args) {
        //check if are numbers friendly numbers
        int number1 = 220, number2 = 284;
        int sumOfNumber1Divisors = 0, sumOfNumber2Divisors = 0;
        boolean isNumber1Matched = false, isNumber2Matched = false;

        for (int i = 1; i<number1; i++) {
            if (number1 % i == 0) sumOfNumber1Divisors += i;
            if (sumOfNumber1Divisors == number2) isNumber1Matched = true;
        }

        for (int i = 1; i<number2; i++) {
            if(number2 % i == 0) sumOfNumber2Divisors += i;
            if (sumOfNumber2Divisors == number1) isNumber2Matched = true;
        }

        if (isNumber1Matched && isNumber2Matched) System.out.println("Friendly.");
        else System.out.println("Not friendly!");
    }
}
