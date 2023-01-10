import java.util.Scanner;
public class Recurrency {
    
    
    
    public int r(int n) {
        if (n==1) return 1;
        return n * r(n-1);
        }
    
    
    public static void main(String[] args) {
        System.out.println("Please insert number to compute silnia : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        Recurrency recurrency = new Recurrency();
        System.out.println(recurrency.r(number));
    }
}
