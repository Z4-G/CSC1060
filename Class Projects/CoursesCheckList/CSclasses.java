package CoursesCheckList;

import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {
    public static void main(String[] args){
        int classType = 0;
        String repeater = "yes";

        Scanner input = new Scanner(System.in);
        ArrayList<Course> courseList = new ArrayList<Course>();

        while (repeater.equals("yes")){
            System.out.println("What kind of class would you like to create?\n1. In-Person\n2. Full Remote\n3. Realtime Remote");
            classType = input.nextInt();

            if (classType == 1){

                InPersonCourse newCourse = new InPersonCourse();

                System.out.println("What is the course Number?");
                newCourse.setCourseNumber(input.nextInt());
                System.out.println("How many students are currently enrolled?");
                newCourse.setNumStudents(input.nextInt());
                System.out.println("What is the maximum enrollment?");
                newCourse.setMaxStudents(input.nextInt());
                System.out.println("How many credits is the course worth?");
                newCourse.setCredits(input.nextInt());
                System.out.println("What is the room number?");
                newCourse.setRoomNumber(input.nextInt());
                courseList.add(newCourse);

            }else if (classType == 2){

                FullRemoteCourse newCourse = new FullRemoteCourse();
                
                System.out.println("What is the course Number?");
                newCourse.setCourseNumber(input.nextInt());
                System.out.println("How many students are currently enrolled?");
                newCourse.setNumStudents(input.nextInt());
                System.out.println("What is the maximum enrollment?");
                newCourse.setMaxStudents(input.nextInt());
                System.out.println("How many credits is the course worth?");
                newCourse.setCredits(input.nextInt());
                System.out.println("What is the email of the course contact?");
                newCourse.setContact(input.next());
                courseList.add(newCourse);

            }else if (classType == 3){

                RealtimeRemoteCourse newCourse = new RealtimeRemoteCourse();

                System.out.println("What is the course Number?");
                newCourse.setCourseNumber(input.nextInt());
                System.out.println("How many students are currently enrolled?");
                newCourse.setNumStudents(input.nextInt());
                System.out.println("What is the maximum enrollment?");
                newCourse.setMaxStudents(input.nextInt());
                System.out.println("How many credits is the course worth?");
                newCourse.setCredits(input.nextInt());
                System.out.println("What is the video conference link?");
                newCourse.setLink(input.next());
                courseList.add(newCourse);
            }
            input.nextLine();
            System.out.println("\nWould you like to add another class?");
            repeater = input.nextLine().toLowerCase();
        }
        
        for (Course i : courseList){
            i.writeToFile();
        }

        input.close();
    }
    public static void printCourse(Course course){
         System.out.println("Course Number: " + course.getCourseNumber());
         System.out.println("Course Credits: " + course.getCredits());
         System.out.println("Maximum Enrollment: " + course.getMaxStudents());
         System.out.println("Students Enrolled: " + course.getNumStudents());
    }
    public static void printString(Course course){
        System.out.println(course);
    }
    
}