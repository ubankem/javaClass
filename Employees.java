import java.util.ArrayList;

public class Employees  {
    private static final PtStaff ftStaff = null;
    ArrayList<PtStaff>  ptEmployees = new ArrayList<>();
    ArrayList<FtStaff>  ftEmployees = new ArrayList<>();
    public void addPtStaff(PtStaff ptStaff){
        ptEmployees.add(ptStaff);
    }
      public void addFtStaff(FtStaff ftStaff1){
        ptEmployees.add(ftStaff);
    }
    public void listAllEmployess(){
        for(PtStaff ptStaff: ptEmployees){
            System.out.println(ptStaff);
        }
        for (FtStaff ftStaff : ftEmployees) {
      System.out.println(ftStaff);
      }

    

    }
    public static void main(String[] args) {
        PtStaff ptStaff1 = new PtStaff("JCG", "Aberdeen", 63, "1234", 60, "RGU", "NP114589N", 20.5, 120);
        PtStaff ptStaff2 = new PtStaff("JCG", "Aberdeen", 63, "1234", 80, "RGU", "NP114589N", 10.5, 12);
        FtStaff ftStaff1 = new FtStaff("MILES", "Scotland", 63, "8901", 90, "RGU", "NP122599N", 34000);
        FtStaff ftStaff2 = new FtStaff("MILES", "Scotland", 63, "8901", 90, "RGU", "NP122599N", 34000);
        Employees employees = new Employees();
        employees.addPtStaff(ptStaff1);
        employees.addPtStaff(ptStaff2);
        employees.addFtStaff(ftStaff1);
        employees.addFtStaff(ftStaff2);
        employees.listAllEmployess();
       
    }
   
}

