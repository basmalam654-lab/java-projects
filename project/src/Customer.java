public class Customer {
    private int customerId;
    private String name;
    private String address;
    public void setCustomerId(int customerId) {
        if (customerId>0)
        this.customerId = customerId;
        else if (customerId<0)
        this.customerId = Math.abs(customerId);
    }
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public int getCustomerId() {return customerId;}
    public String getName() {return name;}
    public String getAddress() {return address;}}