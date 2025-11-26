import java.util.Scanner;
public class ProductDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("How many products the store has?");
        int count = sc.nextInt();
        sc.nextLine();
        Product[] products=new Product[count];
        for (int i =0;i<products.length;i++){
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Stock: ");
            int stock = sc.nextInt();
            sc.nextLine();
            products[i]=new Product(name, stock);
        }
        System.out.println("Shopping!");
        while (true){
            System.out.println("Enter a product name (Press Q for quit.) : ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Q")){
                break;
            }
            boolean found = false;
            for(int i =0;i< products.length;i++){
                if(products[i].getName().equalsIgnoreCase(input)){
                    products[i].buyOne();
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Product is unavailable.");
            }
        }
        System.out.println("Stock Status: ");
        for(Product p : products){
            p.printInfo();
        }
    }
}
