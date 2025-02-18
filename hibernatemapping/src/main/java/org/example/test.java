package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
    public static void main(String[] args) {

            SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            Session session=factory.openSession();
            Employee employee=new Employee(101,"anjali",12000);
            //employee.setId(101);
           // employee.setName("anjali");
           // employee.setSalary(20000);
        Transaction tx=session.beginTransaction();

        session.save(employee);
        tx.commit();
        session.close();
        factory.close();
        }
}
