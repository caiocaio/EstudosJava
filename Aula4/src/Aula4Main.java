import java.time.LocalDate;

public class Aula4Main {
	public static void main(String[] args) {
		Professor pessoa1 = new Professor ("Augusto Araujo");
		pessoa1.setDataNascimento(LocalDate.of(1990, 03, 03));
		pessoa1.setCpf("122321412443");
		pessoa1.setAltura(1.77F);
		pessoa1.setSalario(2000F);
		
		
		//tem um? associacao, eh um? herenca
		
		Estudante pessoa2 = new Estudante("Gabriel Rodrigues");
		pessoa2.setCpf("4141251214124");
		pessoa2.setCurso("Curso de corno");
		pessoa2.setMatricula("242424242");
		
		
	}

}
