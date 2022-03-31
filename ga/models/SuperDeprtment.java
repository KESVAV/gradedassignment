package com.gl.ga.models;
public  class SuperDeprtment {
		private  String departmentName ;
		private  String getTodaysWork  ;
		private String getWorkDeadline;
		private String isTodayAHoliday;
		
		 public String getdepartmentName() {
	    	 return departmentName;
	     }
	     public void  setdepartmentName(String departmentName) {
	    	 this.departmentName= "Super DpartmentName"; 
	     }

	     public String getgetTodaysWork() {
	    	 return getTodaysWork;
	     }
	     public void setgetTodaysWork(String getTodaysWork) {
	    	 this.getTodaysWork = "No Work as of Now"; 
	     }

	     public String getgetWorkDeadline() {
	    	 return getWorkDeadline;
	     }
	     public void setgetWorkDeadline(String getWorkDeadline) {
	    	 this.getWorkDeadline = "Nil"; 
	    	 
	     }
	     public String getisTodayAHoliday() {
	    	 return isTodayAHoliday;
	     }
	     
	     public void setisTodayAHoliday(String isTodayAHoliday) {
	    	 this.isTodayAHoliday= "Today is not a Holiday"; 
	     }
	   
	     public SuperDeprtment(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday) {
				this.departmentName = departmentName;
				this.getTodaysWork  = getTodaysWork;
				this.getWorkDeadline = getWorkDeadline;
				this.isTodayAHoliday = isTodayAHoliday;
			
		 }
			public String[] superDept() {
				String[] sup = { " departmentName :Super Department","getTodaysWork : No Work as of now"," getWorkDeadline:Nil", "isTodayAHoliday :Today is not a holiday"};
				for (String x: sup );
						System.out.println(sup);
						return sup;
				
			}
		}
	





