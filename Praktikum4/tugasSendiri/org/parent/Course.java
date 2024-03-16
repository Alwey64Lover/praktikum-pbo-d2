/*
  File : Course.java   02/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Course yang merupakan sebuah course dengan kode, nama, dosen pengampu, dan daftar mahasiswa/i yang mengambil
 */

package org.parent;

import java.util.List;
import java.util.ArrayList;

public class Course {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    // KONSTRUKTOR
    public Course(String courseCode, String courseName, Lecture lecture) {
        // TODO: buatlah fungsi konstruktor
        this.studentsEnrolled = new ArrayList<>();
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        lecture.teachCourse(this);
    }

    //GETTERS
    public String getCourseCode(){
        return this.courseCode;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public Lecture getLecture(){
        return this.lecture;
    }

    public List<Student> getStudentsEnrolled(){
        return this.studentsEnrolled;
    }

    // SETTERS
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setLecture(Lecture lecture){
        this.lecture = lecture;
    }

    public void setStudentsEnrolled(List<Student> listOfStudents){
        this.studentsEnrolled = listOfStudents;
    }

    // METHODS
    public void addStudent(Student student) {
        // TODO: buatlah fungsi untuk menambah seorang mahasiswa
        if (!this.studentsEnrolled.contains(student)){
            this.studentsEnrolled.add(student);
        }
        if (!student.getCoursesEnrolled().contains(this)){
            student.enrollInCourse(this);
        }
    }

    public void removeStudent(Student student) {
        // TODO: buatlah fungsi untuk menghapus seorang mahasiswa
        this.studentsEnrolled.remove(student);
        if (student.getCoursesEnrolled().contains(this)){
            student.removeCourse(this);
        }
    }

    public void viewEnrolledStudents() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh 
           student yang mengambil course. 

           Hint: gunakan loop dan method getDetails dari Student
        */
       int n = this.studentsEnrolled.size();
       for (int i = 0; i < n; i++){
            this.studentsEnrolled.get(i).getDetails();
            System.out.println();
       }
    }

    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Course, 
           menampilkan kode course, nama course, dan dosen pengampu
        */ 
       System.out.printf("Kode course : %s\nNama course : %s\nDosen pengampu (lihat di bawah)\n", this.courseCode, this.courseName);
       this.lecture.getDetails();
    }      
    // Other methods...
}
