public class Cart {
    private int customerId;
    private int nProduct;
    private Product[] products;
    public Cart(int customerId,int nProduct) {
        this.nProduct=Math.abs(nProduct);
        this.customerId=Math.abs(customerId);
        products=new Product[nProduct];}
    public void setCustomerId(int customerId) {this.customerId = customerId;}
    public void setnProduct(int nProduct) {this.nProduct = nProduct;}
    public void setProducts(Product[] products) {this.products = products;}
    public int getCustomerId() {return customerId;}
    public int getnproduct() {return nProduct;}
    public Product[] getProducts() {return products;}
    public void addProduct(int index,Product product){
    if(index>=0&&index<nProduct)
        products[index]=product;
    else
        System.out.println("invalid index");}
    public void removeProduct(int remove) {
        Product[] products=new Product[nProduct-1];
       }
    public float calculateProduct() {
        float sum = 0;
        for (int i = 0; i < nProduct; i++) {
            if (products != null)
                sum += products[i].getPrice();}
        return sum;}
   public void placeOrder(int orderid){
       Order order=new Order(customerId,orderid,calculateProduct(),products);
   order.printOrder();}}