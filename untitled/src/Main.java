import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Calculator c1=new Calculator();
        System.out.println("Enter a positive integer 'n': ");
        c1.setN(input.nextInt());
        System.out.println("How many operations would you like to perform? ");
        int x= input.nextInt();
        for (int i=0;i<x;i++){
            System.out.println("Operation "+(i+1)+":");
            System.out.println("1. Factorial \n2. Fibonacci \n3. sum \n4. Average");
            System.out.print("choose an operation (1-4): ");
            int y= input.nextInt();
            if(y==1){c1.factorial(c1.getN());
            System.out.println("Factorial of "+c1.getN()+": "+c1.factorial(c1.getN()));}
            else if(y==2){
                c1.fibonacci(c1.getN());
                System.out.println("Fibonacci of "+c1.getN()+": "+c1.fibonacci(c1.getN()));}
            else if (y==3) {
                c1.sumAllNumbers(c1.getN());
                System.out.println("sum of natural numbers up to "+c1.getN()+": "+c1.sumAllNumbers(c1.getN()));;
            }
            try{
            if(y==4)  {
                ArrayList NUM=new ArrayList<>();
                c1.average(NUM);
            }}catch (ArithmeticException e){
                System.out.println("Error: ArrayList is empty you cannot calculate average");}}}}