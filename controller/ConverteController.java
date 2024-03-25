package controller;

import model.Pilha;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	Pilha p = new Pilha();
	int size = 0;



	public String decToBin(int decimal) throws Exception {

		String decimalfinal = "";
		if (decimal <= 0) {
			for (int i = 0; i < size; i++) {
				int j = p.pop();
				// Converter em String com valueOf
				String s = String.valueOf(j);
				decimalfinal += s;
			}
			return decimalfinal;

		} else {
			int resto = decimal % 2;

			p.push(resto);
			size++;
			return decToBin(decimal / 2);
		}
	}
}
