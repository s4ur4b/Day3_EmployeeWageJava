public class DailyWage {
    public static void main(String[] args) {
        int empPresent=1;
        int wagePerHour=20;
        int fullDayHour=8;
        int dailyWage;
        double empCheck= Math.floor(Math.random()*10%2);
        if(empCheck == empPresent){
            dailyWage=wagePerHour*fullDayHour;
            System.out.print("Employee is Presnt and his daily wage is: "+dailyWage);}
        else
            System.out.print("Employee is Absent");
    }
}
