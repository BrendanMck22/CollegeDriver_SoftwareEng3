import org.joda.time.DateTime;

import java.time.LocalDate;

public class StudentDriver {

    public static void main(String[] args) {


        DateTime EEstartTime = new DateTime(2021, 01, 20, 9, 00);
        DateTime EEendTime = new DateTime(2021, 12, 04, 14, 00);
        DateTime CompSciStartTime = new DateTime(2021, 01, 19, 9, 00);
        DateTime CompSciEndTime = new DateTime(2021, 10, 20, 9, 00);
        DateTime EconomicsStartTime = new DateTime(2021, 03, 5, 9, 00);
        DateTime EconomicsEndTime = new DateTime(2021, 8, 17, 9, 00);

        Student student1 = new Student("Brendan", 21, LocalDate.of(1998, 2, 8), 12345);
        Student student2 = new Student("Sarah", 19, LocalDate.of(2000, 4, 23), 45678);
        Student student3 = new Student("Kevin", 23, LocalDate.of(1996, 12, 31), 90123);
        Student student4 = new Student("Alex", 26, LocalDate.of(1995, 7, 5), 23456);
        Student student5 = new Student("Niamh", 18, LocalDate.of(2001, 9, 23), 89875);
        Student student6 = new Student("Alisson", 23, LocalDate.of(1996, 12, 8), 36964);


        Module module1 = new Module("EE123", 7654);
        Module module2 = new Module("CS456", 4321);
        Module module3 = new Module("EC234", 1976);
        Module module4 = new Module("EE456", 6554);
        Module module5 = new Module("CS908", 4176);
        Module module6 = new Module("EC653", 3456);

        Course course1 = new Course("Engineering", EEstartTime, EEendTime);
        Course course2 = new Course("CompSci", CompSciStartTime, CompSciEndTime);
        Course course3 = new Course("Economics", EconomicsStartTime, EconomicsEndTime);

        //registering students on course
        student1.setCourseReg(course1);
        student2.setCourseReg(course2);
        student3.setCourseReg(course3);
        student4.setCourseReg(course1);
        student5.setCourseReg(course2);
        student6.setCourseReg(course3);
        //       adding modules to courses
        course1.addCourseToModule(module1);
        course1.addCourseToModule(module4);

        course2.addCourseToModule(module2);
        course2.addCourseToModule(module5);

        course3.addCourseToModule(module3);
        course3.addCourseToModule(module6);

        // adding students to Moudles
        student1.addModule(module1);
        student1.addModule(module4);
        student4.addModule(module1);
        student4.addModule(module4);

        student2.addModule(module2);
        student2.addModule(module5);
        student5.addModule(module2);
        student5.addModule(module5);

        student3.addModule(module3);
        student3.addModule(module6);
        student6.addModule(module3);
        student6.addModule(module6);


        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
        System.out.println(student6.toString());
        



    }
}
