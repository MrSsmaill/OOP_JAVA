package seminar_4.task_2.Repository;

import seminar_4.task_2.Model.Student;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository {
    public void save(Student student) {
        try (FileReader fileReader = new FileReader("students.txt")) {
            Scanner scanner = new Scanner(fileReader);
            System.out.println(scanner.hasNextLine());
            FileWriter fileWriter = new FileWriter("students.txt");
            String st = new String();
            while (scanner.hasNextLine()) {
                st = st + scanner.nextLine() + "\n";
                System.out.println(st);
            }
            fileWriter.write(st + student.toString());
            fileWriter.flush();
        } catch (
                Exception exception) {
            System.out.println(exception);
        }

    }

    public void remove(Student student) {
        try (FileWriter fileWriter = new FileWriter("students.txt")) {
            fileWriter.write("");
            fileWriter.flush();
        } catch (Exception exception) {
        }
    }

    public void edit(Student student) {
        try (FileReader fileReader = new FileReader("students.txt")) {
            Scanner scanner = new Scanner(fileReader);
            String st = scanner.nextLine();
            String[] s = st.split("'");
            s[1] = student.getName();
            FileWriter fileWriter = new FileWriter("students.txt");
            fileWriter.write(String.join("'", s));
            fileWriter.flush();
        } catch (Exception exception) {
        }
    }

    public List getAllStudents() {
        try (FileReader fileReader = new FileReader("students.txt")) {
            Scanner scanner = new Scanner(fileReader);
            List<String> students = new ArrayList();
            while (scanner.hasNextLine()) {
                String st = scanner.nextLine();
                students.add(st);
            }
            return students;
        } catch (Exception exception) {
            return new ArrayList<>();
        }
    }
}
