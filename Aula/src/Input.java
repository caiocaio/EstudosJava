import java.util.Scanner;


public class Input {
    
    public static void main(String args[]) {
        final Scanner userInput = new Scanner(System.in);
        boolean properInput = false;
        int number = 0;
        System.out.println("Entre com um numero: ");
        while (!properInput) {
            if (userInput.hasNextInt()) {
            	
                number = userInput.nextInt();
                properInput = true;
            } else {
                System.out.println("tente novamente");
                userInput.next();
            }
        }

        System.out.println("Você entrou com o número: " + number);
    }
}