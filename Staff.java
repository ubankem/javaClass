public class Staff extends Person{
    private String staffID;
    private int grade;
    private String school;
    private String NI;

    //constructor //
    public Staff(String name, String address, int age, String staffID, int grade, String school, String NI){
        super(name, address, age);
        this.staffID = name;
        this.grade = grade;
        this.school = school;
        this. NI = NI;
    }
    public String getStaffID(){
        return staffID;
    }
     public int getGrade(){
        return grade;
    }
     public String getSchool(){
        return school;
    }
     public String getNI(){
        return NI;
    }
    
    public void setStaffID(String staffID){
        this.staffID = staffID;
    }
}
