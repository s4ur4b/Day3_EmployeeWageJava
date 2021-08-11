public class EmployeePresentAbsent {
    public static void main(String[] args) {
        int empPresent=1;
        double empCheck= Math.floor(Math.random()*10%2);
            if(empCheck == empPresent)
                System.out.print("Employee is Presnt");
            else
                System.out.print("Employee is Absent");

    }



}
