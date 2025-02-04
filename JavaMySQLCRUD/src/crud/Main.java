package crud;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        
        UserDAO.addUser(name, email, country);
        
        System.out.println("\nAll Users:");
        UserDAO.getAllUsers().forEach(System.out::println);
        
        scanner.close();
    }
}
