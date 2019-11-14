package com.example.androidadapterjava;

import java.util.Objects;

public class Model {
    private String lName;
    private String fName;

    public Model() {}

    public Model(String lName, String fName) {
        this.lName = lName;
        this.fName = fName;
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

    @Override
    public String toString() {
        return "Model{" +
                "lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(lName, model.lName) &&
                Objects.equals(fName, model.fName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lName, fName);
    }
}
