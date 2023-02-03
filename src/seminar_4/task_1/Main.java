package seminar_4.task_1;

import seminar_4.task_1.Student;
import seminar_4.task_1.StudentComparator;

public class Main {
    public static void main(String[] args) {
        Student Misha = new Student();
        Student Masha = new Student();
        Misha.setYear(20);
        Masha.setYear(25);
        StudentComparator comp = new StudentComparator();
        System.out.println(comp.compare(Misha,Masha));
    }
}
