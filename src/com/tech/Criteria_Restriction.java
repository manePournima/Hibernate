package com.tech;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Criteria_Restriction {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate-cfg.xml");
		
		SessionFactory  sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
				
				//select * From Employee it is a criteria
				//Criteria is used for select clause only when we give
		      //select * from employee where id =1 ,where clause provide Restrictions
		
		
		  Criteria cr = session.createCriteria(Employee.class);
		  
		  //where id=?
			/*
			 * Criterion cr1=Restrictions.eq("id", 1);
			 * 
			 * cr.add(cr1);
			 * 
			 * Employee emp=(Employee)cr.uniqueResult(); System.out.println(emp);
			 */
			// ---------------------------------------------------------------------------

			//select * from employee where id>2
			
			//where id >2
			Criterion cr2=Restrictions.gt("id", 2);
			
			cr.add(cr2);
			
			List<Employee> empList=cr.list();
			System.out.println(empList);
			
			// ---------------------------------------------------------------------------

			//where id >2
			Criterion cr1=Restrictions.gt("id", 2);
			Criterion cr3=Restrictions.lt("id", 6);
			//Criterion cr2=Restrictions.le("id", 6);
			
			
			
			cr.add(cr1);
			cr.add(cr3);
			
			List<Employee> empList1=cr.list();
			System.out.println(empList1);
			
			// ---------------------------------------------------------------------------

			
		
		
		
	}

}
