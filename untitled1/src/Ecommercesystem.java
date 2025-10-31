import java.util.Scanner;
public class Ecommercesystem {
    public static void main(String[] args) {
                System.out.println("Welcome to the E-commerce System!");
                Scanner input=new Scanner(System.in);
                Customer c=new Customer();
                System.out.println("please enter your id");
                c.setCustomerId(input.nextInt());
                System.out.println("please enter your name");
                c.setName(input.nextLine());
                c.setName(input.next());
                System.out.println("please enter your address");
                c.setAddress(input.nextLine());
                c.setAddress(input.next());
                System.out.println("How many products you want add to your cart?");
                int nproduct= input.nextInt();
                Cart c1=new Cart(c.getCustomerId(),nproduct);
                for(int i=0;i<nproduct;i++){
                 System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
                 int x=input.nextInt();
                 if(x==1){
                  Electronicproduct electronicproduct=new Electronicproduct(1, "Smart phone",599.9f,"Samsung",1);
                  c1.addProduct(i,electronicproduct);
                 } else if (x==2) {
                   Clothingproduct clothingproduct=new Clothingproduct(2,"T-Shirt",19.99f,"Medium","Cotton");
                   c1.addProduct(i,clothingproduct);
                 } else if (x==3) {
                   Bookproduct bookproduct=new Bookproduct(3,"OOP",39.99f,"O'Reilly","X Publications");
                   c1.addProduct(i,bookproduct);
                 }
                 else{
                   System.out.println("invalid");}
                 }
        System.out.println("Your total is $"+c1.calculateProduct()+". Would you like to place the order? 1- Yes 2- No");
           int id= input.nextInt();
        if (id==1){
            c1.placeOrder(id);}
        else if(id==2)
            System.out.println("Your Order placed successfully!");
        /*System.out.println("Do you want to remove a product? 1-yes 2- No");
        int removeid= input.nextInt();
        if(removeid==1){
            c1.removeProduct(removeid);
            System.out.println("Thank you!");
        }else
            System.out.println("Your Order placed successfully!");*/
    }}