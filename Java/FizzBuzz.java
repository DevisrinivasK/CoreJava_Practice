import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter value of n: ");
        byte n= s.nextByte();
        if (n>100){
            System.out.println("Enter the number between");
        }
        else{
            for(byte i=1;i<=n;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("fizzbuzz");
                }
                else if(i%3==0){
                    System.out.println("fizz");
                }
                else if(i%5==0){
                    System.out.println("buzz");
                }
                else{
                    System.out.println(i);
                }

            }

        }
        s.close();
       


        
    }
    
}
