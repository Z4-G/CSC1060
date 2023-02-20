import java.util.Scanner;
public class TrianglePrinter{
    public static void main(String[] args){
        int triangleSize = 0;
        var fill ="";
        Scanner triangles = new Scanner(System.in);
        //variables and scanner

        System.out.println("Please enter desired triangle size.");
        triangleSize = triangles.nextInt();
        triangles.nextLine();
        //gets triangle size

        while (triangleSize < 1 || triangleSize > 50){
            System.out.println("please enter a triangle size betweeen 1 and 50.");
            triangleSize = triangles.nextInt();
            triangles.nextLine();
        }
        //ensures triangle size is between 1 and 50

        System.out.println("Now, Please enter a character to compose the triangle.");
        fill = triangles.nextLine();
        //gets fill character

        for (int i = 0; i < triangleSize; i++ ){
            for (int j = i+1 ; j <= triangleSize; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++){
                System.out.print(fill+" ");
            }
        System.out.println("");
        }
        //draws the triangle
        triangles.close();
    }
}
