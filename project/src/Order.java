public class Order {
    private int customerId;
    private int orderId;
    int nproduct;
    private float totalPrice;
    private Product[] products=new Product[nproduct];
    Cart c=new Cart();
    Customer c1=new Customer();
    public void setCustomerId(int customerId) {
        if (customerId>0)
            this.customerId = customerId;
        else if (customerId<0)
            this.customerId = Math.abs(customerId);
    }
    public void setOrderId(int orderId) {
        if(orderId>0)
            this.orderId = orderId;
        else if(orderId<0)
            this.orderId = Math.abs(orderId);
    }
    public void setProducts(Product[] products) {this.products = products;}
    public void setTotalPrice(float totalPrice) {this.totalPrice = totalPrice;}
    public int getCustomerId() {return customerId;}
    public int getOrderId() {return orderId;}
    public Product[] getProducts() {return products;}
    public float getTotalPrice() {return totalPrice;}
    public void printOrder(){
        System.out.println("Here's your order's summary:"+"\nOrder ID: 1"+"\nCustomer ID:"+customerId+"\nProducts");}}