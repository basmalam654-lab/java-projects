public class BookProduct extends Product{
    /*public BookProduct(){
        productId=3;
        name="OOP";
        price=39.99f;
        author="O'Reilly";
        address="X Publications";
    }*/
    public BookProduct(int productId,String name,float price,String author,String address){
        super(int productId,String name,float price);
       this.author= author;
       this.address= address;
    }
    private String author;
    private String address;
    public void setAuthor() {String author;}
    public void setAddress() {String address;}
    public String getAuthor() {return author;}
    public String getAddress() {return address;}}