package com.mirza.interfaces;
import java.util.List;

import com.mirza.classes.Employee;

public interface EmpDao {
public List<Employee> getAll();
public void insert();
public void delete();
public void orderBy();
public void GroupBy();
public void update();

}
