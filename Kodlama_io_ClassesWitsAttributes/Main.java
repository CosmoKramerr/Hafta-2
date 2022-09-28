public class Main {
    public static void main(String[] args) {
        // includes the videos 31-32-33-34
        Product product = new Product(1, "Laptop", "Asus Laptop", 30000, 2, "Black");
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());

        Product product1 = new Product();
        product1.setId(2);
        product1.setName("Smartphone");
        product1.setPrice(35000);
        product1.setStockAmount(5);
        product1.setColor("Black");
        product1.setDescription("iPhone 14");
        System.out.println(product1.getCode());


    }
}
