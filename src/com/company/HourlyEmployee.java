package com.company;

public class HourlyEmployee extends Employee {
    private int hourlyWorked;
    private double hourlyRate;

    public HourlyEmployee(){
        super();

    }
    public HourlyEmployee(String name,String employeeId,
                          int hourlyWorked,double hourlyRate){
        super(name, employeeId);
        setHourlyWorked(hourlyWorked);
        setHourlyRate(hourlyRate);
    }

    public void setHourlyWorked(int hourlyWorked) {
        this.hourlyWorked = hourlyWorked;
    }

    public int getHourlyWorked() {
        return hourlyWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double earning() {
        if(getHourlyWorked()<=100){
            return getHourlyWorked()*getHourlyRate();
        }else{
            return (100*getHourlyRate()+getHourlyWorked()-100)*1.5*getHourlyRate();
        }
    }
}
