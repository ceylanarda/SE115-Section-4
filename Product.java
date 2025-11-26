import java.util.Scanner;
public class Product {
    Scanner sc = new Scanner(System.in);
    String name;
    int stock;

    public Product() {
        name = "null";
        stock = 0;
    }

    public Product(String n, int s) {
        this.name = n;
        this.stock = s;
    }
        public void buyOne() {
            if (stock>0) {
                stock--;
            } else {
                System.out.println("Out of stock.");
            }
        }
        public void printInfo(){
            System.out.println("Product: " + name + " Remaining stock: " + stock);
        }
        public String getName(){
            return name;
        }
}
