package com.example.androidadapterjava;

import java.util.Objects;

public class Model {
    private String lName;
    private String fName;
    private long id;

    public Model() {}

    public Model(String lName, String fName) {
        this.lName = lName;
        this.fName = fName;
    }

    public Model(long id, String lName, String fName) {
        this.lName = lName;
        this.fName = fName;
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return id == model.id &&
                Objects.equals(lName, model.lName) &&
                Objects.equals(fName, model.fName);
    }

    @Override
    public String toString() {
        return "Model{" +
                "lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(lName, fName, id);
    }

}
