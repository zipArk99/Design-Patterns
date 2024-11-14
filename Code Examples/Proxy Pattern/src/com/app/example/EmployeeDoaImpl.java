package com.app.example;

public class EmployeeDoaImpl implements EmployeeDoa {

    @Override
    public void createEmployee(Client client) {
        // TODO Auto-generated method stub
        System.out.println("Employee created successfully");
    }

    @Override
    public void updateEmploee(Client client) {
        System.out.println("Employee updated Successfully");
    }

    @Override
    public Employee getEmployee(Client client,int id) {
        System.out.println("Fetched Employee Successfully");
        return new Employee();
    }
    
}
