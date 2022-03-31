package com.gl.ga.client;
import com.gl.ga.models.AdminDepartment;
import com.gl.ga.models.HrDepartment;
import com.gl.ga.models.SuperDeprtment;
import com.gl.ga.models.TechDepartment;
public class DepartmentClient {
	
			public static void main (String[] args) {
			SuperDeprtment sd= new SuperDeprtment("Super Department", "no Work as of Now","nil", "Today is not Holiday");
			SuperDeprtment ad = new AdminDepartment("Admin Depart", "Complete your document submission", "Complete by EOD", null);
			SuperDeprtment hr = new HrDepartment("Hr Depart", " Fill todays work sheet and mark your attendance", "Complete by EOD","Team Lunch");
			SuperDeprtment td = new TechDepartment("Tech Department", "Complete coding of module 1" , "Complete by EOD", "Core JAVA");
			
			System.out.println(sd);
			System.out.println(ad);
			ad.getdepartmentName();
			ad.getgetTodaysWork();
			ad.getgetWorkDeadline();
			System.out.println(hr);
			hr.getdepartmentName();
			hr.getgetTodaysWork();
			hr.getgetWorkDeadline();
			System.out.println(td);
			td.getdepartmentName();
			td.getgetTodaysWork();
			td.getgetWorkDeadline();
			
		}

	}


