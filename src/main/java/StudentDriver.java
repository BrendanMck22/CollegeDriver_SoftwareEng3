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

        Student student1 = new Student("Brendan", 21, LocalDate.of(1998, 02, 8), 12345);
        Student student2 = new Student("Sarah", 19, LocalDate.of(2000, 04, 23), 12345);
        Student student3 = new Student("Kevin", 23, LocalDate.of(1996, 12, 31), 12345);

        Module module1 = new Module("EE123", 7654);
        Module module2 = new Module("CS456", 4321);
        Module module3 = new Module("EC234", 1976);

        Course course1 = new Course("IntroToEngineering", EEstartTime, EEendTime);
        Course course2 = new Course("IntroToCompSci", CompSciStartTime, CompSciEndTime);
        Course course3 = new Course("IntroToEconomics", EconomicsStartTime, EconomicsEndTime);

        //registering students on course
        student1.setCourseReg(course1);
        student2.setCourseReg(course2);
        student3.setCourseReg(course3);
        //       adding modules to courses
        course1.addCourseToModule(module1);
        course1.addCourseToModule(module3);

        course2.addCourseToModule(module1);
        course2.addCourseToModule(module2);
        course2.addCourseToModule(module3);

        course3.addCourseToModule(module3);

        // adding students to Moudles
        student1.addModule(module1);
        student1.addModule(module2);

        student2.addModule(module1);
        student2.addModule(module3);

        student3.addModule(module1);
        student3.addModule(module2);
        student3.addModule(module3);

        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        



    }
}
