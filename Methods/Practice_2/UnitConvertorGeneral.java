import java.util.Scanner;

class UnitConvertorGeneral {
    

    static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double convertPoundsToKg(double p) {
        return p * 0.453592;
    }

    static double convertKgToPounds(double k) {
        return k * 2.20462;
    }

    static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }

    static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(convertFahrenheitToCelsius(v));
        System.out.println(convertCelsiusToFahrenheit(v));
        System.out.println(convertPoundsToKg(v));
        System.out.println(convertKgToPounds(v));
        System.out.println(convertGallonsToLiters(v));
        System.out.println(convertLitersToGallons(v));
    }
}
