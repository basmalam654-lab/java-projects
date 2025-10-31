public class Customer {
    public Customer() {
        this.customerId =Math.abs(customerId);
        this.name=name;
        this.address=address;}
    private int customerId;
        private String name;
        private String address;
        public void setCustomerId(int customerId) {this.customerId = customerId;}
        public void setName(String name) {this.name = name;}
        public void setAddress(String address) {this.address = address;}
        public int getCustomerId() {return customerId;}
        public String getName() {return name;}
        public String getAddress() {return address;}}