package CSULA.app.model;

import java.util.ArrayList;

public class ProfessorModel {
    private int id;
    private String name;
    private double rating;
    private ArrayList<Integer> classesId = new ArrayList<Integer>();  // list of classes taught by professor

    // Constructors
    public ProfessorModel() {
    }

    public ProfessorModel(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public ProfessorModel(int id, String name, double rating, ArrayList<Integer> classesId) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.classesId = classesId;
    }

    // To string to print contents of the class objects
    @Override
    public String toString() {
        return "ProfessorModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", classesId=" + classesId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Integer> getClassesId() {
        return classesId;
    }

    public void setClassesId(ArrayList<Integer> classesId) {
        this.classesId = classesId;
    }
}
