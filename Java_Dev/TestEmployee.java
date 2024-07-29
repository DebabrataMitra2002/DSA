public class TestEmployee{
    public static void main(String[] args) {
        
        Employee employee = new Employee("Debabrata Mitra", 720000, "22/06/2025", "ADsfsfo");

        System.out.println("Employee Details:");
        System.out.println("Name:"+employee.getName());
        System.out.println("Salary:"+employee.getAnnuSal());
        System.out.println("Joning Date:"+employee.getDate());
        System.out.println("National Insurence Number:"+employee.getNatIns());
        
        
    }
}
