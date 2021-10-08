import java.util.ArrayList;

public class q2 {

    public static void main(String[] args) {

        ArrayList<Student> myStudentArray = new ArrayList<Student>();

        String[] name = {"kim", "Emily", "Bill", "Ed"};

        String[] gender = {"f", "f", "m", "m"};

        for(int i = 0; i < name.length; i++){

            Student s = new Student(i , name[i], gender[i]);

            myStudentArray.add(s);
        }

        for (int i = 0; i < myStudentArray.size(); i++) {
            System.out.println(myStudentArray.get(i).getID() + " " + myStudentArray.get(i).getName() + " " + myStudentArray.get(i).getGender());
        }

    }

}
