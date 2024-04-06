public class Product {
    private String code;
    private String description;
    private double price;

    // No-argument constructor
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0.0;
    }

    // Accessor and mutator methods
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Code: " + code + "\nDescription: " + description + "\nPrice: $" + String.format("%,6.2f", price);
    }
}