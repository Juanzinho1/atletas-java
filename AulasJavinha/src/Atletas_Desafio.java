import java.util.Locale;
import java.util.Scanner;

public class Atletas_Desafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int q, at;
		String nome = "", nomemaior = "";
		char sex;
		double altura, peso, totalp, homi, muie, alturamuie, porcenthomi, pesomedio, alturamediam, maioralt;
		
		System.out.print("Qual a quantidade de atletas? ");
		q = sc.nextInt();
		
		at = 1;
		totalp = 0;
		homi = 0;
		muie = 0;
		alturamuie = 0;
		maioralt = 0;
		for (int i = 0; i < q; i++) {
			
			System.out.printf("Digite os dados do atleta numero %s:%n", at);
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			
			System.out.print("Sexo: ");
			sex = sc.next().charAt(0);
			
			while (sex != 'F' && sex!= 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sex = sc.next().charAt(0);
			}
			
			if (sex == 'M') {
				homi ++; 
			} else if (sex == 'F') {
				muie ++;
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();

			while (altura <=0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			
			if (sex == 'F') {
				alturamuie = alturamuie + altura;
			}
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			
			while (peso<=0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			if (maioralt < altura) {
				maioralt = altura;
				nomemaior = nome;
			}
			totalp = totalp + peso;
			
			at ++;
		}
		
		System.out.println();
		
		
		porcenthomi = (homi/q)*100;
		
		pesomedio = totalp/q;
		
		alturamediam = alturamuie/muie;
		
		System.out.println("RELATÓRIO: ");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesomedio);
		System.out.println("Atleta mais alto: " + nomemaior);
		System.out.printf("Porcentagem de homens: %.1f%%%n", porcenthomi);
		
		if (muie ==0) {
			System.out.println("Não há mulheres cadastradas");
		} else {
			System.out.printf("Altura média das mulheres: %.2f%n", alturamediam);
		}
		
		sc.close();
	}

}
