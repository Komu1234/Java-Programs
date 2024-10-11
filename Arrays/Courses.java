import java.util.ArrayList;
import java.util.Iterator;

public class Courses {
  static String courseName;
  static String profesorName;
  static int year;
  static ArrayList<Student> students;


  public Courses(String courseName, String profesorName, int year) {
    this.courseName = courseName;
    this.profesorName = profesorName;
    this.year = year;
    this.students = new ArrayList<>();
  }

  public void enroll(Student student){
    System.out.println(students.add(student));
 }

 public void unEnroll(Student student){
  or (Student student : students) {
    if ((students.firstName).equals(student.firstName)) {
        students.remove(student);
        System.out.println("Student removed: " + firstName);
        return;
    }
}
System.out.println("Student with name " + firstName + " not found.");
}

 public int countStudents(){
    students.size();
     return 0;
 }
 public static void getGradeAvg() {
  int sum=0;
  int count=0;
// TODO Auto-generated method stub
  for (Iterator iterator = students.iterator(); iterator.hasNext();) {
  Student student = (Student) iterator.next();
  
  if(courseName.equals("Information Technology")) {
    sum+=student.grade;
    count++;
    
  }
  
  
}
  System.out.println(sum/count);
  

}
 
 public int bestGrade(){
     
     return 0;
 }

}
