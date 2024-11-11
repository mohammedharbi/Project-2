import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List <Passenger> passengers = new ArrayList<>();

        //Create 2 routes and assign each of them to a different Car object. Note that one
        //of those cars should have a maximum capacity equal to zero .
        Route r = new Route("Tuwaiq Academy","Imam University",60);
        Route r2 = new Route("Riyadh front","Roshan",10);

        Car c = new Car("E200393843",r,20);
        Car c2 = new Car("E2224553",r2,0);
        //DONE.

        //2.1• Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.
        //2.2 Assign a different car object to each passenger and then display their
        //information.
        Passenger p = new Subscribers_passengers("Mohammed", 233132132,c);
        Passenger p2 = new nonSubscribersPassengers("Khaled", 20303244,c,true);
        Passenger p3 = new nonSubscribersPassengers("Fahad", 24343443,c2,false);
        passengers.add(p);
        passengers.add(p2);
        passengers.add(p3);
        //2.1 done.

        for(Passenger a:passengers){
            a.toDisplay();
        }

        //2.2 DONE.
    }
}