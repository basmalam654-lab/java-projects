public class ClothingProduct extends Product{
    private String size;
    private String fabric;
    public ClothingProduct(int productId,String name,float price,String size,String fabric){
        super(int productId,String name,float price);
        this.fabric=fabric;
        this.size = size;
    }
    public void setSize() {String size;}
    public void setFabric() {String fabric;}
    public String getSize() {return size;}
    public String getFabric() {return fabric;}

    
}