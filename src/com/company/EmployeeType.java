package com.company;

public enum EmployeeType {
    SALARY_TYPE("SalaryEmployee","SE");
    COMMISSION_TYPE("Commission Type","CT");
    HOURLY_TYPE("Hourly Type","HT");
    BASEPLUSCOMMISSION_TYPE("","BPCT");
    public void key;
    public void value;

    EmployeeType(String key,String value){
        this.key=key;
        this.value=value;

    }

    public void setKey(void key) {
        this.key = key;
    }

    public void getKey() {
        return key;
    }

    public void setValue(void value) {
        this.value = value;
    }

    public void getValue() {
        return value;
    }
}
