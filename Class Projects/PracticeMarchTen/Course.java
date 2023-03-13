package PracticeMarchTen;

    public class Course{
        private int courseNumber;
        private int numStudents;
        private int maxStudents;
        private int credits;

        public Course(){
            this.courseNumber = 3201;
            this.numStudents = 0;
            this.maxStudents = 15;
            this.credits = 3;
        }
        public Course(int courseNumber, int numStudents, int maxStudents, int Credits){
            this.courseNumber = courseNumber;
            this.numStudents = numStudents;
            this.maxStudents = maxStudents;
            this.credits = Credits;
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
        public void setCredits(int Credits) {
            this.credits = Credits;
        }
        public void setMaxStudents(int maxStudents) {
            this.maxStudents = maxStudents;
        }
        public void setNumStudents(int numStudents) {
            this.numStudents = numStudents;
        }

        /*public String toString() {
            return ("This Course (#" + courseNumber +  ") is worth " + this.credits + " credits. Currently there are " + numStudents + " students enrolled. The maximum class size is " + maxStudents + ".");
            
        }*/
    }
    