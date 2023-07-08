import java.util.Locale;
import java.util.Scanner;

public class Idades {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		nome1 = leia.nextLine();
		System.out.print("Idade: ");
		idade1 = leia.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		leia.nextLine();
		nome2 = leia.nextLine();
		System.out.print("Idade: ");
		idade2 = leia.nextInt();
		
		media = (idade1 + idade2) / 2.0;
		
		System.out.println("A idade media de " + nome1 + " e " + nome2 + " e de " + String.format("%.1f", media) +" anos");
		
		leia.close();
	}
}
