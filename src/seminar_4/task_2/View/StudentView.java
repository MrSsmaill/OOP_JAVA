package seminar_4.task_2.View;

import java.util.Scanner;

//Меню
public class StudentView {
    public static void menuPrint() {
        System.out.println("1 Создать запись \n" +
                "2 Обновить запись\n" +
                "3  Вывести всех студентов\n" +
                "4 Удалить\n" +
                "5 Выход");
    }

    public static Float grade() {
        System.out.println("Введите среднюю оценку ");
        return new Scanner(System.in).nextFloat();
    }
    public static Integer year(){
        System.out.println("Введите срок обучения ");
        return new  Scanner(System.in).nextInt();
    }
}

