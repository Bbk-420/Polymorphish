package com.company;

public class CommissionEmployee extends Employee {
    private double grossSell;
    private double commissionRate;

    public CommissionEmployee(){
        super();

    }
    public CommissionEmployee(String name,String employeeId,
                              double grossSell,double commissionRate){
        super(name,employeeId);
        this.grossSell=grossSell;
        this.commissionRate=commissionRate;

    }

    @Override
    public double earning() {
        return getGrossSell()*getCommissionRate();
    }

    public void setGrossSell(double grossSell) {
        this.grossSell = grossSell;
    }

    public double getGrossSell() {
        return grossSell;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public String toString() {
        return ("CommissionEmployee\n"+super.toString()+"GrossSell"+getGrossSell()
                +"CommissionRate"+getCommissionRate());
    }
}
