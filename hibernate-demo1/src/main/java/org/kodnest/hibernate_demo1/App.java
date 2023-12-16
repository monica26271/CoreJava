package org.kodnest.hibernate_demo1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration conf=new Configuration();
    	conf.configure();//by default it takes input as hibernate.cfg.xml
    	
    	SessionFactory factory=conf.buildSessionFactory();
    
        System.out.println( "Hybernate started working successfully "+factory.toString() );
    }
}
