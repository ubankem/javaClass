public class PtStaff extends Staff{
    private double hourlyRate;
    private double numberHours;

    // constructor //
    public PtStaff(String name, String address, int age, String staffID, int grade, String school, String NI, double hourlyRate, double numberHours){
        super(name, address, age, staffID, grade, school, NI);
        this.hourlyRate = hourlyRate;
        this.numberHours = numberHours;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public double getNumberHours(){
        return numberHours;
    }
    public String toString(){
        String st = "\n";
        st += "Hourly Rate: " + hourlyRate;
        st += " Number of Hours: " + numberHours;
        st += "\n";
        return st;
    }
}

   
