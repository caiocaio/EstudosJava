package grande;

import java.time.LocalDate;

public class Main {

	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setDataNascimento(LocalDate.parse("1995-12-09"));
		
	
		
	System.out.println(p.getIdade());
		
	}
}
