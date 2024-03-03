import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the lecture: ");
        String name = scanner.nextLine();
        System.out.println("Enter the ID of the lecture: ");
        int id = scanner.nextInt();
        System.out.println("Enter the number of students: ");
        int noOfStudents = scanner.nextInt();
        Lecture lecture = new Lecture(name, id, noOfStudents);
        System.out.println("Enter the number of hours: ");
        int timeInHours = scanner.nextInt();
        lecture.addTime(timeInHours);
        System.out.println("Enter the name of the unit: ");
        String nameOfUnits = scanner.next();
        lecture.addUnit(nameOfUnits);
        lecture.showLecture();

    }
}
