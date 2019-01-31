package exercise2.encapsulation;

import java.util.ArrayList;

 class Television {

    private ArrayList<String> hiddenChannels = new ArrayList<>();
    private ArrayList<String> channels = new ArrayList<>();

    Television(){
        hiddenChannels.add("TNT");
        hiddenChannels.add("MTV");
        hiddenChannels.add("FiveChannel");

        channels.add("NOVUY");
        channels.add("OLD");
    }

    private String outputHidden(){
        return String.valueOf(hiddenChannels);
    }
     String outputChannel(){
        outputHidden();
        return String.valueOf(channels);
    }
}
