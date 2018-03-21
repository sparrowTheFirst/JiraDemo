package pl.b2bnetwork.domain;


public class TaskJira {

    private String expand;
    private String self;
    private String id;
    private Field fields;

    @Override
    public String toString() {
        return "TaskJira{" +
                "expand='" + expand + '\'' +
                ", self='" + self + '\'' +
                ", id='" + id + '\'' +
                ", fields=" + fields +
                '}';
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Field getFields() {
        return fields;
    }

    public void setFields(Field fields) {
        this.fields = fields;
    }
}
