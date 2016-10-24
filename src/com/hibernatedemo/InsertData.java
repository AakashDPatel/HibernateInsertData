/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatedemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Aakash
 */
public class InsertData {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); 
            Session session = sessionFactory.openSession();
            
            Student student = new Student();
            student.setName("BladeRazor");
            student.setSubject("League of Legends");
            student.setFees(0);
            
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            System.out.println("Records are inserted");
            
            sessionFactory.close();
        }
    }

