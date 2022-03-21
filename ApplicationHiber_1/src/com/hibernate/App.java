package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.account;

public class App {
	
	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(account.class).buildSessionFactory();
		Session session= factory.getCurrentSession();
		
		try {
			//caeate a object for entity
			
		//	account act= new account("raj","kapoor","786","rk");
			account act= new account();
			//start transactio
			session.beginTransaction();
			//perform opration
			//add record
		//	session.save(act);
			act=session.get(account.class, 8);
			//update record
			act.setFirst_name("Akash");
			//deleting recod wth user is
			//session.delete(act);
			
			//commite
			session.getTransaction().commit();
			System.out.println(act);
			
		}finally {
			session.close();
			factory.close();
		}
	}

}
