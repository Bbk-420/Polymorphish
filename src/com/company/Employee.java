package com.company;

public abstract class Employee {
    private String name;
    private String employeeId;

    public Employee(){

    }

    public Employee(String name,String employeeId){
        this.name=name;
        this.employeeId=employeeId;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public abstract double earning();


    @Override
    public String toString() {
        return("Name::"+getName()+"EmployeeId::"+getEmployeeId()+super.toString());
    }
}
