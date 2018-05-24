import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    public void m()
    {
        String m = new String();
        String lineRead;
        String[] splitLine;
        Member mem;


    try (BufferedReader reader = new BufferedReader(new FileReader("members.csv")))
    {
        m = reader.readLine();
        while (m != null){
            System.out.println(m);
            m = reader.readLine();
        }
    }
    catch (IOException e)
    {
        System.out.println(e.getMessage());
    }

    }

}
