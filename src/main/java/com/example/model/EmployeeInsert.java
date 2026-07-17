package com.example.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeInsert {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();

        Employee emp = new Employee();

        emp.setName("Chauhan");
        emp.setSalary(100000);

        session.persist(emp);
        session.beginTransaction();

        session.persist(emp);

        session.getTransaction().commit();

        session.close();

        System.out.println("Employee inserted");
    }
}