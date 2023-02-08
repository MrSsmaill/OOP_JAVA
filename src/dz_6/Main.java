package dz_6;

public class Main {
    public static void main(String[] args) {
        Worked w1 = new Worked(11,"Петр",1);
        System.out.println(w1);
        Worked w2 = WorkerBuilder.getInstance().setId(15).setName("Вова").setWorkExperience(5).build();
        System.out.println(w2);
    }
}
