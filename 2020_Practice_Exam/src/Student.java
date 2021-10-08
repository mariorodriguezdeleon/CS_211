import java.util.ArrayList;

public class Student {

    private int id;

    private String name;

    private String gender;


    Student(int id, String name, String gender) {

        this.id = id;
        this.name = name;
        this.gender = gender;

    }

    public int getID () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public String getGender () {
        return this.gender;
    }
}
