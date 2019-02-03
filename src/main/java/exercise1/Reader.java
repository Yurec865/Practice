package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class Reader {
     String reading () throws IOException{
        String words = "";
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader("file.txt"));
            String result;
            while ((result = br.readLine())!= null){
                words += " " + result ;
            }
            br.close();
        }
        catch(IOException ex){
            throw new RuntimeException(ex.getMessage());
        }
        finally {
            if (br != null){
                br.close();
            }
        }
        return words.trim();
    }
}
