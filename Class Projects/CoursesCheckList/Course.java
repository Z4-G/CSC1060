package CoursesCheckList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Course{
        private int courseNumber;
        private int numStudents;
        private int maxStudents;
        private int credits;
        File courseLog = new File("Course List.txt");
        

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
        public void writeToFile(){
            try{
                if (!courseLog.exists()){
                    courseLog.createNewFile();
                }
                FileWriter fill = new FileWriter(courseLog, true);
                BufferedWriter bw = new BufferedWriter(fill);
                bw.append(String.format("Course Number: %s \n Max Students: %s\n Enrolled Students: %s\n Course Credits: %s \n\n", courseNumber, maxStudents, numStudents, credits));
                bw.flush();
                bw.close();
            }
            catch (IOException e) {

            }
        }
        public List<String> readFromFile(String file){
            int counter = 0;
            List<String> courseInput = new ArrayList<String>();
            List<String> allCourses = new ArrayList<String>();
            List<String[]> single = new ArrayList<String[]>();
            String[] singleString = new String[allCourses.size()];
            File readFile = null;
            Scanner input = null;
    
            try{
                readFile = new File(file);
                input = new Scanner(readFile);
                while (input.hasNextLine()){
                    courseInput.add(input.nextLine());
                    // single.add(courseInput.get(counter).split(","));
                    // singleString = single.get(counter);
                    // allCourses.add(singleString[0]+", "+singleString[1]+", "+singleString[2]+", "+singleString[3]);
                    // counter++;
                }
                input.close();
            } catch (IOException e){

            }
            return courseInput;
        }
        public String toString(){
            return String.format("Course Number: %s \nEnrolled students: %s \nMax Students: %s \nCredit Hours: %s", courseNumber,  numStudents, maxStudents, credits); 
        }
    }



