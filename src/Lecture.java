import org.w3c.dom.html.HTMLImageElement;

public class Lecture {
    String Name;
    int Id;
    int noOfStudents;
    String nameOfUnits;
    int timeInHours;

    public Lecture(String Name, int Id, int noOfStudents) {
        this.Name = Name;
        this.Id = Id;
        this.noOfStudents = noOfStudents;
        this.timeInHours= 0;
    }
    public void addTime(int timeInHours) {
        this.timeInHours = timeInHours;
    }
    public void addUnit(String nameOfUnits) {
        this.nameOfUnits = nameOfUnits;
    }
    public void showLecture() {
        System.out.println("Lecture Name: " + Name);
        System.out.println("Lecture ID: " + Id);
        System.out.println("Number of Students: " + noOfStudents);
        System.out.println("Units: " + nameOfUnits);
        System.out.println("Time: " + timeInHours);
    }
}
