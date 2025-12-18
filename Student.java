public class Student{
int sid=1;
String sname="raju";
String  semail="raju@gmail.com";
public void studentDetails(){
System.out.println("student details");
System.out.println(sid);
System.out.println(sname);
System.out.println(semail);
}
public static void main(String[] args){
Student s=new Student();
s.studentDetails();
}}