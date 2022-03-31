package com.gl.ga.models;
import com.gl.ga.models.SuperDeprtment;

public class AdminDepartment extends SuperDeprtment {
	private  String departmentName ;
	private  String getTodaysWork  ;
	private String getWorkDeadline;
	
	public String getdepartmentName() {
   	 return departmentName;
    }
    public void  setdepartmentName(String departmentName) {
   	 this.departmentName= "Admin Dpartment"; 
    }

    public String getgetTodaysWork() {
   	 return getTodaysWork;
    }
    public void setgetTodaysWork(String getTodaysWork) {
   	 this.getTodaysWork = "Complete your Documents Submission"; 
    }

    public String getgetWorkDeadline() {
   	 return getWorkDeadline;
    }
    public void setgetWorkDeadline(String getWorkDeadline) {
   	 this.getWorkDeadline = "Complete by EOD"; 

    }
    public AdminDepartment(String departmentName, String getTodaysWork, String getWorkDeadline,
			String isTodayAHoliday) {
		super(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday);
		// TODO Auto-generated constructor stub
		this.departmentName = departmentName;
		this.getTodaysWork  = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
	}
}