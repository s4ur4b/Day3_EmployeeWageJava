public class WagePerMonth {

        public static void main(String[] args) {
            int empFullTime = 1;
            int empPartTime = 0;
            int wagePerHour = 20;
            int fullDayHour = 8;
            int partTimeHour = 4;
            int workingDays =20;
            int dailyWage;
            int monthlyWage;
            double empCheck= Math.floor(Math.random()*10%2);
            int choice = (int) (empCheck);
            System.out.println(choice);
            switch (choice) {
                case 1:
                    dailyWage = wagePerHour * fullDayHour;
                    monthlyWage = dailyWage*workingDays;

                    System.out.print("Employee is Full Time");
                    System.out.println("Employee wage per day: " + dailyWage);
                    System.out.println("Monthly wage:" +monthlyWage);
                    break;

                case 0:
                    dailyWage = wagePerHour * partTimeHour;
                    monthlyWage = dailyWage*workingDays;
                    System.out.print("Employee is Part Time");
                    System.out.println("Employee wage per day: " + dailyWage);
                    System.out.println("Monthly wage:" +monthlyWage);
                    break;

            }

        }
    }


