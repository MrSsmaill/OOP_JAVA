package dz_6;

public final class Worked {
    private int id;
    private String name;
    private int workExperience;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public Worked(int id, String name, int workExperience) {
        this.id = id;
        this.name = name;
        this.workExperience = workExperience;
    }
    public Worked(){
        this.id=0;
        this.name=null;
        this.workExperience=0;
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
