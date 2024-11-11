import java.nio.file.AccessDeniedException;

public class Subscribers_passengers extends Passenger{


    public Subscribers_passengers(String name, int ID, Car reserved_Car, double trip_price) {
        super(name, ID, reserved_Car, trip_price);
    }

    @Override
    public double reserveCar(Car reserved_Car) {
        try {

            if (reserved_Car.getMax_capacity() == 0){
                throw new Exception();
            }else{
            double trip_cost = reserved_Car.route.getTrip_price() * 0.50;
            return trip_cost;}
        } catch (Exception e) {
            System.out.println("Maximum car capacity equals 0 Cannot register!!");
            throw new RuntimeException(e);
        }
    }
    @Override
    public void toDisplay() {
        System.out.println("Passenger Name: "+getName()+"\n"+
                "Passenger iD: "+getID()+"\n"+
                "Car Code: "+reserved_Car.getCode()+"\n"+
                "Pick-up Destination: "+reserved_Car.route.getPickup_address()+"\n"+
                "Final Destination: "+reserved_Car.route.getDestination_address()+"\n"+
                "Trip cost:"+reserveCar(reserved_Car));
        System.out.println("---------------------");
    }
}
