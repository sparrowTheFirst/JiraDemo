package pl.b2bnetwork.domain;

public class FixVersion {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FixVersion{" +
                "name='" + name + '\'' +
                '}';
    }
}
