package seminar_4.task_2.View;

import java.util.Scanner;

public class View {
    public static void user() {
        System.out.println("1 Студенты\n" +
                "2 Преподователи\n" +
                "3 Выход");
    }

    public static Integer menu() {
        System.out.println("Выберете пункт меню ");
        return new Scanner(System.in).nextInt();
    }

    public static void notMenu() {
        System.out.println("Вы ввели не верный пункт меню ");
    }

    public static void exit() {
        System.out.println();
        System.out.println("Программа завершена");
    }
    public static String name(){
        System.out.println("Введите имя ");
        return String.valueOf(new Scanner(System.in));
    }
}
