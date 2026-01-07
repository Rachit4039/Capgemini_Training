import java.util.*;

class UnitConvertorLength {


    static double convertYardsToFeet(double y) {
        return y * 3;
    }

    static double convertFeetToYards(double f) {
        return f * 0.333333;
    }

    static double convertMetersToInches(double m) {
        return m * 39.3701;
    }

    static double convertInchesToMeters(double i) {
        return i * 0.0254;
    }

    static double convertInchesToCm(double i) {
        return i * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(convertYardsToFeet(v));
        System.out.println(convertFeetToYards(v));
        System.out.println(convertMetersToInches(v));
        System.out.println(convertInchesToMeters(v));
        System.out.println(convertInchesToCm(v));
    }
}
