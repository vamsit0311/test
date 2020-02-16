package com.lavi.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf = null;
	static{
		Configuration cfg = new Configuration();
		cfg.configure();
		//sf = cfg.buildSessionFactory();
		StandardServiceRegistryBuilder sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		StandardServiceRegistry sr_ =  sr.build();
        sf = cfg.buildSessionFactory(sr_);      
	}
	public static  SessionFactory getSessionFactory(){
		return sf;
	}
}
