package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class Reader {

     String reading(){
        String words = "";
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt")))
        {
            String result;
            while ((result = br.readLine())!= null){
                words += " " + result ;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return words;
    }
}
