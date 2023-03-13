package PracticeMarchTen;

public class Driver {
    public static void main(String[] args){
        
        Course[] courseList = new Course[6];
        courseList[0] = new Course(); 
        courseList[1] = new Course();
        courseList[2] = new Course();
        courseList[3] = new Course(3204,10,25,4);
        courseList[4] = new Course(3205,15,25,3);
        courseList[5] = new Course(3206,20,25,5);

        for (int i = 0; i<6; i++){
            System.out.println(courseList[i]);
        }
    }
    
}
