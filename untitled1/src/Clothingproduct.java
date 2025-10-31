public class Clothingproduct extends Product {
    private String size;
    private String fabric;
    public Clothingproduct(int productId,String name,float price,String size,String fabric){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.fabric=fabric;
        this.size = size;}
    public void setSize() {String size;}
    public void setFabric() {String fabric;}
    public String getSize() {return size;}
    public String getFabric() {return fabric;}}