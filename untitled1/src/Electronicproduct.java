public class Electronicproduct extends Product {
    public Electronicproduct(int productId,String name,float price,String brand,int Warrantyperiod){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.brand= brand;
        this.WarrantyPeriod=Math.abs(WarrantyPeriod);}
    private String brand;
    private int WarrantyPeriod;

    public void setBrand() {String brand;}
    public void setWarrantyPeriod() {this.WarrantyPeriod=WarrantyPeriod;}
    public String getBrand() {return brand;}
    public int getWarrantyPeriod() {return WarrantyPeriod;}}