package com.example.turtor_ktnc_buoi2.De2_phan_3;

public class NhanVien {
    private int EmployeeID;
    private String codeEmployee;
    private String FirstName;
    private String LastName;
    private String Position;
    private double Salary;

    public NhanVien() {
    }

    public NhanVien(int employeeID, String codeEmployee, String firstName, String lastName, String position, double salary) {
        EmployeeID = employeeID;
        this.codeEmployee = codeEmployee;
        FirstName = firstName;
        LastName = lastName;
        Position = position;
        Salary = salary;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(String codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
