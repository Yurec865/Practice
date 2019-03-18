package exercise5;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static long startTime = System.currentTimeMillis();
    static Map map = new HashMap<>();
    static Map map2 = new HashMap<>();
    static Map map3 = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(getMap());
        System.out.println(getMap2());
        System.out.println(getMap3());

        for (int i = 0; i<200000; i++) {
            PassengerCar passengerCar = new PassengerCar("key1" + i, "key2" + i);
            map.put(passengerCar, passengerCar);
            Bus bus = new Bus("key1" + i, "key2" + i);
            map2.put(bus, bus);
            Plane plane = new Plane("key1" + i, "key2" + i);
            map3.put(plane,plane);
        }
    }
    static String getMap(){
        map.get("element");
        return "Get to HashMap: " + (System.currentTimeMillis() - startTime) + "ms";
    }
    static String getMap2(){
        map2.get("element");
        return "Get to HashMap2: " + (System.currentTimeMillis() - startTime) + "ms";
    }
    static String getMap3(){
        map3.get("element");
        return "Get to HashMap2: " + (System.currentTimeMillis() - startTime) + "ms";
    }
}
