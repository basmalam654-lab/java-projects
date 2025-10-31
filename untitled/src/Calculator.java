import java.util.ArrayList;
public class Calculator {
    private int n;
    ArrayList<Integer> numbers=new ArrayList<Integer>();
    public void setN(int n) {this.n = n;}
    public void setNumbers(ArrayList<Integer> numbers) {this.numbers = numbers;}
    public int getN() {return n;}
    public ArrayList<Integer> getNumbers() {return numbers;}
public int factorial(int n){
        if (n==1)
            return 1;
        else
           return n*factorial(n-1);}
public int fibonacci(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
            else
                return (fibonacci(n-1)+fibonacci(n-2));}
public int sumAllNumbers(int n){
        if(n==0)
            return 0;
        else
            return n+sumAllNumbers(n-1);}
public double average(ArrayList Number){
        int sum =0;
        for(int i=n;i>0;i--){sum+=i;}
        return sum /numbers.size();}}