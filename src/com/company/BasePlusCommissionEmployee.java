package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

     public BasePlusCommissionEmployee(){
         super();
     }
     public BasePlusCommissionEmployee(String name,String employeeId,
                                       double grossSell,
                                       double commissionRate,double baseSalary){
         super(name, employeeId, grossSell, commissionRate);
         setBaseSalary(baseSalary);

     }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earning() {
        return baseSalary*super.earning();
    }
}
