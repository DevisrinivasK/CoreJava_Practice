public class Typeconversion {
    public static void main(String[] args) {
        //int a=12
        int a=258;
        //byte b=a;
        byte b=(byte)a;
        System.out.println(b);
        float f=5.66f;
        int n=(int)f;
        System.out.println(n);
        //Typepromotion
        byte n1=10;
        byte n2=30;
        int res=n1*n2;
        System.out.println(res);

        
    }
   
}
