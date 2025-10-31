public class Order {
    public Order(int customerId,int orderId,float totalPrice,Product[] products){
        this.customerId=Math.abs(customerId);
        this.orderId=Math.abs(orderId);
        this.totalPrice=totalPrice;
        this.products=products;}
    private int customerId;
    private int orderId;
    private float totalPrice;
    private Product[] products;
    public void setCustomerId(int customerId) {this.customerId = customerId;}
    public void setOrderId(int orderId) {this.orderId = orderId;}
    public void setProducts(Product[] products) {this.products = products;}
    public void setTotalPrice(float totalPrice) {this.totalPrice = totalPrice;}
    public int getCustomerId() {return customerId;}
    public int getOrderId() {return orderId;}
    public Product[] getProducts() {return products;}
    public float getTotalPrice() {return totalPrice;}
    public void printOrder(){
        System.out.println("Here's your order's summary:"+"\nOrder ID: "+orderId+"\nCustomer ID: "+customerId+"\nProducts: ");
        for(int i=0;i<products.length;i++){
            if (products[i]!= null){
            System.out.println(products[i].getName()+"- $"+products[i].getPrice());}}
            System.out.println("Total price : $"+totalPrice);
    }}