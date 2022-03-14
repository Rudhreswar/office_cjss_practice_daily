package com.tasks.task2.data;



public class Department {


    private long deptId;
    private String deptName;

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }


    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }





    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }




}




