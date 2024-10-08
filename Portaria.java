package porta;

import java.util.Scanner;

public class Portaria {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		Porta novaPorta = new Porta();
		
		System.out.println("Nome do cliente: ");
		String nome = leia.next();
		System.out.println("Tipo de porta:");
		String tipoPorta = leia.next();
		System.out.println("Quantidade: ");
		int quantPorta = leia.nextInt();
		System.out.println("Valor: ");
		double precoPorta = leia.nextDouble();
		
		novaPorta.setTipoPorta(tipoPorta);
		novaPorta.setQuantPorta(quantPorta);
		novaPorta.setPrecoPorta(precoPorta);
		novaPorta.nomeCliente(nome);
		
		System.out.println("O cliente " +nome + " irá levar a porta de " + novaPorta.getTipoPorta()+ "." );
		System.out.println("A quantidade será: " +novaPorta.getQuantPorta()+ " no valor de " +novaPorta.getPrecoPorta()+ " cada.");
		
		
	}

}
