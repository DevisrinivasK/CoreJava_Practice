import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        //int num[]={5,6,7};
        //System.out.println(num[0]);
        //System.out.println(num[1]);
        //System.out.println(num[2]);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of array: ");  //Java program to dynamically read a array
        int n=s.nextInt();
        int num[]=new int[n];        
        for(int i=0;i<n;i++){
            System.out.println("Enter the array element: ");
            num[i]=s.nextInt();
        } 
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print("["+num[i]+"]");
        }

    }   
       
}
