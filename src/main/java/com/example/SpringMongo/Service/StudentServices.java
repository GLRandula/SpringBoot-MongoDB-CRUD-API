package com.example.SpringMongo.Service;

import com.example.SpringMongo.Entity.Student;
import com.example.SpringMongo.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo repo;

    public void saveorUpdate(Student students) {

        repo.save(students);
    }

    public Iterable<Student> listAll() {

        return this.repo.findAll();
    }

    public void deleteStudent(String id) {

        repo.deleteById(id);
    }

    public Student getStudentByID(String student_id) {

        return repo.findById(student_id).get();
    }
}
