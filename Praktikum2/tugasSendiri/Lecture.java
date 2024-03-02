/*
  File : Lecture.java   02/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Lecture yang merupakan seorang dosen dengan nama, usia, alamat, ID, dan daftar courses yang diampu
 */

import java.util.List;
import java.util.ArrayList;

public class Lecture {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    // KONSTRUKTOR
    public Lecture(String name, int age, String address, int employeeID) {
        // TODO: buatlah fungsi konstruktor
        this.coursesTaught = new ArrayList<>();
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
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

    public int getEmployeeID(){
        return this.employeeID;
    }

    public List<Course> getCoursesTaught(){
        return this.coursesTaught;
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

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public void setCoursesTaught(List<Course> listOfCourses){
        this.coursesTaught = listOfCourses;
    }

    // METHODS
    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Lecture,
           menampilkan nama, umur, alamat, dan ID
        */
       System.out.printf("Nama : %s\nUmur : %d\nAlamat : %s\nLecture ID : %d\n\n", this.name, this.age, this.address, this.employeeID);
    }    

    public void teachCourse(Course course) {
        // TODO: buatlah fungsi untuk menambah sebuah course 
        if (!this.coursesTaught.contains(course)){
            this.coursesTaught.add(course);
        }
        course.setLecture(this);
    }

    public void viewTaughtCourses() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh course
           yang diampu oleh dosen.

           Hint: gunakan loop dan method getDetails dari Course
        */
       int n = this.coursesTaught.size();
       for (int i = 0; i < n; i++){
            this.coursesTaught.get(i).getDetails();
       }
    }

    // Other methods...
}
