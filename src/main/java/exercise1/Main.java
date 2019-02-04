package exercise1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Reader reader = new Reader();
        String result = "";
        try{
            result = reader.reading();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            System.out.print("Enter command : ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            switch (input) {
                case "word":
                    Word word = new Word(result);
                    System.out.println(word.count());
                    break;
                case "popular_word":
                    PopularWord popularWord = new PopularWord(result);
                    System.out.println(popularWord.search());
                    break;
                case "chars_count":
                    NumberCharacters numberCharacters = new NumberCharacters(result);
                    System.out.println(numberCharacters.countNumbers());
                    break;
            }
    }
}


