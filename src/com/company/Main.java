package com.company;

import com.company.salaryEmployee.SalaryEmployee;
import com.company.salaryEmployee.SalaryEmployeeDetails;

import java.util.List;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        EmployeeType employeeType=new EmployeeType("Salary Employee","10000");
        System.out.println(employeeType.key);

        Invoice invoice=new Invoice();
        System.out.println(invoice.payment());

        SalaryEmployee salaryEmployee = new SalaryEmployee();
        SalaryEmployee salaryEmployee1 = new SalaryEmployee("bibek", "229", 10000);
        salaryEmployee.deleteintosalaryemployee(salaryEmployee1);
      /*  System.out.println("Name::"+salaryEmployee.getName()
                +"\t\tEmployeeId::"+salaryEmployee.getEmployeeId()
                +"\t\tSalary::"+salaryEmployee.getSalary());
        System.out.println("----------------------------------------------------------------------");*/

       //  salaryEmployee.insertingintosalaryemployee(salaryEmployee1);

     /*   HourlyEmployee hourlyEmployee=new HourlyEmployee("maikal",
                "01",12,100);
        System.out.println("Name::"+hourlyEmployee.getName()+
                "\t\tEmployeeId::"+hourlyEmployee.getEmployeeId()+
                "\t\tHourlyWorked::"+hourlyEmployee.getHourlyWorked()+
                "\t\tHourlyRate::"+hourlyEmployee.getHourlyRate()
                +"\t\tEarning::"+hourlyEmployee.earning());
        System.out.println("-----------------------------------------------------------------------");

        CommissionEmployee commissionEmployee=new CommissionEmployee("Chandan",
                "0123",100,0.1);
        System.out.println("Name::"+commissionEmployee.getName()
        +"\t\tEmployeeId::"+commissionEmployee.getEmployeeId()
        +"\t\tGrossSell::"+commissionEmployee.getGrossSell()
        +"\t\tCommissionRate::"+commissionEmployee.getCommissionRate()
        +"\t\tEarning::"+commissionEmployee.earning());
        System.out.println("------------------------------------------------------------------------");

        BasePlusCommissionEmployee basePlusCommissionEmployee=new BasePlusCommissionEmployee("Suman",
                "15",100,0.1,10000);
        System.out.println("Name::"+basePlusCommissionEmployee.getName()
        +"\t\tEmployeeId::"+basePlusCommissionEmployee.getEmployeeId()
        +"\t\tGrossSell::"+basePlusCommissionEmployee.getGrossSell()
        +"\t\tCommissionRate::"+basePlusCommissionEmployee.getCommissionRate()
        +"\t\tBaseSalary::"+basePlusCommissionEmployee.getBaseSalary()+
        "\t\tEarning::"+basePlusCommissionEmployee.earning());
        System.out.println("-------------------------------------------------------------------------");

        Employee employee=hourlyEmployee;

        List<Employee> list=new ArrayList<>();
        hourlyEmployee.setName(hourlyEmployee.getName());
        hourlyEmployee.setEmployeeId(hourlyEmployee.getEmployeeId());
        hourlyEmployee.setHourlyWorked(hourlyEmployee.getHourlyWorked());
        hourlyEmployee.setHourlyRate(hourlyEmployee.getHourlyRate());

        list.add(employee);
        Employee employee1=salaryEmployee;
        salaryEmployee.setName(salaryEmployee.getName());
        salaryEmployee.setEmployeeId(salaryEmployee.getEmployeeId());
        salaryEmployee.setSalary(salaryEmployee.getSalary());
        list.add(employee1);

      /* for(Employee employee1: list){
            System.out.println(employee1.toString());
            System.out.println("Earning::"+employee1.toString());

        } */
   /*  salaryEmployee.getmyReports();
     List<SalaryEmployeeDetails> list =salaryEmployee.getmyReports();
     salaryEmployee.showMyReports(list);




    } */
    }
}
