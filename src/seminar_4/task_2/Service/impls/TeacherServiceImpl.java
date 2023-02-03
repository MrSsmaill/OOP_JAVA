package seminar_4.task_2.Service.impls;

import seminar_4.task_2.Model.Teacher;
import seminar_4.task_2.Service.TeacherService;
import seminar_4.task_2.Repository.TeacherRepository;

public class TeacherServiceImpl implements TeacherService {
    private TeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public void add(Teacher teacher) {
        if (teacher != null){
            teacherRepository.save(teacher);
        }

    }

    @Override
    public void remove(Teacher teacher) {
        if (teacher != null){
            teacherRepository.remove(teacher);
        }

    }

    @Override
    public void edit(String name) {
        if (name != null){
            teacherRepository.edit(name);
        }

    }
}
