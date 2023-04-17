package CoursesCheckList;
public class RealtimeRemoteCourse extends OnlineCourse {
    String link = "";
    public RealtimeRemoteCourse() {
        super();
        this.link = "https://meet.google.com/";
    }
    public RealtimeRemoteCourse(int courseNumber, int numStudents, int maxStudents, int credits) {
        super(courseNumber, numStudents, maxStudents, credits);
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String toString() {
        return super.toString() + "\nCourse Type: Realtime Remote\nVideo Conference Link: " + link;
    }
}

