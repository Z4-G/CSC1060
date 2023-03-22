package CourseLists;

public class StudentList {
    String fullName;
    int sNumber;
    int age;
    public StudentList(){
        this.fullName = "";
        this.sNumber = 0;
        this.age = 0;
    }
    public StudentList(String fullName, int sNumber, int age){
        this.fullName = fullName;
        this.sNumber = sNumber;
        this.age = age;
    }
    public String getStudent(){
         String concatInfo = ("Student name: " + fullName + "\nStudent Number: " + sNumber + "\nStudent Age: " + age);
         return concatInfo;
    }

}
