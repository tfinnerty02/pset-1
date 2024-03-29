/**
 *
 * git add ProblemSet1.java
 * git commit -m "initial commit"
 * git push origin master
 *
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        int length = 11;
        double width = 8.5;
        double mmPerInch = 25.4;
        double lengthInMm = length * mmPerInch;
        double widthInMm = width * mmPerInch;
        double areaInMm = lengthInMm * widthInMm;
        System.out.printf("\n%,.2f square millimeters.\n", areaInMm);
        // adding the \n adds a line after the .format print
        // adding the comma before the "." in the %,.2f adds the commas in printing

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

        double cmPerInch = 2.54;
        double lengthInCm = length * cmPerInch;
        double widthInCm = width * cmPerInch;
        double perimeterInCm = (2 * lengthInCm) + (2 * widthInCm);
        System.out.printf("\n%,.2f square centimeters.\n", perimeterInCm);

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

        double aSquaredBSquared = Math.pow(length, 2) + Math.pow(width, 2);
        double diagonal = Math.pow(aSquaredBSquared, 0.5);
        System.out.printf("\n%,.2f inches.\n", diagonal);

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        double homeworkWeight = 0.15;
        double quizWeight = 0.35;
        double testWeight = 0.5;

        double homeworkGrade = (homework1 * homeworkWeight + homework2 * homeworkWeight + homework3 * homeworkWeight) / 3;
        double quizGrade = (quiz1 * quizWeight + quiz2 * quizWeight + quiz3 * quizWeight) / 3;
        double testGrade = (test1 * testWeight + test2 * testWeight + test3 * testWeight) / 3;

        double finalGrade = homeworkGrade + quizGrade + testGrade;

        System.out.printf("\n%,.2f%%\n", finalGrade);

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         double hourlyWage = 12.5;
         double sumOfHours = 7.5 + 8 + 10.5 + 9.5 + 6 + 11.5;
         double paycheck = sumOfHours * hourlyWage;
         System.out.printf("\n$%,.2f\n", paycheck);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         int salary1 = 117000;
         double retirementContribution = 0.07;
         double salary2 = salary1 - salary1*retirementContribution;
         double fedTaxRate = 0.24;
         double salary3 = salary2 - salary2*fedTaxRate;
         double stateTaxRate = 0.0637;
         double salary4 = salary3 - salary3*stateTaxRate;
         System.out.printf("\n$%,.2f\n", salary4/24);

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         int students = 273;
         int teachers = 28;
         int capacity = 54;
         int totalBuses = (students+teachers)/capacity + 1;
         int extraStudents = (students+teachers)%capacity;
         System.out.println("\n" + totalBuses + " buses are needed, with " + extraStudents + " passengers on the last bus.");

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

        int boardLength = 48;
        int boardWidth = 24;
        int diameter = 6;
        double surfaceArea = boardLength*boardWidth - Math.PI*Math.pow(diameter/2, 2);
        System.out.printf("\n%,.2f square inches.\n", surfaceArea);

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

        int year2020 = 2020;
        int year2100 = 2100;
        int year2400 = 2400;
        boolean leap2020 = (2020%4 == 0 && 2020%100 != 0) || (2020%400 == 0);
        boolean leap2100 = (2100%4 == 0 && 2100%100 != 0) || (2100%400 == 0);
        boolean leap2400 = (2400%4 == 0 && 2400%100 != 0) || (2400%400 == 0);
        System.out.println("\n2020 is a leap year..." + leap2020 + ".\n2100 is a leap year..." + leap2100 + ".\n2400 is a leap year..." + leap2400 +".\n");

        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

         int temperature = 38;
         int winds = 14;
         //35.74 + 0.6215t + (0.4275t - 35.75)v0.16
         // System.out.println(35.74 + 0.6215*temperature + (0.4275*temperature - 35.75)*Math.pow(winds, 0.16));
         System.out.printf("%,.1f degrees\n\n", 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75)*Math.pow(winds, 0.16));

    }
}
