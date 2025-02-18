package com.map.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
    public static void main(String[] args) {
        SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();


        Person pesron =new Person(23,"anjali","latur","pune");
        Transaction tx=session.beginTransaction();
        session.save(pesron);




        tx.commit();
        session.close();
        factory.close();


    }
    }

