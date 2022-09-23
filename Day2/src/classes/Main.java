package classes;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", "Asus Laptop", 5000, 3);
//        product1.setName("Laptop");
//        product1.setId(1);
//        product1.setDescription("Asus Laptop");
//        product1.setPrice(5000);
//        product1.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        System.out.println(product1.getCode());
    }
}
