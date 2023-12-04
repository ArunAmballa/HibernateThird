package com.arun.HibernateThird;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.HibernateThird.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	
    	SessionFactory sf=config.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Student st=session.get(Student.class, 504);
    	
    	if(st!=null)
    	{
    		Transaction transaction=session.beginTransaction();
        	
        	session.delete(st);
        	
        	System.out.println("Object Deleted");
        	
        	transaction.commit();
        	
        	session.close();
    	}
    	else {
    		System.out.println("Object Not Found");
    	}
    			
    	
    	
    }
}
