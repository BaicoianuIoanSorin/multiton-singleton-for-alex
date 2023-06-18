package org.example.principle_interfaces;

import org.example.MultitonType;
import org.example.Student;
import org.example.inheritance_to_interfaces.StudentServiceAdvanced;
import org.example.inheritance_to_interfaces.StudentServiceMoreAdvanced;

import java.util.HashMap;
import java.util.Map;

public class StudentService implements IStudentService{

    /// MULTITON

    private static Map<MultitonType, IStudentService> INSTANCES = new HashMap<>();

    public StudentService() {

    }

    public static IStudentService getInstance(MultitonType multitonType) {
        IStudentService INSTANCE = INSTANCES.getOrDefault(multitonType, null);

        if (INSTANCE == null) {
            INSTANCES.put(multitonType, getIStudentServiceByMultitonType(multitonType));
        }
        return INSTANCES.get(multitonType);
    }


    private static IStudentService getIStudentServiceByMultitonType(MultitonType multitonType) {
        switch (multitonType) {
            case FIRST -> {
                return new StudentService();
            }
            case SECOND -> {
             return new StudentServiceAdvanced();
            }
            case THIRD ->  {
                return new StudentServiceMoreAdvanced();
            }
        }
        return null;
    }

    /// SINGLETON
//    public static readonly IStudentService INSTANCE;
//
//    public StudentService() {
//
//    }
//
//    public static IStudentService getINSTANCE() {
//        if(INSTANCE == null) {
//            return new StudentService();
//        }
//        else
//        {
//            return INSTANCE;
//        }
//    }
//
    @Override
    public Student getStudent() {
        return new Student("id","name");
    }
}
