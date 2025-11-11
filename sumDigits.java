import java.util.Scanner;
public class sumDigits {
    public static int sumDigits(int n){
        int Mutlak = Math.abs(n);
        if (Mutlak<10){
            return Mutlak;
        }
        else{
            return (Mutlak % 10) + sumDigits(Mutlak/10);
        }
    }
    public static void main(String[]Args){
        System.out.println("Enter a Number:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Toplamı " + sumDigits(n));
    }
}
