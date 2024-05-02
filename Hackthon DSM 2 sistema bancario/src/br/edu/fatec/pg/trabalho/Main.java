package br.edu.fatec.pg.trabalho;
import br.edu.fatec.pg.trabalho.classe.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		double valor;
		int tipoconta;
		
		System.out.println("Digite o tipo da conta:"
				+ "1- Corrente"
				+ "2- Poupança");
		tipoconta = ler.nextInt();
		
		
		if(tipoconta ==1) {
	//		Conta conta =  new Corrente();
		Corrente conta = (Corrente)new Conta();
		    
			System.out.println("Digite o nome :");
			conta.titular = ler.nextLine();
			
			System.out.println("Digite o numero da conta: ");
			conta.numero = ler.nextInt();
			
			
		} else if(tipoconta==2) {
	
			//Conta conta =  new Poupanca();
			Poupanca conta = (Poupanca)new Conta();

			System.out.println("Digite o nome :");
			conta.titular = ler.nextLine();
			
			System.out.println("Digite o numero da conta: ");
			conta.numero = ler.nextInt();
			
		} else {
			System.out.println("Conta inválida!");
		}
		
		boolean	i=true;
		while(i==true) {
		System.out.println("O que deseja fazer? "
                + "1- Ver saldo "
                + "2- Depositar "
                + "3- Sacar "
                + "4- Transferir "
                + "5- Sair");
		
		int acao = ler.nextInt();
		
		switch(acao) {
		case 1:
			System.out.println(conta.getSaldo());
			break;
		case 2:
			System.out.println("Quanto deseja depositar: ");
			valor = ler.nextDouble();
			conta.setDepositar(valor);
			break;
		case 3:
			System.out.println("Quanto deseja sacar: ");
			valor = ler.nextDouble();
			conta.setSacar(valor);
			break;
		case 4:
			System.out.println("Quanto deseja transferir: ");
			valor = ler.nextDouble();
			System.out.println("Para que conta deseja tranferir: ");
			int numero = ler.nextInt();
			conta.setTransferir(valor,numero);
			break;
		case 5:
			i=false;
			break;
		}
		
	}

}
	}


