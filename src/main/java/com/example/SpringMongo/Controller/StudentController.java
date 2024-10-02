package com.example.SpringMongo.Controller;

import com.example.SpringMongo.Entity.Student;
import com.example.SpringMongo.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping(value = "/save")
    public String saveStudent(@RequestBody Student students) {

        studentServices.saveorUpdate(students);
        return students.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Student> getStudents() {
        return studentServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    public Student update(@RequestBody Student student, @PathVariable(name = "id") String _id) {
        student.set_id(_id);
        studentServices.saveorUpdate(student);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") String _id) {
        studentServices.deleteStudent(_id);
    }

    @RequestMapping("/search/{id}")
    public Student getStudents(@PathVariable(name = "id") String student_id) {
        return studentServices.getStudentByID(student_id);
    }

}