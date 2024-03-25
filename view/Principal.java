package view;

import java.util.Scanner;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) throws Exception {

		ConverteController converte = new ConverteController();
		Scanner sc = new Scanner(System.in);
		
		int decimal = 1001;
		
		
		while (decimal >1000 || decimal <0) {
			System.out.println("Insira um numero de 1 até 1000");
			decimal = sc.nextInt();
		}

		String binario= converte.decToBin(decimal);
		
		System.out.println(decimal +" em binario : " + binario);
	}
}
