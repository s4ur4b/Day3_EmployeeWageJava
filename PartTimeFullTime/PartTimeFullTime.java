public class PartTimeFullTime {
    public static void main(String[] args) {
        int empFullTIme = 1;
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int dailyWage;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        if (empCheck == empFullTIme) {
            dailyWage = wagePerHour * fullDayHour;
            System.out.print("Employee is Fulltime and his daily wage is: " + dailyWage);
        } else {
            dailyWage = wagePerHour * partTimeHour;
            System.out.print("Employee is Parttime and his daily wage is: "+dailyWage);
        }
    }
}
