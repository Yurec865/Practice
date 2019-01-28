package exercise2.inheritance;

abstract class WirelessPhone extends AbstractPhone {

    private int hour;

    WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
