package Objects;


import java.util.ArrayList;
import java.util.Arrays;

public class Airport {
    public static void main(String[] args) {


        Airplane AirForce1 = new Airplane("DK");
        Airplane AirForce2 = new Airplane("UK");
        Airplane AirForce3 = new Airplane("USA");
        Airplane AirForce4 = new Airplane("DK");



        ArrayList<Airplane> CopenhagenAirport = new ArrayList<>(Arrays.asList(AirForce1, AirForce2, AirForce3, AirForce4));

        int i = 0;

        for (Airplane currentPlane : CopenhagenAirport){
            if (currentPlane.nationality.equals("DK")){
                i++;
            }
        }
        System.out.println("The amount if Danish planes is: " + i);
    }
}
