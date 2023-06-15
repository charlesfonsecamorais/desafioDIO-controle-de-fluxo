import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o 1º parametro: ");
		int parameterOne = scan.nextInt();
		System.out.print("Informe o 2º parametro: ");
		int parameterTwo = scan.nextInt();
		
		try {
			contar(parameterOne, parameterTwo);
			scan.close();
		} 
		catch (ParametrosInvalidosException e) {
			System.err.println("O segundo parametro deve ser maior que o primeiro!");
		}
	
	}
	static void contar(int parameterOne, int parameterTwo) throws ParametrosInvalidosException {
		int diference = parameterTwo - parameterOne;
		if(parameterOne > parameterTwo) {
			throw new ParametrosInvalidosException();
		} else {
			for(int i=0; i<diference; i++) {
				System.out.println("Imprimindo o nº " + (i+1));
			}
			
		}

	}

}
