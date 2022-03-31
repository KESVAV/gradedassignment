package com.gl.ga.services;

import com.gl.ga.models.AdminDepartment;
import com.gl.ga.models.HrDepartment;
import com.gl.ga.models.SuperDeprtment;
import com.gl.ga.models.TechDepartment;

public class DeptmentService {
    	
		   public static void showSuperDeptDetails(SuperDeprtment supdept) {
			   System.out.println( "  " +supdept.getdepartmentName()+"  " +supdept.getgetTodaysWork());
			   System.out.println( "Employee First Name  " +supdept.getgetWorkDeadline());
			   System.out.println( "Employee Last Name  " +supdept.getisTodayAHoliday());
	   
		     }
		   public static void showAdminDeptdetials(AdminDepartment adminDept) {
		 	   System.out.println( "  " +adminDept.getdepartmentName()+"  " +adminDept.getgetTodaysWork());
		 	   System.out.println( adminDept.getgetWorkDeadline());
		 	  System.out.println(adminDept.getisTodayAHoliday());
		 	  	}
	    
		   public static void showHrDeptdetials(HrDepartment hrDept) {
			  	   System.out.println( "  " +hrDept.getdepartmentName()+"  " +hrDept.getgetTodaysWork());
			  	   System.out.println( hrDept.getgetWorkDeadline());
			  	   System.out.println(hrDept.getdoActivity());
			 }

			 public static void showTecDeptdetials(TechDepartment techDept) {
			  	   System.out.println( "  " +techDept.getdepartmentName()+"  " +techDept.getgetTodaysWork());
			  	   System.out.println( techDept.getgetWorkDeadline());
			  	   System.out.println(techDept.getgetTechStackInformation());
			  }


}
