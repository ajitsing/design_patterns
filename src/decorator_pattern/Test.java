package decorator_pattern;

import decorator_pattern.decorator.HeadPhone;
import decorator_pattern.decorator.LiveTV;
import decorator_pattern.decorator.WiFi;

public class Test {
    public static void main(String[] args) {
        FlightSeat mainCabinSeat = new WiFi(new HeadPhone(new LiveTV(new MainCabinSeat())));

        System.out.println("Chosen Facilities for your seat:");
        System.out.println(mainCabinSeat.getFacilities());
        System.out.println("Total Cost:" + mainCabinSeat.getCost());
    }
}
