package com.company.salaryEmployee;

import com.company.Constants;
import com.company.Employee;
import com.company.EmployeeType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalaryEmployee extends Employee {
    private double salary;

    public SalaryEmployee() {
        super();

    }

    public SalaryEmployee(String name, String employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double earning() {
        return getSalary();
    }

    @Override
    public String toString() {
        return ("SalaryEmployee::\n" + super.toString() + "Salary::" + getSalary());
    }

  /*  public void insertingintosalaryemployee(SalaryEmployee salaryEmployee) {


        try {
            Class.forName(Constants.Class_Bbk);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp",
                    "root", "Bib@k123");
            System.out.println("Connected!!!");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO `Emp`.`emp_details` (\n" +
                    "  `Name`,\n" +
                    "  `Emp_Id`,\n" +
                    "  `Salary`,\n" +
                    "  `GrossSell`,\n" +
                    "  `CommissionRate`,\n" +
                    "  `HourlyWorked`,\n" +
                    "  `HourlyRate`,\n" +
                    "  `BaseSalary`\n" +
                    ") \n" +
                    "VALUES\n" +
                    "  (\n" +
                    "    '" + salaryEmployee.getName() + "',\n" +
                    "    " + salaryEmployee.getEmployeeId() + ",\n" +
                    "    " + salaryEmployee.getSalary() + ",\n" +
                    "    " + null + ",\n" +
                    "    " + null + ",\n" +
                    "    " + null + ",\n" +
                    "    " + null + ",\n" +
                    "    " + null + "\n" +
                    "  ) ;\n" +
                    "\n");
            System.out.println("Inserted Successfully!!!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //display


    } */


  /*  public List<SalaryEmployeeDetails> getmyReports() {
        List<SalaryEmployeeDetails> list = new ArrayList<>();
        try {
            Class.forName(Constants.Class_Bbk);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp",
                    "root", "Bib@k123");

            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("SELECT \n" +
                    "  `Name`,\n" +
                    "  `Emp_Id`,\n" +
                    "  `Salary`,\n" +
                    "  `GrossSell`,\n" +
                    "  `CommissionRate`,\n" +
                    "  `HourlyWorked`,\n" +
                    "  `HourlyRate`,\n" +
                    "  `BaseSalary` \n" +
                    "FROM\n" +
                    "  `Emp`.`emp_details` ");
            while (resultSet.next()){
                System.out.println("resultSet::"+resultSet.next());
                SalaryEmployeeDetails salaryEmployeeDetails=new SalaryEmployeeDetails();
                salaryEmployeeDetails.setName(resultSet.getString("Name"));
                salaryEmployeeDetails.setEmpId(resultSet.getString("Emp_Id"));
                salaryEmployeeDetails.setSalary(resultSet.getDouble("Salary"));
                list.add(salaryEmployeeDetails);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return list;
    }

    public void showMyReports(List<SalaryEmployeeDetails> list) {
        System.out.println("Name"+"     "+"ID"+"            "+"Salary");
        for(SalaryEmployeeDetails salaryEmployeeDetails:list){
            System.out.printf(salaryEmployeeDetails.getName());
            System.out.printf(salaryEmployeeDetails.getEmpId());
            System.out.printf(salaryEmployeeDetails.getSalary()+"EmployeeType.SALARY_TYPE");
            System.out.println();
        }
    } */
    public void deleteintosalaryemployee(SalaryEmployee salaryEmployee){
        try {
            Class.forName(Constants.Class_Bbk);
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp"
                    ,"root","Bib@k123");
            Statement statement=connection.createStatement();
            System.out.println("Connected!! insert query to delete");
            statement.executeUpdate("`Employee``Emp``emp_details`\n" +
                    "DELETE \n" +
                    "FROM\n" +
                    "  `Emp`.`emp_details` \n" +
                    "WHERE `Emp_Id` = 'Emp_Id' ;");

            System.out.println("Deleted Sucessfully!! ");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }


    }
}
