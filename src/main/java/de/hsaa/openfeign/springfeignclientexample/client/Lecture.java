package de.hsaa.openfeign.springfeignclientexample.client;


import java.util.List;

public class Lecture {

    private String id;
    private String lectureName;
    private List<String> students;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id='" + id + '\'' +
                ", lectureName='" + lectureName + '\'' +
                ", students=" + students +
                '}';
    }
}
