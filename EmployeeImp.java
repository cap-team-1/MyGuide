package com.mirza.classes;

import java.sql.Connection;
import java.util.List;

import com.mirza.interfaces.EmpDao;

public class EmployeeImp implements EmpDao{
Connection conn=null;
	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		conn=DbConnection.getConnection();
		
		return null;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderBy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GroupBy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
