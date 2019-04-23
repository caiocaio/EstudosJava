package grande;

import java.util.Scanner;

public class TesteCharInt {
	
	public static void teste(){
	
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
    userInput.close();
	}
	


}
