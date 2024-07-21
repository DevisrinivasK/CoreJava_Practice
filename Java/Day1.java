import java.util.Scanner;
public class Day1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a= s.nextInt();
        System.out.println("Enter the value of b: ");
        int b= s.nextInt();
        System.out.println("Enter the value of c: ");
        int c= s.nextInt();
        System.out.println("Average:"+(a+b+c)/3);
        s.close();

    }
}