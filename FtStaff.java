public class FtStaff extends Staff{
    private double yearlySalary;

    // constructor //
    public FtStaff(String name, String address, int age, String staffID, int grade, String school, String NI, double yearlySalary){
        super(name, address, age, staffID, grade, school, NI);
        this.yearlySalary = yearlySalary;
    }

    public double getSalary(){
        return yearlySalary;
    }

    public String toString(){
        String st = "\n";
        st += "Yearly Salary: " + yearlySalary;
        st = "\n";
        return st;
    }
}
