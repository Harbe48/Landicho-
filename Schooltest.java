import java.util.Scanner;

public class Schooltest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Student Details:");
            System.out.print("Name: ");
            String studentName = scanner.nextLine();
            System.out.print("ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Grade: ");
            String grade = scanner.nextLine();

            Students student = new Students(studentName, studentId, grade);

            System.out.println("\nEnter Teacher Details:");
            System.out.print("Name: ");
            String teacherName = scanner.nextLine();
            System.out.print("ID: ");
            int teacherId = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Subject: ");
            String subject = scanner.nextLine();

            Teachers teacher = new Teachers(teacherName, teacherId, subject);

            System.out.println("\nStudent Information:");
            student.displayInfo();

            System.out.println("\nTeacher Information:");
            teacher.displayInfo();
        }
    }
    static class Students {
        private final String name;
        private final int id;
        private final String grade;

        public Students(String name, int id, String grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Grade: " + grade);
        }
    }

    static class Teachers {
        private final String name;
        private final int id;
        private final String subject;

        public Teachers(String name, int id, String subject) {
            this.name = name;
            this.id = id;
            this.subject = subject;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Subject: " + subject);
        }
    }
}