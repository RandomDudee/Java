import java.io.*;


public class FileHandlingDemo {

    public static void main(String[] args) {
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader("myFile.rtf")))
        {
            line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

//        File f = new File("myFile.rtf");
//        File nf = new File("myNewFile.rtf");
//
//        f.renameTo(nf);
//
//        nf.delete();

    }

//        String line;
//        BufferedReader reader = null;
//
//        try
//        {
//            reader = new BufferedReader(new FileReader("myFile.rtf"));
//            line = reader.readLine();
//            while (line != null)
//            {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        }
//        catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        finally
//        {
//            try
//            {
//                if (reader != null)
//                    reader.close();
//            }
//            catch (IOException e)
//            {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
}