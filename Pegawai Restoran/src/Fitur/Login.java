import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================== Sistem Pegawai Restoran 1C =================================");

        String username = "BigBos";
        String password = "restoranEnak";

        System.out.print("\t\t\t        Enter username: ");
        String enteredUsername = input.nextLine();

        System.out.print("\t\t\t        Enter password: ");
        String enteredPassword = input.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("\n\t\t\t      Welcome to Sistem Pegawai, " + username + "!");
        } else {
            System.out.println("\n\t\t\t  Maaf, username atau password anda salah!");
        }

    }
}