package seminar_4.task_2.Controller;

import seminar_4.task_2.Model.Student;
import seminar_4.task_2.Service.StudentService;
import seminar_4.task_2.Service.impls.StudentServiceImpl;
//Контроллер
public class StudentController {
    private StudentService studentService = new StudentServiceImpl();
    public void getStudentInfo(String name, float grade, int year){
        studentService.add(new Student(name,grade,year));
    }
}
