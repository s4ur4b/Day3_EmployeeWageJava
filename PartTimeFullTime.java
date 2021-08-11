public class PartTimeFullTime {
    public static void main(String[] args) {
        int empFullTime=1;
        int wagePerHour=20;
        int fullDayHour=8;
        int partTimeHour=4;
        int dailyWage;
        double empCheck= Math.floor(Math.random()*10%2);
        if(empCheck == empFullTime){
            dailyWage=wagePerHour*fullDayHour;
            System.out.print("Employee is Full Time and his daily wage is: "+dailyWage);}
        else{
            dailyWage=wagePerHour*partTimeHour;
            System.out.print("Employee is Part Time and his daily wage is: "+dailyWage);}
    }
}
