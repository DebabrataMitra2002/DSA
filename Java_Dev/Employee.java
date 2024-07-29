public class Employee extends Person {
    private double annuSal;
    private String date;
    private String natIns;
    public Employee(String name,double annuSal, String date, String natIns) {
        super(name);
        this.annuSal = annuSal;
        this.date = date;
        this.natIns = natIns;
    }
    
    public double getAnnuSal() {
        return annuSal;
    }
    
    public void setAnnuSal(double annuSal) {
        this.annuSal = annuSal;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getNatIns() {
        return natIns;
    }
    public void setNatIns(String natIns) {
        this.natIns = natIns;
    }
    
}
