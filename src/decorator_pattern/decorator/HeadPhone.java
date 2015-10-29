package decorator_pattern.decorator;

import decorator_pattern.FlightSeat;

public class HeadPhone extends FlightSeatDecorator {
    public HeadPhone(FlightSeat flightSeat) {
        super(flightSeat);
    }

    @Override
    public String getFacilities() {
        return this.flightSeat.getFacilities() + "\nHead Phones";
    }

    @Override
    public Double getCost() {
        return this.flightSeat.getCost() + 7.0;
    }
}
