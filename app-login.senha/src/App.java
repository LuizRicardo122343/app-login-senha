import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final String CORRECT_LOGIN = "java8";
        final String CORRECT_PASSWORD = "java8";
        final int MAX_ATTEMPTS = 3;
        
        Scanner scanner = new Scanner(System.in);
        int attemptsLeft = MAX_ATTEMPTS;
        boolean accessGranted = false;
        
        while (attemptsLeft > 0 && !accessGranted) {
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();
            
            System.out.print("Digite a senha: ");
            String password = scanner.nextLine();
            
            if (login.equals(CORRECT_LOGIN) && password.equals(CORRECT_PASSWORD)) {
                accessGranted = true;
                System.out.println("Login e senha aceitos!");
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("Falha, verifique login e senha! Você tem " + attemptsLeft + " tentativa(s)!.");
                } else {
                    System.out.println("bloquear!. Você não tem mais tentativas.");
                }
            }
        }
        
        if (!accessGranted) {
            System.out.println("Acesso negado.");
        }
        
        scanner.close();
    }
}