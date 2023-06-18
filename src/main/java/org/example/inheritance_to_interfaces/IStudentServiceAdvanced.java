package org.example.inheritance_to_interfaces;

import org.example.Student;
import org.example.principle_interfaces.IStudentService;

public interface IStudentServiceAdvanced extends IStudentService {
    Student getStudentAlex();
}
