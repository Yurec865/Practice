package exercise4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    static ArrayList elementA = new ArrayList();
    static LinkedList elementL = new LinkedList();
    static long startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++){
            elementA.add(i);
            elementL.add(i);
        }
        System.out.println(addA());
        System.out.println(addL());
        System.out.println(removeA());
        System.out.println(removeL());
        System.out.println(getA());
        System.out.println(getL());
    }
    static String addA(){
        elementA.add(500000,"element");
        return "Add to ArrayList: " + (System.currentTimeMillis() - startTime) + "ms";
    }
    static String addL(){
        elementL.add(500000,"element");
        return "Add to LinkedList: " + (System.currentTimeMillis() - startTime) + "ms";
    }
    //Почему показывает что ArrayList работает быстрее не пойму, так как при вставке елемента в центр надо сдвигать все елементы после него.
    //В LinkedList достаточно поменять ссылки соседних елементов.
    static String removeA(){
        elementA.remove(500000);
        return "Remove from ArrayList: " + (System.currentTimeMillis() - startTime) + "ms";
    }
    static String removeL(){
        elementL.remove(500000);
        return "Remove from LinkedList: " + (System.currentTimeMillis() - startTime) + "ms";
    }
    //Remove так же не пойму почему показывает наоборот, так как в ArrayList после удаление все елементы после удаленного сдвигаются.
    //В LinkedList просто меняются ссылки соседей.
    static String getA(){
        elementA.get(500000);
        return "Get from ArrayList: " + (System.currentTimeMillis() - startTime) + "ms";
    }
    static String getL(){
        elementL.get(500000);
        return "Get from LinkedList: " + (System.currentTimeMillis() - startTime) + "ms";
    }
    //гет в ArrayList работает быстрее потому, что для того чтобы взять елемент у ArrayList мы просто обращаемся к соответсвующему елементу.
    //а в LinkedList нужно пройтись последовательно по всем обьектам.
}
