package CoursesCheckList;

import java.util.ArrayList;
import java.util.List;

public class testDriver {
    public static void main(String[] args){
        Course test = new OnlineCourse(); 
        List<String> testArray = new ArrayList<String>();
        testArray = test.readFromFile("courseList.txt");
        System.out.println(testArray.get(1));

    }
}
