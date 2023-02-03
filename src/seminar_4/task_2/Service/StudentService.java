package seminar_4.task_2.Service;

import seminar_4.task_2.Model.Student;
import seminar_4.task_2.Model.User;

import java.util.List;

public interface StudentService<T extends User> {
    void add(Student student);

    void remove(Student student);

    void edit(Student student);

    List getAllStudents();

}
