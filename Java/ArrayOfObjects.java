class Student{
    String name;
    int rollno;
    int marks;    
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Devisrinivas";
        s1.rollno=566;
        s1.marks=93;
        Student s2=new Student();
        s2.name="Omkar";
        s2.rollno=501;
        s2.marks=99;
        Student s3=new Student();
        s3.name="Chakri";
        s3.rollno=517;
        s3.marks=100;
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" :"+students[i].rollno+" :"+students[i].marks);
        }        
    }
    



}