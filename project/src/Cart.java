public class Cart {
    private int customerId;
    private int nProduct;
    private Product[] products=new Product[nProduct];
    Product p1=new Product();
    public void setCustomerId(int customerId) {
        if(customerId>0)
            this.customerId = customerId;
        else if(customerId<0)
            this.customerId = Math.abs(customerId);
    }
    public void setnProduct(int nProduct) {
        if(nProduct>0)
            this.nProduct = nProduct;
        else if(nProduct<0)
            this.nProduct = Math.abs(nProduct);
    }
    public void setProducts(Product[] products) {this.products = products;}
    public int getCustomerId() {return customerId;}
    public int getnProduct() {return nProduct;}
    public Product[] getProducts() {return products;}
    public Product[] addProduct(int x){
        for(int i=0;i<nProduct;i++){
        if(x==1){
            products [i]=new ElectronicProduct(1, "Smart phone",599.9f,"Samsung",1);
        } else if (x==2) {
           products [i]=new ClothingProduct(2,"T-Shirt",19.99f,"Medium","Cotton");
        } else if (x==3) {
            products[i]=new BookProduct(3,"OOP",39.99f,"O'Reilly","X Publications");
        }}
        return products;
    }
    public void removeProduct(){
    Product[] newproducts=new Product[products.length-1];
    }
    public float calculateProduct(){
    float sum=0;
    return sum+= p1.getPrice();
    }
    public void placeOrder(){
        System.out.println("have a good day!");}}