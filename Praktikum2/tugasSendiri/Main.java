/*
  File : Main.java   02/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Main untuk mengimplementasikan kelas-kelas Student, Lecture, dan Course.
 */
// Note: Sudah saya test dan kebanyakan testcase/fitur berhasil. Mohon maaf jika ternyata anda menemukan beberapa kesalahan/kegagalan

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
    Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);
    
    Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
    Student dani = new Student("Dani", 20, "123 Oak St", 734621);
    Student edi = new Student("Edi", 20, "789 Pine St", 733451);
    
    Course cs101 = new Course("CS101", "Intro to Computer Science", bambang);
    Course cs102 = new Course("CS102", "Data Structures", bambang);
    Course cs103 = new Course("CS103", "Algorithms", agus);

    List<Course> lc1 = new ArrayList<>(), lc2 = new ArrayList<>(); 
    List<Student> ls = new ArrayList<>();

    lc1.add(cs101); lc1.add(cs102); lc2.add(cs103);
    ls.add(cahyo);

    cs101.addStudent(cahyo);
    cs101.addStudent(dani);
    cs101.addStudent(edi);

    cs102.addStudent(cahyo);
    cs102.addStudent(dani);

    cs103.addStudent(cahyo);
    
    // testcase setters
    agus.setName("Agu$!"); agus.setAge(36); agus.setAddress("Semarang"); agus.setEmployeeID(177014); agus.setCoursesTaught(lc1);

    cahyo.setName("Cahy0"); cahyo.setAge(21); cahyo.setAddress("444 Elm St"); cahyo.setStudentID(729111); cahyo.setCoursesEnrolled(lc2);

    cs101.setCourseCode("CS021"); cs101.setCourseName("Calculus I"); cs101.setLecture(agus); cs101.setStudentsEnrolled(ls);

    // testcase getters
    System.out.printf("%s, %d, %s, %d\n", agus.getName(), agus.getAge(), agus.getAddress(), agus.getEmployeeID());
    for (int i = 0; i < agus.getCoursesTaught().size(); i++){
        System.out.printf("%s, ", agus.getCoursesTaught().get(i).getCourseName());
    }

    System.out.printf("\n\n%s, %d, %s, %d\n", cahyo.getName(), cahyo.getAge(), cahyo.getAddress(), cahyo.getStudentID());
    for (int i = 0; i < cahyo.getCoursesEnrolled().size(); i++){
        System.out.printf("%s, ", cahyo.getCoursesEnrolled().get(i).getCourseName());
    }

    System.out.printf("\n\n%s, %s, %s\n", cs101.getCourseCode(), cs101.getCourseName(), cs101.getLecture().getName());
    for (int i = 0; i < cs101.getStudentsEnrolled().size(); i++){
        System.out.printf("%s", cs101.getStudentsEnrolled().get(i).getName());
    }

    // Pemulihan data penting ke bentuk awal (demi kemudahan Command Line interaktif)
    agus.setName("Agus");
    lc1.clear(); lc1.add(cs103);
    
    cahyo.setName("Cahyo");
    lc2.add(cs101); lc2.add(cs102);

    cs101.setCourseCode("CS101"); cs101.setCourseName("Introduction to Computer Science"); cs101.setLecture(bambang);
    ls.add(dani); ls.add(edi);

    // Command Line interaktif
    Scanner scanner = new Scanner(System.in);
    int pickMain = -1, pickStudent, pickLecture, pickCourse, pickMethod;
    int pickEnroll, pickTeach, pickAddStudent, pickRemoveStudent;
    Student[] listOfStudents = {cahyo, dani, edi};
    Lecture[] listofLectures = {agus, bambang};
    Course[] listOfCourses = {cs101, cs102, cs103};
    
    while (pickMain != 0){ // Penggunaan while loop agar interface kembali ke "main menu" setelah seurutan proses selesai. Berhenti/keluar jika user meng-input 0.
        System.out.printf("\n===========================================");
        System.out.printf("\n<1> Pilih student\n<2> Pilih lecture\n<3> Pilih course\n<0> Exit\nInput (masukan berupa integer): ");
        pickMain = scanner.nextInt();
    
        if (pickMain == 1){ // Opsi "Pilih student".
            System.out.printf("===========================================");
            System.out.printf("\n<1> Cahyo\n<2> Dani\n<3> Edi\nInput : ");
            pickStudent = scanner.nextInt();

            if (pickStudent == 1 || pickStudent == 2 || pickStudent == 3){ // Cek validasi input
                System.out.printf("===========================================");
                System.out.printf("\n<1> Get details\n<2> View enrolled courses\n<3> Enroll into course\nInput : ");
                pickMethod = scanner.nextInt();

                if (pickMethod == 1){ // Opsi "Get details"
                    System.out.printf("\n");
                    listOfStudents[pickStudent-1].getDetails();
                }
                else if (pickMethod == 2){ // Opsi "View enrolled courses"
                    System.out.printf("\n");
                    listOfStudents[pickStudent-1].viewEnrolledCourses();
                }
                else if (pickMethod == 3){ // Opsi "Enroll into course"
                    System.out.printf("===========================================");
                    System.out.printf("\n<1> cs101\n<2> cs102\n<3> cs103\nInput : ");
                    pickEnroll = scanner.nextInt();

                    if (pickEnroll == 1 || pickEnroll == 2 || pickEnroll == 3){ // Cek validasi input
                        listOfStudents[pickStudent-1].enrollInCourse(listOfCourses[pickEnroll-1]);
                    }
                    else{
                        System.out.printf("Invalid input.\n");
                    }
                }
                else{
                    System.out.printf("Invalid input.\n");
                }
            }
            else{
                System.out.printf("Invalid input.\n");
            }
        }
        else if (pickMain == 2){ // Opsi "Pilih lecture"
            System.out.printf("===========================================");
            System.out.printf("\n<1> Agus\n<2> Bambang\nInput : ");
            pickLecture = scanner.nextInt();

            if (pickLecture == 1 || pickLecture == 2){ // Cek validasi input
                System.out.printf("===========================================");
                System.out.printf("\n<1> Get details\n<2> View taught courses\n<3> Teach course\nInput : ");
                pickMethod = scanner.nextInt();

                if (pickMethod == 1){ // Opsi "Get details"
                    System.out.printf("\n");
                    listofLectures[pickLecture-1].getDetails();
                }
                else if (pickMethod == 2){ // Opsi "View taught courses"
                    System.out.printf("\n");
                    listofLectures[pickLecture-1].viewTaughtCourses();
                }
                else if (pickMethod == 3){ // Opsi "Teach course"
                    System.out.printf("===========================================");
                    System.out.printf("\n<1> cs101\n<2> cs102\n<3> cs103\nInput : ");
                    pickTeach = scanner.nextInt();

                    if (pickTeach == 1 || pickTeach == 2 || pickTeach == 3){ // Cek validasi input
                        listofLectures[pickLecture-1].teachCourse(listOfCourses[pickTeach-1]);
                    }
                    else{
                        System.out.printf("Invalid input.\n");
                    }
                }
                else{
                    System.out.printf("Invalid input.\n");
                }
            }
            else{
                System.out.printf("Invalid input.\n");
            }
        }
        else if (pickMain == 3){ // Opsi "Pilih coourse"
            System.out.printf("===========================================");
            System.out.printf("\n<1> cs101\n<2> cs102\n<3> cs103\nInput : ");
            pickCourse = scanner.nextInt();

            if (pickCourse == 1 || pickCourse == 2 || pickCourse == 3){ // Cek validasi input
                System.out.printf("===========================================");
                System.out.printf("\n<1> Get details\n<2> View enrolled students\n<3> Add student\n<4> Remove student\nInput : ");
                pickMethod = scanner.nextInt();

                if (pickMethod == 1){ // Opsi "Get details"
                    System.out.printf("\n");
                    listOfCourses[pickCourse-1].getDetails();
                }
                else if (pickMethod == 2){ // Opsi View enrolled students
                    System.out.printf("\n");
                    listOfCourses[pickCourse-1].viewEnrolledStudents();
                }
                else if (pickMethod == 3){ // Opsi "Add student"
                    System.out.printf("===========================================");
                    System.out.printf("\n<1> Cahyo\n<2> Dani\n<3> Edi\nInput : ");
                    pickAddStudent = scanner.nextInt();

                    if (pickAddStudent == 1 || pickAddStudent == 2 || pickAddStudent == 3){ // Cek validasi input
                        listOfCourses[pickCourse-1].addStudent(listOfStudents[pickAddStudent-1]);
                    }
                    else{
                        System.out.printf("Invalid input.\n");
                    }
                }
                else if (pickMethod == 4){ // Opsi "Remove student"
                    System.out.printf("===========================================");
                    System.out.printf("\n<1> Cahyo\n<2> Dani\n<3> Edi\nInput : ");
                    pickRemoveStudent = scanner.nextInt();

                    if (pickRemoveStudent == 1 || pickRemoveStudent == 2 || pickRemoveStudent == 3){ // Cek validasi input
                        listOfCourses[pickCourse-1].removeStudent(listOfStudents[pickRemoveStudent-1]);
                    }
                    else{
                        System.out.printf("Invalid input.\n");
                    }
                }
                else{
                    System.out.printf("Invalid input.\n");
                }
            }
            else{
                System.out.printf("Invalid input.\n");
            }
        }
        else if (pickMain != 0){
            System.out.printf("Invalid input.\n");
        }
    }
  }
}
