package br.com.Lista;

	import java.util.Scanner;

public class EX_33 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner (System.in);
		
	int	vetor [] = new int [10];

	
	for(int i = 0; i < vetor.length; i++){
	
		System.out.printf("Digite o [%d]� numero: ",i+1);
		vetor[i] = entrada.nextInt();
		}
	
	
		System.out.println("\nNUMEROS ACIMA DE 25");
		for(int i=0; i<vetor.length; i++){
			if(vetor[i] >=25){
				
				System.out.printf("numero [%d] na posi��o [%d]\n",vetor[i], i+1 );	
				
			}else if (vetor[i]<25){
				
			}
			else{
				System.out.println("nenhum numero encontrado");
			}
		}
	}

}
