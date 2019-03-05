package com.mirza.classes;

import java.sql.Date;

public class Employee {

private int empNo;
private String ename;
private String job;
private int mgr;
private Date hiredate;
private double sal;
private double comm;
private int deptNo;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empNo, String ename, String job, int mgr, Date hiredate, double sal, double comm, int deptNo) {
	super();
	this.empNo = empNo;
	this.ename = ename;
	this.job = job;
	this.mgr = mgr;
	this.hiredate = hiredate;
	this.sal = sal;
	this.comm = comm;
	this.deptNo = deptNo;
}
public double getComm() {
	return comm;
}
public int getDeptNo() {
	return deptNo;
}
public int getEmpNo() {
	return empNo;
}
public String getEname() {
	return ename;
}
public Date getHiredate() {
	return hiredate;
}
public String getJob() {
	return job;
}
public int getMgr() {
	return mgr;
}
public double getSal() {
	return sal;
}
public void setComm(double comm) {
	this.comm = comm;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public void setEname(String ename) {
	this.ename = ename;
}
public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}
public void setJob(String job) {
	this.job = job;
}
public void setMgr(int mgr) {
	this.mgr = mgr;
}
public void setSal(double sal) {
	this.sal = sal;
}


}
