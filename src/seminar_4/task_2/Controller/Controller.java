package seminar_4.task_2.Controller;

import seminar_4.task_2.Model.Student;
import seminar_4.task_2.Model.Teacher;
import seminar_4.task_2.Service.StudentService;
import seminar_4.task_2.Service.TeacherService;
import seminar_4.task_2.Service.impls.StudentServiceImpl;
import seminar_4.task_2.Service.impls.TeacherServiceImpl;
import seminar_4.task_2.View.StudentView;
import seminar_4.task_2.View.TeacherView;
import seminar_4.task_2.View.View;

import java.util.ArrayList;

public class Controller {
    public static void program() {
        View.user();
        Integer point = View.menu();
        if (point == 1) {
            StudentView.menuPrint();
            StudentService studentService = new StudentServiceImpl();
            switch (View.menu()) {
                case (1):
                    studentService.add(new Student(View.name(), StudentView.grade(), StudentView.year()));
                    break;
                case (2):
                    studentService.edit(new Student(View.name(), StudentView.grade(), StudentView.year()));
                    break;
                case (3):
                    studentService.remove(new Student("null", 0, 0));
                    break;
                case (4):
                    View.exit();
                    System.exit(0);
                    break;
                default:
                    View.notMenu();
            }
        } else if (point == 2) {
            TeacherView.menuPrint();
            TeacherService teacherService = new TeacherServiceImpl();
            switch (View.menu()) {
                case (1):
                    teacherService.add(new Teacher(View.name(), new ArrayList<Student>()));
                    break;
                case (2):
                    teacherService.edit(View.name());
                    break;
                case (3):
                    teacherService.remove(new Teacher(null, null));
                    break;
                case (4):
                    View.exit();
                    System.exit(0);
                default:
                    View.notMenu();
            }
        } else if (point == 3) {
            View.exit();
            System.exit(0);
        }

    }
}

