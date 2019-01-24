package exercise1;

 class NumberCharacters {

     private String word;

     NumberCharacters(String result) {
         this.word = result;
     }

     int countNumbers(){
        int result = word.length();
        return result;
    }
}
