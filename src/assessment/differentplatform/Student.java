package assessment.differentplatform;

interface StudentDetails
{
String name=null;
int rollNo=0;
String section = null;
}
public class Student implements StudentDetails{

    Student(String name, int rollNo, String section) {
        System.out.printf("Student: %s , Roll No: %d, Section: %s", name,rollNo,section);
    }

    public static void main(String[] args) {
       Student stud1 = new Student("Bob",101, "A");
    }
}
