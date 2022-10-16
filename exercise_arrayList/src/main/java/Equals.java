import java.util.Objects;
public class Equals {
    
    private String model;
    private String manufacturer;
    private int productionYear;
    
    public Equals(String model, String manufacturer, int productionYear) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }
    
    public static void main(String[] args) {
        
        Equals chair1 = new Equals("Adde", "IKEA", 2016);
        Equals chair2 = new Equals("Janinge", "IKEA", 2016);
        Equals chair3 = new Equals("Adde", "IKEA", 2015);
        Equals chair4 = new Equals("Adde", "IKEA", 2016);
        
        System.out.println(chair1.equals(chair2));
        System.out.println(chair1.equals(chair3));
        System.out.println(chair1.equals(chair4));
    }
    
    public String getModel() {
        return model;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public int getProductionYear() {
        return productionYear;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, productionYear);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equals equals = (Equals) o;
        return Objects.equals(model, equals.model) && Objects.equals(manufacturer, equals.manufacturer) && Objects.equals(productionYear, equals.productionYear);
    }
}
