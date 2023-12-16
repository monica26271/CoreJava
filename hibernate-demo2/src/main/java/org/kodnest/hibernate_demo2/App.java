package org.kodnest.hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student(1,"Monica",100);
    	//1.Cofigure the hibernate.cfg.xml file
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	//2.build Seesion Factory using confiuration object
    	SessionFactory factory= cfg.buildSessionFactory();
    	//3.open session using Session Factory
    	Session session=factory.openSession();
    	//4.begin the transaction using session
    	Transaction txt=session.beginTransaction();
    	
    	session.save(s1);
    	//5.commit the transaction
    	txt.commit();
    	
    	System.out.println("------>"+s1+"Data has been stored sucessfully !");
    
    }
}
