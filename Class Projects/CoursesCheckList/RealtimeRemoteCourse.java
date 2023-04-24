package CoursesCheckList;
public class RealtimeRemoteCourse extends OnlineCourse {
    String link;

    public RealtimeRemoteCourse() {
        super();
        this.link = "https://meet.google.com/";
    }
    public RealtimeRemoteCourse(int courseNumber, int numStudents, int maxStudents, int credits, String link) {
        super(courseNumber, numStudents, maxStudents, credits);
        this.link = link;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String toString() {
        return super.toString() + String.format("\nCourse Type: Realtime Remote\nVideo Conference Link: %s", link);
    }
}

