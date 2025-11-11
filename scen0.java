import java.util.Scanner;
public class scen0 {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number for Factorial calculations: ");
        int n = sc.nextInt();
        int product = 1;
        System.out.println("Your answer is: ");
        for (int i = n;i>0;i--){
            product*=i;
            if (n <0){
                break;
            }
        if (n==0){
            System.out.print("1");
        }
        }
        System.out.print(product);
    }
}
