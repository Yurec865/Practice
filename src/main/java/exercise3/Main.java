package exercise3;

public class Main {
    public static void main(String[] args) {
        //Balcony balcony = new Balcony(4,5);
        Room kitchenBalcony = new Kitchen(8,3, new Balcony(2,2));
        Room kitchen = new Kitchen(8,3, null);
        Room bathroom = new Bathroom(12,5);
        System.out.println("Square bathroom : " + bathroom.square() + " " + "Perimeter bathroom : " + bathroom.perimeter());
        System.out.println("Square kitchenBalcony : " + kitchenBalcony.square() + " " + "Perimeter kitchen : " + kitchenBalcony.perimeter());
        System.out.println("Square kitchen : " + kitchen.square() + " " + "Perimeter kitchen : " + kitchen.perimeter());
    }
}
