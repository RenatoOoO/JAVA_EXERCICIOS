package br.com.Ex_01;

import java.util.Scanner;

public class Objeto_Principal {

	public static void main(String[] args) {

			Scanner leitura = new Scanner(System.in);
			
			System.out.print("Digite o inicio: ");
			int inicio = leitura.nextInt();
			System.out.print("Digite o fim: ");
			int fim = leitura.nextInt();
			System.out.print("Digite o numero [A]: ");
			int a = leitura.nextInt();
			System.out.print("Digite o numero [B]: ");
			int b = leitura.nextInt();
			Objeto o1 = new Objeto(inicio, fim, a, b);
			
			System.out.println(o1.Hello());
			
			System.out.println(o1.getImpares());
			
			leitura.nextLine();
			
			System.out.println("String invertida: \n"
			+ o1.inverterString("BANANA")
			+"\nA pontenicia entre Inicio e Fim e: "+o1.Operacao1()
			+"\nO calculo a� + 2*a*b+b� e: "+o1.Operacao2());
			
		}

	}

