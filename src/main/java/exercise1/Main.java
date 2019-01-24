package exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Reader reader = new Reader();
        String result = reader.reading();
        PopularWord popularWord = new PopularWord();
        NumberCharacters numberCharacters = new NumberCharacters();

        System.out.print("Enter command : ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        switch (input) {
            case "1":
                Word word = new Word(result);
                System.out.println(word.count());
                break;
            case "words_count -popular":
                System.out.println(popularWord);
                break;
            case "chars_count":
                System.out.println(numberCharacters);
                break;
            default:
                throw new RuntimeException("Wrong command!!!");
        }
    }
}

