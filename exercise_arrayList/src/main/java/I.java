public interface I {
    int i = 0;
    String wojtek = "lalal";
    
    void doSth();
}

class blabla implements I {
    @Override
    public void doSth() {
        System.out.println("doITsth!");
    }
    public static void main(String[] args) {
        I interfaceI = new blabla();
        
        blabla interfaceB = new blabla();
    }
}

