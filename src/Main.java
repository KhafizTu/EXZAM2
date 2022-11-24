import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student[] student = {
                new Student("Khafiz Turusbek uulu",18,"khafiz@gamil.com",Gender.MALE),
                new Student("Ulukbek Bubetaev",20,"ulukbek@gmail.com",Gender.MALE),
                new Student("Medina Jakypbekova",16,"medina@gmail.com",Gender.FAMELI),
                new Student("Aiperi Kachaganova",21,"aiperi@gmail.com",Gender.FAMELI),
        };
        for (Student student1 : student) {
            student1.studentS(student);
            System.out.println("===============================================");
            student1.studentMale(student);
            System.out.println("===============================================");
            student1.studentFameli(student);

            break;
        }
        Scanner scanner = new Scanner(System.in);
        for (Student student1 : student) {
            student1.studentNames(scanner.nextLine(), student);
            break;

        }
        for (Student student1 : student) {
            student1.studentAge();
            break;
        }

        for (Student student1 : student) {
            student1.studentSurName(scanner.nextLine(),student);
            break;
        }
    }
}