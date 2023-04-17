package CoursesCheckList;
public class InPersonCourse extends Course {
    private int roomNumber;

    public InPersonCourse() {
        super();
        this.roomNumber = 0;
    }

    public InPersonCourse(int courseNumber, int numStudents, int maxStudents, int credits, int roomNumber) {
        super(courseNumber, numStudents, maxStudents, credits);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String toString() {
        return super.toString() + String.format("\nCourse Type: In-Person\nRoom Number: " + roomNumber);
    }
}

