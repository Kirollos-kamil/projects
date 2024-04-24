package e.commerce.system;

public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyPeriod;

    public ElectronicProduct(String brand, int warrantyPeriod, int productId, String name, double price) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

}