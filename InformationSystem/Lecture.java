import java.util.Scanner;
import java.util.ArrayList;
public class Lecture implements Printable {

    Scanner input = new Scanner (System.in);

    protected int lectureID;
    protected String name;
    protected Lecturer lecturer;
    protected ArrayList<Student> studentsList;
    protected Grade grade;

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }


    public Lecture(int ID, String name, Lecturer lecturer, ArrayList<Grade> gradeList ) {
        setLectureID(ID);
        setName(name);
        setLecturer(lecturer);

    }
    public Lecture(int ID, Lecturer lecturer) {
        setLectureID(ID);
        setLecturer(lecturer);
        ArrayList<Grade> gradeList = new ArrayList<Grade>();



    }

    public Lecture(int ID, String name, Lecturer lecturer) {
        setLectureID(ID);
        setName(name);
        this.lecturer = lecturer;

    }

    public Lecture(int ID, String name) {

    }

    public void printInfo(){
        System.out.println("Lecture ID: "+getLectureID());
        System.out.println("Lecture name: "+getName());
        System.out.println("Lecturer of this lecture: "+getLecturer().getFullName());


    }

}
