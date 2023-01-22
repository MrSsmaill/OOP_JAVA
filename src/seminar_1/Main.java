package seminar_1;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Adam","M",true);
        Human h2 = new Human("Eva","J",true);
        Human h3 = new Human("Petr","M",true,h2,h1,null);
        h1.setNext(h3);
        h2.setNext(h3);

        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h3);
        System.out.println(h1.getNext());
    }
}
