public class BookDemo {
    public static void main(String[] args){
        Book b1 = new Book("Java ",50);
        Book b2 = b1;
        b2.addPages(20);
        System.out.println("b1 is: ");
        b1.printBook();
        System.out.println("b2 is: ");
        b2.printBook();
    }
}
