package seminar_4.task_2.Service;

import seminar_4.task_2.Model.Teacher;

public interface TeacherService {
    void add(Teacher teacher);

    void remove(Teacher teacher);

    void edit(String name);

}
