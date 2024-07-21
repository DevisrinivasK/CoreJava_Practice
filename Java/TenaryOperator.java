import java.util.Scanner;
public class TenaryOperator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int result;
        result=n%2==0? 10 : 20 ;
        System.out.println(result);
        s.close();        
    }
    
}
