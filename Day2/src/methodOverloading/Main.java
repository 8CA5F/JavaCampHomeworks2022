package methodOverloading;

public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        System.out.println(fourOperations.addition(2,4));
        System.out.println(fourOperations.addition(2,4,6));
    }
}
