 public class Bookproduct extends Product {
        public Bookproduct(int productId, String name, float price, String author, String address) {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.author = author;
            this.address = address;}
        private String author;
        private String address;
        public void setAuthor() {String author;}
        public void setAddress() {String address;}
        public String getAuthor() {return author;}
        public String getAddress() {return address;}}