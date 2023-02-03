package seminar_4.task_2.Repository;

import seminar_4.task_2.Model.Teacher;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TeacherRepository {
    public void save(Teacher teacher) {
        try (FileWriter fileWriter = new FileWriter("teacher.txt")) {
            fileWriter.write(teacher.toString()+"\n");
            fileWriter.flush();
        } catch (Exception exception) {
        }
    }

    public void remove(Teacher teacher) {
        try (FileWriter fileWriter = new FileWriter("teacher.txt")) {
            fileWriter.write("");
            fileWriter.flush();
        } catch (Exception exception) {
        }
    }

    public void edit(String name) {
        try (FileReader fileReader = new FileReader("teacher.txt")){
            Scanner scanner = new Scanner(fileReader);
            String st = scanner.nextLine();
            String[] s = st.split("'");
            s[1]=name;
            FileWriter fileWriter = new FileWriter("teacher.txt");
            fileWriter.write(String.join("'",s));
            fileWriter.flush();
        } catch (Exception exception) {}
    }

}
