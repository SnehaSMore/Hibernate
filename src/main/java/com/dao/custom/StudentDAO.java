package com.dao.custom;

import java.io.IOException;
import java.util.List;

import com.dao.CrudDAO;
import com.entity.Student;


public interface StudentDAO extends CrudDAO<Student,String> {
    List getStudentIds() throws IOException;
}