public class EmployeeWageMaxHours {
    public static final int partTime=1, fullTime=2, empRatePerHour=20, workingDays=20, maxHoursInMonth=100;

    public static void main(String[] args) {
        int empHours, totalWorkingDays = 0, totalEmpHours = 0;
        while(totalEmpHours<maxHoursInMonth && totalWorkingDays<workingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random()*10%3);
            switch (empCheck){
                case partTime:
                    empHours=4;
                    break;
                case fullTime:;
                    empHours=8;
                    break;
                default:
                    empHours=0;
            }
            totalEmpHours += empHours;
            System.out.println("Total working Days"+totalWorkingDays+"Total working Hours"+totalEmpHours);
        }
            int totalEmpWage = empRatePerHour * totalEmpHours;
        System.out.println("Total Employee Wage: "+totalEmpWage);
    }
}
