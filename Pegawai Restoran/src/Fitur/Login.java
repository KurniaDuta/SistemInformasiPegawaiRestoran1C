import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.println("*****Selamat Datang di Restoran 1C*****\n");
        
        System.out.println("Enter Username: " );
        username = input.nextLine();

        System.out.println("Enter password: " );
        password = input.nextLine();

        System.out.println("\nSelamat Datang " + username);

    }
}