import java.util.ArrayList;
import java.util.List;

class Class {
    //Name of class
    private String name;

    //List of students
    private List<String> students;

    //Constructor
    public Class(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
}