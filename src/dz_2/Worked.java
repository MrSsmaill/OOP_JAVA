package dz_2;

public final class Worked {
    private int id;
    private String name;
    private int workExperience;

    public Worked(int id, String name, int workExperience) {
        this.id = id;
        this.name = name;
        this.workExperience = workExperience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Worked{" +
                "ID=" + id +
                ", Имя='" + name + '\'' +
                ", Стаж работы=" + workExperience +
                '}';
    }
}
