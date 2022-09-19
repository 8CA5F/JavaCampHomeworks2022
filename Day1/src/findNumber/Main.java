package findNumber;

public class Main {
    public static void main(String[] args) {
        //check if is "number" in "numbers"
        int number = 9;
        int[] numbers = new int[]{1,3,11,23,87,9};
        boolean isMatched = false;

        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] == number) {
                isMatched = true;
                break;
            }
        }

        System.out.println(isMatched ? "Number found." : "Number not found!");
    }
}
