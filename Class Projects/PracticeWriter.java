import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class PracticeWriter {
    public static void main(String[] args){
        File myFile = new File("WriterTest");
        
        try{
            if (!myFile.exists()){
                myFile.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(myFile.getName(), false);
            BufferedWriter bw = new BufferedWriter(fileWriter);

            bw.write("Sample Output\n");
            bw.write("output two\n");
            bw.append("Appended piece\n");
            bw.flush();
            bw.close();   

        } catch (IOException e){

        }
    }
}
