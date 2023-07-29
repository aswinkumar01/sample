import java.util.Scanner;

public class FibonacciSeries {
    static void Fibonacci(int n){
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2+" ");
        for(int i=1;i<=n;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        Fibonacci(n);
        
    }
}
