import java.util.Scanner;
import java.util.InputMismatchException;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			try {
				System.out.print("Digite o numerador: ");
				int num = sc.nextInt();
				System.out.print("Digite o denominador: ");
				int den = sc.nextInt();
				
				int divExata = num / den;
				System.out.println("A divis�o exata desses n�meros � igual a " + divExata);
			}
			
			catch (InputMismatchException e) {
				System.out.println("Isso n�o � um n�mero!");
			}
			
			catch (ArithmeticException e) {
				System.out.println("O denominador deve ser diferente de zero!");
			}
			
			finally {
				System.out.println("Programa encerrado!");
			}
	
	}
}
