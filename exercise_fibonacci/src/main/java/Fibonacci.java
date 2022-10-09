public class Fibonacci {
    
    public static void main(String[] args) {
        Fibonacci exercise2 = new Fibonacci();
        exercise2.fibonacci();
        exercise2.method2();
    }
    
    public void fibonacci() {
        int previousNumber = 0;
        int previousNumber2 = 0;
        int currentNumber;
        
        for (int n = 0; n < 10; n++) {
            switch (n) {
                case 0:
                    System.out.println(0);
                    previousNumber2 = 0;
                    continue;
                case 1:
                    System.out.println(1);
                    previousNumber = 1;
                    continue;
            }
            currentNumber = previousNumber2 + previousNumber;
            
            System.out.println(currentNumber);
            previousNumber2 = previousNumber;
            previousNumber = currentNumber;
        }
    }
    
    public void method2() {
        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("AB");
            } else if ((i % 3) == 0) {
                System.out.println("A");
            } else if ((i % 5) == 0) {
                System.out.println("B");
            } else {
                System.out.println(i);
            }
        }
    }
}
