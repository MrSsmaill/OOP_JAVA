package dz_6;

public class WorkerBuilder {
    private static WorkerBuilder instance;
    Worked obj;

    private WorkerBuilder() {

    }

    public static WorkerBuilder getInstance() {
        if (instance == null)
            instance = new WorkerBuilder();
        instance.obj = new Worked();

        return instance;
    }

    public WorkerBuilder setName(String name) {
        obj.setName(name);
        return this;
    }
    public WorkerBuilder setId(int id){
        obj.setId(id);
        return this;
    }
    public WorkerBuilder setWorkExperience(int workExperience){
        obj.setWorkExperience(workExperience);
        return this;
    }


    public Worked build() {
        return obj;
    }
}
