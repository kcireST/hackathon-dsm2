package br.edu.fatec.pg.trabalho.classe;

public class Conta {
private double saldo = 0;
public String titular;
public int numero;


public int getNumeroConta(){
	return this.numero;
}

public void setNumeroConta() {
	this.numero = numero;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;

}
private void Depositar(double valor) {
	setSaldo(this.getSaldo()+valor);
	System.out.println("O seu saldo é: R$"+getSaldo());
	
}

public void setDepositar(double valor) {
Depositar(valor);
	
}



private void Sacar(double valor) {
	if(valor<=this.getSaldo()) {
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("O seu saldo restante é: R$"+getSaldo());
	}else {
		System.out.println("O seu saque não pode ser maior que o saldo atual");

	}
}

public void setSacar(double valor) {
Sacar(valor);
	
}


public void setTransferir(double valor, int numero) {
	Transferir(valor,numero);
	
}


private void Transferir(double valor,int numero) {
	if(valor<=this.getSaldo() && numero!= this.numero) {
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("O valor tranferido foi: R$"+valor+" para a conta "+ numero);
	}else {
		System.out.println("O valor para transferir não pode ser maior que o saldo atual");

	}
}

}
