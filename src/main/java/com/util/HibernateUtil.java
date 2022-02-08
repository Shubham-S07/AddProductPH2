package com.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.entity.EProduct;

public class HibernateUtil {
	public static SessionFactory buildSessionFactory() {
		
		//1
		Configuration cnfg = new Configuration();
		cnfg.configure("hibernate.cfg.xml");
		cnfg.addAnnotatedClass(EProduct.class);
		
		//2
		SessionFactory sessfac = cnfg.buildSessionFactory();

		return sessfac;
	}

}
