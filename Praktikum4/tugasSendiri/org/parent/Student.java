/*
  File : Student.java   02/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Student yang merupakan seorang mahasiswa/i dengan nama, usia, alamat, ID, dan daftar courses yang diambil
 */

package org.parent;

import java.util.List;
import java.util.ArrayList;

public class Student {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    // KONSTRUKTOR
    public Student(){
        this.coursesEnrolled = new ArrayList<>();
        this.name = "-";
        this.age = 0;
        this.address = "-";
        this.studentID = 0;
    }

    public Student(String name, int age, String address, int studentID) {
        // TODO: buatlah fungsi konstruktor
        this.coursesEnrolled = new ArrayList<>();
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
    }

    // GETTERS
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public List<Course> getCoursesEnrolled(){
        return this.coursesEnrolled;
    }

    // SETTERS

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void setCoursesEnrolled(List<Course> listOfCourses){
        this.coursesEnrolled = listOfCourses;
    }

    // METHODS
    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Student,
           menampilkan nama, umur, alamat, dan ID
        */
       System.out.printf("Nama : %s\nUmur : %d\nAlamat : %s\nStudent ID : %d\n", this.name, this.age, this.address, this.studentID);
    }

    public void enrollInCourse(Course course) {
        // TODO: buatlah fungsi untuk menambah sebuah course
        if (!this.coursesEnrolled.contains(course)){
            this.coursesEnrolled.add(course);
        }
        if (!course.getStudentsEnrolled().contains(this)){
            course.addStudent(this);
        }
    }

    public void viewEnrolledCourses() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh course 
           yang diambil oleh mahasiswa.
        
           Hint: gunakan loop dan method getDetails dari Course
        */
       int n = this.coursesEnrolled.size();
       for (int i = 0; i < n; i++){
            this.coursesEnrolled.get(i).getDetails();
            System.out.println();
       }
    }

    // Other methods...
    public void removeCourse(Course course){
        this.coursesEnrolled.remove(course);
        if (course.getStudentsEnrolled().contains(this)){
            course.removeStudent(this);
        }
    }
}
