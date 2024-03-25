package view;

import model.Pilha;

public class Teste {

	public static void main(String[] args) throws Exception {

		Pilha p = new Pilha();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);

		p.push(1);

		int totalNos = (int) ((Math.random() * 10) + 1);
		
		System.out.println(totalNos);
		
		for (int i = 0; i < totalNos; i++) {
			int e = (int) ((Math.random() * 100) + 1);
			p.push(e);
		}

		int top;
		try {
			top = p.top();
			System.out.println(top);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < totalNos; i++) {

			try {
				int valor = p.pop();
				System.out.println("Pop: " + valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
			vazia = p.isEmpty();
			System.out.println("Vazia: " + vazia);
		}

		System.out.println("Vazia: " + vazia);

	}
}
