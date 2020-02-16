package com.lavi.hibernate;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lavi.hibernate.model.Student;
import com.lavi.hibernate.util.HibernateUtil;

public class StudentData {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session s = sf.openSession();
			 tx = s.beginTransaction();
			String courses[] = { "Java", "JDBC", "JSP" };
			List<String> emails = new ArrayList<String>();
			emails.add("a@lavi.com");
			emails.add("a@lavi.com");
			emails.add("b@lavi.com");
			emails.add("c@lavi.com");
			List<String> marks = new ArrayList<String>();
			marks.add("95");
			marks.add("95");
			marks.add("90");
			marks.add("85");
			Set<String> phones = new HashSet<String>();
			phones.add("9036647051");
			phones.add("9036647052");
			phones.add("9036647053");
			phones.add("9036647053");
			Map<String, Long> refs = new HashMap<String, Long>();
			refs.put("Siva", 9036647051l);
			refs.put("Naveen", 9036647052l);
			Student st = new Student("Lavi", "01-01-2011", "B-Tech", courses, emails, marks, phones, refs);
			s.save(st);
			tx.commit();
			System.out.println("Sudent sucessfully Inserted");
		} catch (Exception e) {
			System.out.println("Sudent insertion failed..So, rolling back");
			tx.rollback();
			e.printStackTrace();
			
			
		}
		
	}

}
