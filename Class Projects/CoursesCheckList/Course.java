package CoursesCheckList;

    public class Course{
        private int courseNumber;
        private int numStudents;
        private int maxStudents;
        private int credits;
        

        public Course(){
            this.courseNumber = 0;
            this.numStudents = 0;
            this.maxStudents = 0;
            this.credits = 0;
        }
        public Course(int courseNumber, int numStudents, int maxStudents, int credits){
            this.courseNumber = courseNumber;
            this.numStudents = numStudents;
            this.maxStudents = maxStudents;
            this.credits = credits;
        }
        public int getCourseNumber() {
            return courseNumber;
        }
        public int getCredits() {
            return credits;
        }
        public int getMaxStudents() {
            return maxStudents;
        }
        public int getNumStudents() {
            return numStudents;
        }
        public void setCourseNumber(int courseNumber) {
            this.courseNumber = courseNumber;
        }
        public void setCredits(int credits) {
            this.credits = credits;
        }
        public void setMaxStudents(int maxStudents) {
            this.maxStudents = maxStudents;
        }
        public void setNumStudents(int numStudents) {
            this.numStudents = numStudents;
        }
        public String toString(){
            return String.format("Course Number: %s \nEnrolled students: %s \nMax Students: %s \nCredit Hours: %s", courseNumber,  numStudents, maxStudents, credits); 
        }
    }



