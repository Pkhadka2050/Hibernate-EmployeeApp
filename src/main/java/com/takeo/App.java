package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Step 1: Creating Configuration object
        Configuration cfg=new Configuration();
        
        cfg.configure("com\\takeo\\config\\hibernate.cfg.xml");
        
        //step 2: Build Session Object
        SessionFactory factory=cfg.buildSessionFactory();
        
        //step 3: OPen Session Object
        Session ses=factory.openSession();
        
        Transaction tx=ses.beginTransaction();
        
        //step 4: Perform persistence
        Employee emp=new Employee();
        
        emp.setFname("Pravin");
        emp.setLname("KC");
        emp.setEmail("Prav@gmail.com");
        
        Integer id=(Integer)ses.save(emp);
        
        tx.commit();
        ses.close();
        factory.close();
    }
}
