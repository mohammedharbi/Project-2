public abstract class Passenger {

    private String name;
    private int ID;
    Car reserved_Car;
    double trip_cost;

    public Passenger(String name, int ID, Car reserved_Car) {
        this.name = name;
        this.ID = ID;
        this.reserved_Car = reserved_Car;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Car getReserved_Car() {
        return reserved_Car;
    }

    public void setReserved_Car(Car reserved_Car) {
        this.reserved_Car = reserved_Car;
    }

    public double getTrip_price() {
        return trip_cost;
    }

    public void setTrip_price(double trip_price) {
        this.trip_cost = trip_cost;
    }

    public abstract double reserveCar(Car reserved_Car);
    public abstract void toDisplay();
}
