import java.util.Scanner;

public class OnlineExaminationSystem {
    static String username;
    static String password;
    static int score = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Examination System");
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful. You can update your profile and take the exam.");
            showMenu(scanner);
        } else {
            System.out.println("Login failed. Please try again.");
        }
    }
    public static boolean login(String username, String password) {
        return "candidate123".equals(username) && "candidatepassword123".equals(password);
    }
    public static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Update your Profile and Password");
            System.out.println("2. Take the Exam");
            System.out.println("3. Logout your profile");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    updateProfile(scanner);
                    break;
                case 2:
                    takeExam(scanner);
                    break;
                case 3:
                    logout();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    public static void updateProfile(Scanner scanner) {
        System.out.print("Enter your new username: ");
        username = scanner.next();
        System.out.print("Enter your new password: ");
        password = scanner.next();
        System.out.println("Profile updated successfully.");
    }
    public static void takeExam(Scanner scanner) {
        System.out.println("Starting the exam...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Question " + i + ": What is 2 + 2?");
            System.out.print("Your answer is: ");
            int answer = scanner.nextInt();
            if (answer == 4) {
                score += 20;
            }
        }
        System.out.println("Exam completed. Your score: " + score + "/100");
    }
    public static void logout() {
        System.out.println("Logging out. Goodbye, " + username + "!");
        System.exit(0);
    }
};

    
