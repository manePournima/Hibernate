package com.tech;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Creteria_Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate-cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		//select * From Employee
	   //crieteria is used for select clause only
		// code to select all the data
		
		
		Criteria cr = session.createCriteria(Employee.class);
		List<Employee> emplist = cr.list();
		System.out.println(emplist);
		
		
				
	}

}
