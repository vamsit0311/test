package com.lavi.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lavi.hibernate.model.Student;
import com.lavi.hibernate.util.HibernateUtil;

public class GetStudent {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session s = sf.openSession();
			 tx = s.beginTransaction();
			 Student st = (Student) s.load(Student.class, 1);
			 st.getMarks().remove(0);
			 s.update(st);
			tx.commit();
			System.out.println("Sudent sucessfully Inserted");
		} catch (Exception e) {
			System.out.println("Sudent insertion failed..So, rolling back");
			tx.rollback();
			e.printStackTrace();
			
			
		}
		
	}

}
