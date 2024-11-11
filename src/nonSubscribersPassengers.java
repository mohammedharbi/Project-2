public class nonSubscribersPassengers extends Passenger{

    private boolean discount_coupon;

    public nonSubscribersPassengers(String name, int ID, Car reserved_Car, double trip_price, boolean discount_coupon) {
        super(name, ID, reserved_Car, trip_price);
        this.discount_coupon= discount_coupon;
    }

    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    @Override
    public double reserveCar(Car reserved_Car) {

        try {
            if (reserved_Car.getMax_capacity() == 0){
                throw new Exception();
            }else {


                if (discount_coupon == true) {
                    return reserved_Car.route.getTrip_price() * 0.90;
                } else {
                    System.out.println("No coupon.");
                    return reserved_Car.route.getTrip_price();
                }
            }
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
