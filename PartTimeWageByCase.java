import java.util.Random;

public class PartTimeWageByCase {
    public static void main(String[] args) {
        int empFullTime = 1;
        int empPartTime = 0;
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int dailyWage;
        double empCheck= Math.floor(Math.random()*10%2);
        int choice = (int) (empCheck);
        System.out.println(choice);
        switch (choice) {
            case 1:
                dailyWage = wagePerHour * fullDayHour;
                System.out.print("Employee is Full Time");
                System.out.print("Employee wage: " + dailyWage);
                break;

            case 0:
                dailyWage = wagePerHour * partTimeHour;
                System.out.print("Employee is Part Time");
                System.out.print("Employee wage: " + dailyWage);
                break;

        }

    }
    }

