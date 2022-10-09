public class Modulo {
    
    public static void main(String[] args) {
        Modulo modulo = new Modulo();
        modulo.method1();
    }
    
    public void method1() {
        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FIZZBUZZ");
            } else if ((i % 3) == 0) {
                System.out.println("FIZZ");
            } else if ((i % 5) == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }
}
