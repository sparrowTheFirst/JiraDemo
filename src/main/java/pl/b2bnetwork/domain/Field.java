package pl.b2bnetwork.domain;

import java.util.List;

public class Field {

    private String customfield_18232;
    private List<FixVersion> fixVersions;

    public List<FixVersion> getFixVersions() {
        return fixVersions;
    }

    public void setFixVersions(List<FixVersion> fixVersions) {
        this.fixVersions = fixVersions;
    }

    public String getCustomfield_18232() {
        return customfield_18232;
    }

    public void setCustomfield_18232(String customfield_18232) {
        this.customfield_18232 = customfield_18232;
    }

    @Override
    public String toString() {
        return "Field{" +
                "customfield_18232='" + customfield_18232 + '\'' +
                ", fixVersions=" + fixVersions +
                '}';
    }
}
