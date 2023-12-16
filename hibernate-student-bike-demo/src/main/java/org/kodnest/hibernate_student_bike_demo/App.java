package org.kodnest.hibernate_student_bike_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	
    	Student s1=new Student(1,"Monica",100);
    	Student s2=new Student(2,"Nishchitha",96);
    	Student s3=new Student(3,"Arjun",1);
    	
    	Bike b1=new Bike(2606,"Kawasaki",12345678);
    	Bike b2=new Bike(5667,"Pulsar",123445);
    	Bike b3=new Bike(4678,"TVS",76799);
    	
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	
    	SessionFactory fact=cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction txn=session.beginTransaction();
    	session.save(s1);
    	session.save(s2);
    	session.save(s3);
    	session.save(b1);
    	session.save(b2);
    	session.save(b3);
    	
    	txn.commit();
    	System.out.println();
    	System.out.println("----->"+s1+" data has been inserted Sucessfully !");
    	System.out.println("----->"+s2+" data has been inserted Sucessfully !");
    	System.out.println("----->"+s3+" data has been inserted Sucessfully !");
    	System.out.println();
    	System.out.println("----->"+b1+" data has been inserted Sucessfully !");
    	System.out.println("----->"+b2+" data has been inserted Sucessfully !");
    	System.out.println("----->"+b3+" data has been inserted Sucessfully !");
    	
    	
    	
    }
}
