package com.dao.custom.impl;

import com.dao.custom.StudentDAO;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean add(Student entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Student student) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String student_id) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, student_id);
        session.delete(student);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Student find(String sid) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, sid);
        transaction.commit();
        session.close();
        return student;
    }

    @Override
    public List<Student> findAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        List<Student> studentList = null;
        Query sessionQuery = session.createQuery("from Student");
        studentList = sessionQuery.list();
        transaction.commit();
        session.close();
        return studentList;
    }

    @Override
    public List getStudentIds() throws IOException {
        List<String> sIds = new ArrayList<>();
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Query sessionQuery = session.createQuery("SELECT student_id FROM Student ");
        sIds=sessionQuery.list();
        transaction.commit();
        session.close();
        return sIds;
    }
}