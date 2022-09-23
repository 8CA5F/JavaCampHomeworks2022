package methods;

public class Main {
    public static void main(String[] args) {
        findNumber();
        sayNames("John", "Alice", "Eric", "Jessica");
    }
        //method without parameter
        public static void findNumber() {
            int number = 9;
            int numbers[] = new int[]{1,3,11,23,87,9};
            boolean isMatched = false;

            for (int i = 0; i<numbers.length; i++) {
                if (numbers[i] == number) {
                    isMatched = true;
                    break;
                }
            }

            result(isMatched ? "Number found." : "Number not found!");
        }

        //method with parameter
        public static void result(String message){
            System.out.println(message);
        }

        //Variable arguments
        public static void sayNames(String... names) {
            for (String name : names) {
                System.out.println(name);
            }
        }
}
