package org.example.inheritance_to_interfaces;

import org.example.Student;

public class StudentServiceAdvanced implements IStudentServiceAdvanced {
    @Override
    public Student getStudentAlex() {
        return new Student("alexid", "Alex");
    }

    @Override
    public Student getStudent() {
        return new Student("id", "name2");
    }
}
