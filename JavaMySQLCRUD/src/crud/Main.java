package crud;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== CRUD MENU =====");
            System.out.println("1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add User
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter country: ");
                    String country = scanner.nextLine();
                    UserDAO.addUser(name, email, country);
                    break;
                
                case 2:
                    // View Users
                    System.out.println("\nAll Users:");
                    for (User user : UserDAO.getAllUsers()) {
                        System.out.println(user);
                    }
                    break;
                
                case 3:
                    // Update User
                    System.out.print("Enter User ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Enter new country: ");
                    String newCountry = scanner.nextLine();
                    UserDAO.updateUser(updateId, newName, newEmail, newCountry);
                    break;

                case 4:
                    // Delete User
                    System.out.print("Enter User ID to delete: ");
                    int deleteId = scanner.nextInt();
                    UserDAO.deleteUser(deleteId);
                    break;
                
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



//package crud;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//        
//        System.out.print("Enter email: ");
//        String email = scanner.nextLine();
//        
//        System.out.print("Enter country: ");
//        String country = scanner.nextLine();
//        
//        UserDAO.addUser(name, email, country);
//        
//        System.out.println("\nAll Users:");
//        UserDAO.getAllUsers().forEach(System.out::println);
//        
//        scanner.close();
//    }
//}
