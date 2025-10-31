import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[]args){
        System.out.println("Welcome to the E-commerce System!");
        Scanner input=new Scanner(System.in);
        Customer c=new Customer();
        Cart c1=new Cart();
        Order order=new Order();
        System.out.println("please enter your id");
        c.setCustomerId(input.nextInt());
        System.out.println("please enter your name");
        c.setName(input.nextLine());
        System.out.println("please enter your address");
        c.setAddress(input.nextLine());
        System.out.println("how many products you want add to your cart?");
        c1.setnProduct(input.nextInt());
        for(int i=0;i<c1.getnProduct();i++){
            System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
            int respond=input.nextInt();

                if(x==1){
                    products [i]=new ElectronicProduct(1, "Smart phone",599.9f,"Samsung",1);
                } else if (x==2) {
                    products [i]=new ClothingProduct(2,"T-Shirt",19.99f,"Medium","Cotton");
                } else if (x==3) {
                    products[i]=new BookProduct(3,"OOP",39.99f,"O'Reilly","X Publications");
                }}
        }
        System.out.println("Your total is $"+c1.calculateProduct()+". Would you like to place the order? 1- Yes 2- No");
        int y= input.nextInt();
        if(y==1){
            for(int k=0;k< c1.getnProduct();k++){
                order.printOrder();
            }}
        c1.placeOrder();}}