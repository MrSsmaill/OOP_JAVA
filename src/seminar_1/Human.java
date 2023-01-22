package seminar_1;


public class Human {
    private String name;
    private String gender;
    private boolean liveStatus;
    private Human mother;
    private Human father;
    private Human next;

    public Human(String name, String gender, boolean liveStatus) {
        this.name = name;
        this.gender = gender;
        this.liveStatus = liveStatus;
    }

    public Human(String name, String gender, boolean liveStatus, Human next) {
        this.name = name;
        this.gender = gender;
        this.liveStatus = liveStatus;
        this.next = next;
    }

    public Human(String name, String gender, boolean liveStatus, Human mother, Human father, Human next) {
        this.name = name;
        this.gender = gender;
        this.liveStatus = liveStatus;
        this.mother = mother;
        this.father = father;
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public boolean isLiveStatus() {
        return liveStatus;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human getNext() {
        return next;
    }

    public void setNext(Human human1) {
        this.next=human1;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", liveStatus=" + liveStatus +
                ", mother=" + mother +
                ", father=" + father +
                ", next=" + next +
                '}';
    }
}
