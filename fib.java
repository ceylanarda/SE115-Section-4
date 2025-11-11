import java.util.Scanner;
public class fib {
    public static int fib(int n){
       if (n<=1){
           return n;
       }
       int f0 = 0;
       int f1 = 1;
       int current = 0;
       for (int i = 2; i<=n;i++){
           current = f0 + f1;
           f0 = 1;
           f1 = current;
       }
       return f1;
    }
    public static void main(String[] args){
        int n =10;
        System.out.println(fib(n));
    }
}
