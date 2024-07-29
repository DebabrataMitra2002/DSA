// Employee.java

import java.util.Scanner;

class Employee {
    private int empNo;
    private String empName;
    private String joinDate;
    private char designationCode;
    private String department;
    private double basic;
    private double hra;
    private double it;

    public Employee(int empNo, String empName, String joinDate, char designationCode, String department,
                    double basic, double hra, double it) {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public char getDesignationCode() {
        return designationCode;
    }

    public double calculateSalary() {
        double da = 0;
        switch (designationCode) {
            case 'e':
                da = 20000;
                break;
            case 'c':
                da = 32000;
                break;
            case 'k':
                da = 12000;
                break;
            case 'r':
                da = 15000;
                break;
            case 'm':
                da = 40000;
                break;
            default:
                System.out.println("Invalid designation code.");
        }
        return (basic + hra) - da - it;
    }
}

// Project1.java
public class Project1 {
    public static void main(String[] args) {
        Employee[] employees = {    

           new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 0, 0),
            new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 0, 0),
            new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 23000, 9000),
            new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
        };

        // Check if argument count is valid
        // if (args.length != 1) {
        //     System.out.println("Usage: java Project1 <empNo>");
        //     return;
        // }

        
        // try {
        //     empNo = Integer.parseInt(args[0]);
        // } catch (NumberFormatException e) {
        //     System.out.println("Invalid employee ID format: " + args[0]);
        //     return;
        // }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int empNo = scanner.nextInt();

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getEmpNo() == empNo) {
                found = true;
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(emp.getEmpNo() + "\t" + emp.getEmpName() + "\t\t" +
                                   emp.getDepartment() + "\t\t" + getDesignation(emp.getDesignationCode()) +
                                   "\t\t" + emp.calculateSalary());
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid: " + empNo);
        }
    }

    // Method to get designation from code
    private static String getDesignation(char code) {
        switch (code) {
            case 'e':
                return "Engineer";
            case 'c':
                return "Consultant";
            case 'k':
                return "Clerk";
            case 'r':
                return "Receptionist";
            case 'm':
                return "Manager";
            default:
                return "Unknown";
        }
    }
}
