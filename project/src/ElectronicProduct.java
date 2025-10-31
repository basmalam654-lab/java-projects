public class ElectronicProduct extends Product {
    public ElectronicProduct(int productId,String name,float price,String brand,int Warrantyperiod){
        super(int productId,String name,float price);
        this.brand= brand;
        this.WarrantyPeriod= WarrantyPeriod;
    }
    private String brand;
    private int WarrantyPeriod;

    public void setBrand() {
        String brand;
    }
    public void setWarrantyPeriod() {
        if(WarrantyPeriod>0){
            int warrantyPeriod;}
        else if (WarrantyPeriod<0){
            this.WarrantyPeriod=Math.abs(WarrantyPeriod);}
    }
    public String getBrand() {return brand;}
    public int getWarrantyPeriod() {return WarrantyPeriod;}}