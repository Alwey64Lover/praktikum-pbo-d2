/*
  File : LabAssistant.java   16/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas LabAssistant (inheritance dari class Student) yang merupakan asisten praktikum dengan atribut-atribut Student ditambah daftar mata kuliah di mana dia menjadi asprak.
 */

package org.children;

import java.util.List;
import java.util.ArrayList;
import org.parent.Student;
import org.parent.Course;

public class LabAssistant extends    Student{
    // ATRIBUT
    private List<Course> coursesAssisted;

    // KONSTRUKTOR
    public LabAssistant(){
        super();
        coursesAssisted = new ArrayList<>();

    }

    public LabAssistant(String name, int age, String address, int studentID){
        super(name, age, address, studentID);
        coursesAssisted = new ArrayList<>();
    }

    // GETTERS
    public List<Course> getCoursesAssisted(){
        return coursesAssisted;
    }

    // SETTERS
    public void setCoursesAssisted(List<Course> courses){
        coursesAssisted = courses;
    }

    // METHOD LAINNYA
    public void assistCourse(Course course){
        coursesAssisted.add(course);
    }

    public void getDetails(){
        int n = coursesAssisted.size();
        super.getDetails();
        System.out.println("Courses yang di-assist:");
        for (int i = 0; i < n; i++){
            System.out.println("(" + coursesAssisted.get(i).getCourseCode() + ") " + coursesAssisted.get(i).getCourseName());
        }
    }
}