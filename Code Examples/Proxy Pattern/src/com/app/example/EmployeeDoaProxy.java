package com.app.example;

public class EmployeeDoaProxy implements EmployeeDoa {

    EmployeeDoa employeeDoaImpl;

     EmployeeDoaProxy(){
        this.employeeDoaImpl=new EmployeeDoaImpl();
    }

    @Override
    public void createEmployee(Client client) {
        try {
            if(client.getRole().equals("ADMIN")){
                employeeDoaImpl.createEmployee(client);
            }else{
                throw new AccessDenied("Access Denied");
            }
            
        } catch (AccessDenied e) {
            System.out.println(e);
        }
      


    }

    @Override
    public void updateEmploee(Client client) {
        try {
            if(client.getRole().equals("ADMIN")){
                employeeDoaImpl.updateEmploee(client);
            }else{
                throw new AccessDenied("Access Denied");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       

    }

    @Override
    public Employee getEmployee(Client client,int id) {
        try {
            if(client.getRole().equals("USER") ||client.getRole().equals("ADMIN")){
                return employeeDoaImpl.getEmployee(client, id);
             }else{
                 throw new AccessDenied("Access Denied");
             }
        } catch (Exception e) {
            System.out.println(e);
            return new Employee();
        }
        

       
    }
    
}
