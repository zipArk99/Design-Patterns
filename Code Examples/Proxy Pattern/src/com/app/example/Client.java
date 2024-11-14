package com.app.example;

class Client{
    private String role;
    private int empId;


     Client(String role,int empId){
        this.role=role;
        this.empId=empId;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    public int getEmpId() {
        return empId;
    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }


}