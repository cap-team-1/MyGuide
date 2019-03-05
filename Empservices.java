package com.mirza.interfaces;

import java.util.List;

import com.mirza.classes.Employee;

public interface Empservices {
public void addEmp();
public void deleteEmp();
public void updateSalary();
public void updateName();
public void updateDeptNo();
public void updateComm();
public void getEmp(int empNo);
public double getMaxSalSalary();
public List<Employee>getEmpWithComm();
}
