public class Product {
    public Product(){
        this.productId=Math.abs(productId);
        this.name=name;
        this.price = Math.abs(price);}
    int productId;
    String name;
    float price;
    public void setProductId(int productId) {this.productId = productId;}
    public void setName(String name) {this.name = name;}
    public void setPrice(float price) {this.price = price;}
    public int getProductId() {return productId;}
    public String getName() {return name;}
    public float getPrice() {return price;}}