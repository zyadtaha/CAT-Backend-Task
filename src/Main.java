import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static HashMap <String, String> users = new HashMap<String, String >();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("For Register enter 1");
        System.out.println("For Login enter 2");
        int option = scanner.nextInt();
        scanner.nextLine();
        if(option == 1) {
            register();
        } else {
            login();
        }
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern p = Pattern.compile(emailRegex);
        return email != null && p.matcher(email).matches();
    }

    public static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(passwordRegex);
        return password != null && p.matcher(password).matches();
    }

    public static void register(){
        while(true){
            System.out.println("Enter your username:");
            String username = scanner.nextLine();

            System.out.println("Enter your email:");
            String email = scanner.nextLine();
            if(!isValidEmail(email)){
                System.out.println("Email is not valid. Try again!");
                continue;
            } else if(users.containsKey(email)){
                System.out.println("Email is already used. Try another one!");
                continue;
            }

            System.out.println("Enter your password:");
            String password = scanner.nextLine();
            if(!isValidPassword(password)){
                System.out.println("Password is too weak. Try again!");
                continue;
            }

            users.put(email, password);
            System.out.println("Registeration succeeded. You may now login to your account!");
            login();
            break;
        }
    }
    public static void login(){

        while(true){
            System.out.println("Enter your email:");
            String email = scanner.nextLine();
            if(!users.containsKey(email)){
                System.out.println("Email not found. Do you want to try again? y or n");
                String answer = scanner.nextLine();
                if("y".equals(answer) || "yes".equals(answer.toLowerCase())) {
                    continue;
                } else {
                    menu();
                    break;
                }
            }

            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if(password.equals(users.get(email))){
                System.out.println("Login succeeded.");
                System.out.println("Welcome to your account!");
                break;
            } else {
                System.out.println("Incorrect password. Please try again!");
            }
        }
    }
}