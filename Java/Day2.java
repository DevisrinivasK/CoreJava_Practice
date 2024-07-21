import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the cost of Pen: ");
        float penPrice=s.nextFloat();
        System.out.println("Enter the cost of pencil: ");
        float pencilPrice=s.nextFloat();
        System.out.println("Enter the price of eraser: ");
        float eraserPrice=s.nextFloat();
        System.out.println("*******Billing Information*******");
        System.out.println("Enter no. of pens purchased: ");
        int pens=s.nextInt();
        System.out.println("Enter no. of pencils purchased: ");
        int pencils=s.nextInt();
        System.out.println("Enter no. of erasers purchased: ");
        int erasers=s.nextInt();
        float pensCost=pens*penPrice;
        float pencilsCost=pencils*pencilPrice;
        float erasersCost=erasers*eraserPrice;
        System.out.println("Total cost of pens: "+pensCost);
        System.out.println("Total cost of pencils: "+pencilsCost);
        System.out.println("Total cost of erasers: "+erasersCost);
        float totalCost= pensCost+pencilsCost+erasersCost;
        float billAmount= totalCost + (totalCost*0.18f);
        System.out.println("Total Bill: "+billAmount);
        s.close();        
    }
    
}
