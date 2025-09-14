package Programming_Element_Practices;

public class VolumeOfEarth {
	public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.141592653589793;
        double volKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double volMiles3 = volKm3 / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volKm3 + " and cubic miles is " + volMiles3);
    }

}
