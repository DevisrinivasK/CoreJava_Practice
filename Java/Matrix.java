import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows: "); //Matrix implementation dynamically
        
        int row_size=s.nextInt();
        System.out.println("Enter the number of columns: ");
        int column_size=s.nextInt();
        int matrix[][] = new int[row_size][column_size];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<row_size;i++){
            for(int j=0;j<column_size;j++){
                System.out.println("Enter the matrix element: ");
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println("Printing the elements of matrix: ");
        for(int i=0;i<row_size;i++){
            for(int j=0;j<column_size;j++){
                System.out.print(matrix[i][j]+ " ");
                
            }
            System.out.println();
        }
        s.close();

    }
    
}
