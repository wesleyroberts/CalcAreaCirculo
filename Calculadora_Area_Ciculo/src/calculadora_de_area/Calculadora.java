package calculadora_de_area;

import java.util.Scanner;

public class Calculadora{

	public static void main(String[] args) {
		double area;
		double pi=3.14;
				
		System.out.println("Escolha a opção naqual se encaixa com as informaç~eos que você tem\n");
		System.out.println("A-[raio]");
		System.out.println("B-[diâmento]");
		System.out.println("C-[circunferência]");
		System.out.println("D-[setor circular]");
		System.out.println("\n");	
		System.out.println("Considerando pi igual a 3,14");
		System.out.println("\n");		
		try (Scanner num = new Scanner(System.in)) {
			System.out.println("Digite a opção desejada:");
			String escolha = num.nextLine();
			
			// Primeiro if para calcular através do raio:
			if(escolha.equals("A")) {
				System.out.println("Para saber a area do circulo adcione o raio:");
				double raio = num.nextDouble();
				area=(( raio*raio)*pi);
				System.out.println("O valor da area é: "+area+" cm^2");
			
			//Segundo if  para calcular através do diâmetro:
			}else if(escolha.equals("B")) {
				System.out.println("Para saber a area do circulo adcione o diâmetro:");
				double diametro = num.nextDouble();
				double raio=(diametro/2);
				area=(( raio*raio)*pi);
				System.out.println("O valor da area é: "+area+" cm^2");
				
				//Segundo if  para calcular através da circunferência:
			}else if(escolha.equals("C")) {
				System.out.println("Para saber a area do circulo adcione a circunferência:");
				double circun = num.nextDouble();
				area=((circun*circun)/(4*pi)); 
				System.out.println("O valor da area é: "+area+" cm^2");
			
				//Segundo if  para calcular através do setor c:
			}else {
				System.out.println("Para saber a area do circulo adcione a setor circular:");
				System.out.println("Informe o angulo do setor:");
				int angulo= num.nextInt();
				area=((15*pi)*(360/angulo)); 
				System.out.println("O valor da area é: "+area+" cm^2");
			}
		}
		
		
	
	}

}