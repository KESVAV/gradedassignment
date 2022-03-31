package com.gl.ga.models;
import com.gl.ga.models.SuperDeprtment;

public class TechDepartment extends SuperDeprtment {
		private  String departmentName ;
		private  String getTodaysWork  ;
		private String getWorkDeadline;
		private String getTechStackInformation;
	
		public String getdepartmentName() {
	   	 return departmentName;
	    }
	    public void  setdepartmentName(String departmentName) {
	   	 this.departmentName= "Tech Dpartment"; 
	    }

	    public String getgetTodaysWork() {
	   	 return getTodaysWork;
	    }
	    public void setgetTodaysWork(String getTodaysWork) {
	   	 this.getTodaysWork = "Complete coding of module 1"; 
	    }

	    public String getgetWorkDeadline() {
	   	 return getWorkDeadline;
	    }
	    public void setgetWorkDeadline(String getWorkDeadline) {
	   	 this.getWorkDeadline = "Complete by EOD"; 

	}
	    public String getgetTechStackInformation() {
	    	 return getTechStackInformation;
	     }
	     
	     public void setgetTechStackInformation(String getTechStackInformation) {
	    	 this.getTechStackInformation = "core Java"; 
	     }
	     public TechDepartment(String departmentName, String getTodaysWork, String getWorkDeadline,
					String getTechStackInformation) {
				super(departmentName, getTodaysWork, getWorkDeadline, getTechStackInformation);
				// TODO Auto-generated constructor stub
				this.departmentName = departmentName;
				this.getTodaysWork  = getTodaysWork;
				this.getWorkDeadline = getWorkDeadline;
				this.getTechStackInformation = getTechStackInformation;

	}
}