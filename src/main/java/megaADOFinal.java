import java.util.Scanner;

public class megaADOFinal {

	public static void main(String[] args) {

                        /*

                            PROFESSOR, confirme alinhado em aula, o código ele está funcionando,
                            porém, quando é escolhido a opção > 2, 3, 4, 5, 6 ele espera que seja passado
                            os valores, por algum motivo não está apresentando as mensagens que coloquei
                            nos CASE's do Switch, o senhor me disse que iria verificar depois o que pode ser,
                            visto que fiz um teste com os mesmos dados, porém, em um "projeto diferente".

                        */
            
            
		Scanner sc = new Scanner(System.in);

		int opcao;

		System.out.printf("Digite: %n" 
				+ "        1  para -  Creditos , %n" 
				+ "        2  para -  Algoritmo Praia , %n"
				+ "        3  para -  Algoritmo Desconto , %n" 
				+ "        4  para -  Algoritmo IMC , %n"
				+ "        5  para -  Algoritmo Enel , %n" 
				+ "        6  para -  Algoritmo Sabesp , %n"
				+ "        7  para -  Sair %n");
		opcao = sc.nextInt();

		while (opcao > 0 && opcao <= 7) {

			switch (opcao) {
			case 1:

				// ----------------------------------------------------------------------------------------------------------------------------------
				// -- Cr�ditos

				System.out.println(" ------------------------------------------------------- ");
				System.out.println("|   Numero Grupo: 11				        |");
				System.out.println("|   Nome grupo: O prisioneiro de Aden		        |");
				System.out.println("|   Nomes integrantes: Jose Cleone Paulino da Silva     |");
				System.out.printf(" ------------------------------------------------------- %n%n");

				break;

			case 2:

				// ----------------------------------------------------------------------------------------------------------------------------------
				// -- Guaruja

				int temperatura;
				double orcamento;
				char clima;

				System.out.print("Informe a temperatura: ");
				temperatura = sc.nextInt();

				System.out.print("Informe se o clima esta  A) Sol, B) Nublado, C) Garoa, D) Chuva: ");
				clima = sc.next().charAt(0);

				System.out.print("Informe o seu or�amento: ");
				orcamento = sc.nextDouble();

				if (temperatura >= 25 && clima == 'A' && orcamento >= 2000.00) {

					System.out.printf("Sim, pode ir a praia%n%n");

				}

				else if (temperatura >= 25 && clima == 'B' && orcamento >= 2000.00) {

					System.out.printf("Sim, pode ir a praia%n%n");

				}

				else {

					System.out.printf("Nao ir a praia%n%n");

				}

				break;

			case 3:

				// ----------------------------------------------------------------------------------------------------------------------------------
				// -- Desconto

				int quantidade;
				double valor, desconto, total;

				System.out.print("Informe quantas peças de roupas voce pegou: ");
				quantidade = sc.nextInt();

				System.out.print("Informe o valor: ");
				valor = sc.nextDouble();

				if (quantidade >= 10) {

					desconto = quantidade * valor * 0.10;
					total = quantidade * valor - desconto;
					System.out.printf("Total de R$ %.2f (desconto de R$ %.2f)%n%n", total, desconto);

				}

				else {

					total = quantidade * valor;
					System.out.printf("Total de R$ %.2f%n%n", total);

				}

				break;

			case 4:

				// ----------------------------------------------------------------------------------------------------------------------------------
				// -- IMC

				double peso, altura, resultado;

				System.out.println("Informe seu peso: ");
				peso = sc.nextDouble();

				System.out.println("Informe usa altura: ");
				altura = sc.nextDouble();

				resultado = peso / Math.pow(altura, 2);

				if (resultado <= 18.5) {

					System.out.printf("%.1f Kg/m² - Magreza%n%n", resultado);

				}

				else if (resultado <= 24.9) {

					System.out.printf("%.1f Kg/m² - Normal%n%n", resultado);

				}

				else if (resultado <= 30) {

					System.out.printf("%.1f Kg/m² - Sobrepeso%n%n", resultado);

				}

				else {

					System.out.printf("%.1f Kg/m² - Obesidade%n%n", resultado);

				}

				break;

			case 5:

				// ----------------------------------------------------------------------------------------------------------------------------------
				// -- kWh Enel

				double kWh, resultadoEnel;

				System.out.println("Informe a quantidade de kWh: ");
				kWh = sc.nextDouble();

				resultadoEnel = kWh * 0.28738 + kWh * 0.30711;

				System.out.printf("R$ %.2f%n%n", resultadoEnel);

				break;

			case 6:

				// ----------------------------------------------------------------------------------------------------------------------------------
				// -- Sabesp

				double consumo, resultadoSabesp;

				System.out.println("Informe o consumo: ");
				consumo = sc.nextDouble();

				if (consumo <= 10) {

					resultadoSabesp = 29.00 + 29.00;
					System.out.printf("R$ %.2f%n%n", resultadoSabesp);

				}

				else if (consumo <= 20) {

					resultadoSabesp = (29.00 + (10 - 5) * 4.54) + (29.00 + (10 - 5) * 4.54);
					System.out.printf("R$ %.2f%n%n", resultadoSabesp);

				}

				else if (consumo <= 50) {

					resultadoSabesp = (29.00 + 10 * 4.54 + (27 - 20) * 11.33) + (29.00 + 10 * 4.54 + (27 - 20) * 11.33);
					System.out.printf("R$ %.2f%n%n", resultadoSabesp);

				}

				else {

					resultadoSabesp = (29.00 + 10 * 4.54 + 30 * 11.33 + (55 - 50) * 12.48)
							+ (29.00 + 10 * 4.54 + 30 * 11.33 + (55 - 50) * 12.48);
					System.out.printf("R$ %.2f%n%n", resultadoSabesp);

				}

				break;

			}

			if(opcao > 7 || opcao == 0) {

				System.out.println("Você digitou um n�mero inv�lido!");
				break;
			}

			else if(opcao == 7){

				System.out.println("Obrigado por participar =-.D");
				break;
			}

			else {

				System.out.printf("Digite: %n" 
						+ "        1  para -  Creditos , %n" 
						+ "        2  para -  Algoritmo Praia , %n"
						+ "        3  para -  Algoritmo Desconto , %n" 
						+ "        4  para -  Algoritmo IMC , %n"
						+ "        5  para -  Algoritmo Enel , %n" 
						+ "        6  para -  Algoritmo Sabesp , %n"
						+ "        7  para -  Sair %n");
				opcao = sc.nextInt();

			}

		}

		sc.close();

	}
}
