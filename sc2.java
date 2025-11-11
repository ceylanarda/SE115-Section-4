import java.util.Scanner;
public class sc2 {
    public static long power(long base, int exp){
        if (exp<0){
            System.out.println("Exponent can't be negative.");
        }
        if(exp == 0) return 1;
        return base * power(base, exp-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your base: ");
        long base = sc.nextInt();
        System.out.print("Enter your Exponent: ");
        int exp = sc.nextInt();
        System.out.println();
        long result = power(base, exp);
        System.out.println(result);
    }
}
