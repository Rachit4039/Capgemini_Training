import java.util.Scanner;

class UnitConvertorDistance {
    // Input: 5

    static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    static double convertMilesToKm(double m) {
        return m * 1.60934;
    }

    static double convertMetersToFeet(double m) {
        return m * 3.28084;
    }

    static double convertFeetToMeters(double f) {
        return f * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(convertKmToMiles(v));
        System.out.println(convertMilesToKm(v));
        System.out.println(convertMetersToFeet(v));
        System.out.println(convertFeetToMeters(v));
    }
}
