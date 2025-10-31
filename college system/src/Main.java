import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Course c1=new Course();
        Student s1=new Student();
        System.out.println("enter your name:");
        s1.setName(input.next());
        System.out.println("enter your phone number:");
        s1.setPhonenumber(input.next());
        for(int i=0;i<6;i++){
            System.out.println("enter course "+(i+1)+" name:");
            c1.setName(input.next());
            //c1.setName(input.nextLine());
            System.out.println("enter its credit hour:");
            c1.setCredithour(input.nextInt());
            System.out.println("enter id");
            c1.setId(input.nextInt());
            System.out.println("enter lecturer name ");
            c1.setLecturername(input.nextLine());
            c1.setLecturername(input.nextLine());
            Course c2= new Course(c1.getName(), c1.getcredithour(), c1.getid(), c1.getlecturername());
            s1.enrollCourse(i,c2);}
        System.out.println("Enrolled courses:");
        s1.printEnrolledCourses();
        s1.printtotalcredithours();
        System.out.println("enter lecturer name to check their course:");
        s1.printLecturer(input.nextLine());
    }}