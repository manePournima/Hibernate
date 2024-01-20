package com.tech;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CriteriaTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		// select * from hb_batch.employee_db_2
				// where name ='aa'

			
		Criteria cr = session.createCriteria(Employee.class);
		
		Criterion cr1 = Restrictions.eq("name", "Shubham Thonge");
		cr.add(cr1);
		
		Employee emp = (Employee) cr.uniqueResult();
		System.out.println(emp);
		
		
		
		
	}

}
