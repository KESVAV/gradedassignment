package com.gl.ga.models;
import com.gl.ga.models.SuperDeprtment;
	public class HrDepartment extends SuperDeprtment {
		private  String departmentName ;
		private  String getTodaysWork  ;
		private String getWorkDeadline;
		private String doActivity;
		
		public String getdepartmentName() {
	   	 return departmentName;
	    }
	    public void  setdepartmentName(String departmentName) {
	   	 this.departmentName= "Hr Dpartment"; 
	    }

	    public String getgetTodaysWork() {
	   	 return getTodaysWork;
	    }
	    public void setgetTodaysWork(String getTodaysWork) {
	   	 this.getTodaysWork = "Fill today’s worksheet and mark your attendance"; 
	    }

	    public String getgetWorkDeadline() {
	   	 return getWorkDeadline;
	    }
	    public void setgetWorkDeadline(String getWorkDeadline) {
	   	 this.getWorkDeadline = "Complete by EOD"; 

	}
	    public String getdoActivity() {
	    	 return doActivity;
	     }
	     
	     public void setisTodayAHoliday(String doActivity) {
	    	 this.doActivity = "team Lunch"; 
	     }
	     
	     public HrDepartment(String departmentName, String getTodaysWork, String getWorkDeadline,
					String doActivity) {
				super(departmentName, getTodaysWork, getWorkDeadline, doActivity);
				// TODO Auto-generated constructor stub
				this.departmentName = departmentName;
				this.getTodaysWork  = getTodaysWork;
				this.getWorkDeadline = getWorkDeadline;
				this.doActivity = doActivity;
			}
	     
	}

