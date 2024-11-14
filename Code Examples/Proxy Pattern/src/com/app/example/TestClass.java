package com.app.example;

public class TestClass {
    public static void main(String[] args) {

        Client client = new Client("ADMIN",10);
        Client client2 = new Client("USER",10);

        EmployeeDoa employeeDoa = new EmployeeDoaProxy();
        employeeDoa.createEmployee(client); 
        
    }
    
}
