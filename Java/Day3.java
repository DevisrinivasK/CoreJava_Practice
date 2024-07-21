import java.util.Scanner;
class DivisibilityCheck{
    public void check(byte n){
        if(n%3==0&&n%5==0){
            System.out.println("fizzbuzz");
        }else if (n%3==0) 
        {
            System.out.println("fizz");
            
        }else if(n%5==0){
            System.out.println("buzz");
        }
        else{
            System.out.println(n);
        }
    }
}

public class Day3 {
    public static void main(String[] args) {
        DivisibilityCheck d=new DivisibilityCheck();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        byte num=s.nextByte();
        if(num==0||num>100){
            System.out.println("Enter numbeers ranging from 1 to 100!");
        }
        else{
            for(byte i=1;i<=num; i++){
                d.check(i);
            }
        }
        s.close();
    }
}
