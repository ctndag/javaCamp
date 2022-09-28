package classesWithAttributes;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "asus laptop", 3000, 3, "siyah");

        /* product.name="Laptop";
        product.id=1;
        product.description="Asus Laptop";
        product.price=5000;
        product.stockAmount=3; */

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }

}