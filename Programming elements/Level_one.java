
import java.util.Scanner;

public class Level_one {

    public static void main(String args[]) {
        q10();
    }

    public static void q1() {
        int Birth_Year = 2000;
        int Current_Year = 2024;
        int Age = Current_Year - Birth_Year;
        System.out.println(Age);
    }

    public static void q2() {
        int Physics = 95;
        int Math = 94;
        int Chemistry = 96;
        int Average = (Physics + Math + Chemistry) / 3;
        System.out.println(Average);
    }

    public static void q3() {
        double distance = 10.8;
        double inMiles = distance * 1.6;

        System.out.println(inMiles);
    }

    public static void q4() {
        int cp = 129;
        int sp = 191;
        int p = sp - cp;
        int pp = (p / cp) * 100;
        System.out.println(" The Cost Price is INR " + cp + "and Selling Price is INR " + sp);
        System.out.println(" The Profit is INR" + p + "and the Profit Percentage is " + pp);
    }

    public static void q5() {
        int pens = 14;
        int students = 3;
        int equal = pens / students;
        int left = pens % students;
        System.out.println("The Pen Per Student is " + equal + " and the remaining pen not distributed is " + left);
    }

    public static void q6() {
        int fees = 125000;
        int discountPercent = 10;
        int discount = fees * discountPercent / 100;
        int Pay = fees - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + Pay);
    }

    public static void q7() {
        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        double volumeMiles3 = volumeKm3 * Math.pow(0.621371, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm3
                + " and cubic miles is " + volumeMiles3
        );
    }

    public static void q8() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println(
                "The total miles is " + miles + " mile for the given " + km + " km"
        );
    }

    public static void q9() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fee amount: ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();

        double discount = fee * discountPercent / 100;
        double pay = fee - discount;

        System.out.println(
                "The discount amount is INR " + discount
                + " and final discounted fee is INR " + pay
        );
    }

    public static void q10() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double cm = input.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(
                "Your Height in cm is " + cm
                + " while in feet is " + feet
                + " and inches is " + inches
        );
    }

    public static void q11() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div
        );
    }

    public static void q12() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516;

        System.out.println(
                "The area of triangle is " + areaSqInches
                + " square inches and " + areaSqCm + " square centimeters"
        );
    }

    public static void q13() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println(
                "The length of the side is " + side
                + " whose perimeter is " + perimeter
        );
    }

    public static void q14() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println(
                "The distance is " + yards + " yards and " + miles + " miles"
        );
    }

    public static void q15() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double total = unitPrice * quantity;

        System.out.println(
                "The total purchase price is INR " + total
                + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice
        );
    }

    public static void q16() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println(
                "The maximum number of possible handshakes is " + handshakes
        );
    }
}
