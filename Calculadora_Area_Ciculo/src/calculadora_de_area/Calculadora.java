package calculadora_de_area;

import java.util.Scanner;

public class Calculadora{

	public static void main(String[] args) {
		double area;
		double pi=3.14;
				
		System.out.println("Escolha a op��o naqual se encaixa com as informa�~eos que voc� tem\n");
		System.out.println("A-[raio]");
		System.out.println("B-[di�mento]");
		System.out.println("C-[circunfer�ncia]");
		System.out.println("D-[setor circular]");
		System.out.println("\n");	
		System.out.println("Considerando pi igual a 3,14");
		System.out.println("\n");		
		try (Scanner num = new Scanner(System.in)) {
			System.out.println("Digite a op��o desejada:");
			String escolha = num.nextLine();
			
			// Primeiro if para calcular atrav�s do raio:
			if(escolha.equals("A")) {
				System.out.println("Para saber a area do circulo adcione o raio:");
				double raio = num.nextDouble();
				area=(( raio*raio)*pi);
				System.out.println("O valor da area �: "+area+" cm^2");
			
			//Segundo if  para calcular atrav�s do di�metro:
			}else if(escolha.equals("B")) {
				System.out.println("Para saber a area do circulo adcione o di�metro:");
				double diametro = num.nextDouble();
				double raio=(diametro/2);
				area=(( raio*raio)*pi);
				System.out.println("O valor da area �: "+area+" cm^2");
				
				//Segundo if  para calcular atrav�s da circunfer�ncia:
			}else if(escolha.equals("C")) {
				System.out.println("Para saber a area do circulo adcione a circunfer�ncia:");
				double circun = num.nextDouble();
				area=((circun*circun)/(4*pi)); 
				System.out.println("O valor da area �: "+area+" cm^2");
			
				//Segundo if  para calcular atrav�s do setor c:
			}else {
				System.out.println("Para saber a area do circulo adcione a setor circular:");
				System.out.println("Informe o angulo do setor:");
				int angulo= num.nextInt();
				area=((15*pi)*(360/angulo)); 
				System.out.println("O valor da area �: "+area+" cm^2");
			}
		}
		
		
	
	}

}