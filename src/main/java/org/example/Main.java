package org.example;

import org.example.inheritance_to_interfaces.StudentServiceAdvanced;
import org.example.inheritance_to_interfaces.StudentServiceMoreAdvanced;
import org.example.principle_interfaces.IStudentService;
import org.example.principle_interfaces.StudentService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        IStudentService studentService = StudentService.getInstance(MultitonType.THIRD);

//        if(studentService instanceof StudentService) {
//            System.out.println(studentService.getStudent().getName());
//        }
//        if(studentService instanceof StudentServiceAdvanced) {
//            System.out.println(((StudentServiceAdvanced) studentService).getStudentAlex().getName());
//        }
//        if(studentService instanceof StudentServiceMoreAdvanced) {
//            System.out.println(((StudentServiceMoreAdvanced) studentService).getStudentIonut().getName());
//        }
        System.out.println(studentService.getStudent().getName());
    }
}