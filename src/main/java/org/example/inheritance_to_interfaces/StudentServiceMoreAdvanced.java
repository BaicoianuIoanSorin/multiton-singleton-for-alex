package org.example.inheritance_to_interfaces;

import org.example.Student;

public class StudentServiceMoreAdvanced implements IStudentServiceMoreAdvanced {
    @Override
    public Student getStudentIonut() {
        return new Student("ionutid","Ionut");
    }

    @Override
    public Student getStudent() {
        return new Student("id", "name3");
    }
}
