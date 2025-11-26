public class Book {
    String Title;
    int Pages;
    public Book(){
        Title="null";
        Pages=0;
    }
    public Book(String title, int pages) {
        Title = title;
        Pages = pages;
    }
    public void addPages(int n){
        Pages=Pages+n;
        System.out.println("Now you have " + Pages + " pages.");
    }
    public void printBook(){
        System.out.println("The title is: " + Title);
        System.out.println("Page number is: " + Pages);
    }
}
