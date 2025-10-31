import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContactNode node=new ContactNode();
        PhoneList list= new PhoneList();
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("enter 1 for adding new contact\nenter 2 for display contacts\nenter 3 for searching\nenter 4 for deletion\nenter 5 for exit");
            System.out.println("Enter A Number:");
            int number= input.nextInt();
            if(number==1){
                System.out.println("Please Enter Name:");
                String name= input.next();
                System.out.println("Please Enter Phone Number:");
                String phone= input.next();
                list.insert_at_tail(name,phone);
                continue;
            }else if(number==2){
                list.print_list();
                continue;
            }else if(number==3){
                System.out.println("which Name do you want to search for?");
                String search=input.next();
                System.out.println(list.search(search));
                continue;
            }else if(number==4){
                System.out.println("which Name do you want to delete?");
                String delete=input.next();
                list.delete_by_name(delete);
                continue;}
            else if(number==5){
                break;
            }}}}
