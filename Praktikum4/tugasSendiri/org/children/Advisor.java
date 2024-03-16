/*
  File : Advisor.java   16/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Advisor (inheritance dari class Lecture) yang merupakan dosen wali dengan atribut-atribut Lecture ditambah daftar mahasiswa yang diwalikannya.
 */

package org.children;

import java.util.List;
import java.util.ArrayList;
import org.parent.Lecture;
import org.parent.Student;

public class Advisor extends Lecture{ // Dosen wali
    // ATRIBUT
    private List<Student> studentsAdvised;

    // KONSTRUKTOR
    public Advisor(){
        super();
        studentsAdvised = new ArrayList<>();
    }

    public Advisor(String name, int age, String address, int employeeID){
        super(name, age, address, employeeID);
        studentsAdvised = new ArrayList<>();
    }

    // GETTERS
    public List<Student> getStudentsAdvised(){
        return studentsAdvised;
    }

    // SETTERS
    public void setStudentsAdvised(List<Student> students){
        studentsAdvised = students;
    }

    // METHOD LAINNYA
    public void adviseStudent(Student student){
        studentsAdvised.add(student);
    }

    public void getDetails(){
        int n = studentsAdvised.size();
        super.getDetails();
        System.out.println("Students yang di-advise:");
        for (int i = 0; i < n; i++){
            System.out.println("(" + studentsAdvised.get(i).getStudentID() + ") " + studentsAdvised.get(i).getName());
        }
    }
}