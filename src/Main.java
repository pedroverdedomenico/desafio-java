
public class Main {

	
	 public static void main(String[] args) {
		Cliente pedro = new Cliente();
		pedro.setNome("pedro");
		 
		
		Conta cc = new ContaCorrente(pedro);
		cc.depositar(200);
		
		Conta poupanca = new ContaPoupanca(pedro);
		
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
