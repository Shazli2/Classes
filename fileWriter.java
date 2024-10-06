import java.io.FileWriter;
import java.io.IOException;


public class fileWriter {
    public static void main(String[] args) {
        String data = "this is written by the java code";
        try {
            // create a writer object using file writer
            FileWriter output = new FileWriter("my_file.txt");
            // write String to the file
            output.write(data);
            System.out.println("the data was written to the file");
            // close the writer
            output.close();
        }catch (IOException e){
            e.getStackTrace();

        }
    }
}
