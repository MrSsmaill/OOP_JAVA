package seminar_3.task2;

public class Main {
    public static void main(String[] args) {
        WrongArrayList list = new WrongArrayList();
        for (int i = 0; i <= 20; i++) {
            list.add(i);
            System.out.println(list);
        }
        System.out.println(list);
    }
}
