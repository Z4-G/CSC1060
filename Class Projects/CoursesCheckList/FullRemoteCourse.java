package CoursesCheckList;
public class FullRemoteCourse extends OnlineCourse {
    private String courseContact = "";
    public FullRemoteCourse() {
        super();
    }
    public FullRemoteCourse(int courseNumber, int numStudents, int maxStudents, int credits) {
        super(courseNumber, numStudents, maxStudents, credits);
    }
    public void setContact(String courseContact){
        this.courseContact = courseContact;
    }
    public String getContact(){
        return courseContact;
    }
    public String toString() {
        return super.toString() + "\nCourse Type: Full Remote\n" + "Course Contact Email: " + courseContact;
    }

}
