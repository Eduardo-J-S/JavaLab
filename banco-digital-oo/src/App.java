import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;
import service.BancoService;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            BancoService bancoService = new BancoService();

            // Cliente cliente1 = new Cliente("João Silva");
            // ContaCorrente contaCorrente = bancoService.criarContaCorrente(cliente1);
            
            // System.out.println("Conta Corrente criada:");
            // contaCorrente.imprimirExtrato();
            
            // System.out.println("Conta Poupança vinculada:");
            // contaCorrente.getContaPoupancaVinculada().imprimirExtrato();

            //ContaCorrente contaCorrente2 = bancoService.criarContaCorrente(cliente1);

            Cliente eduardo = new Cliente("Eduardo Silva");
            ContaCorrente contaCorrenteEduardo = bancoService.criarContaCorrente(eduardo);

            System.out.println("Conta Corrente criada:");
            contaCorrenteEduardo.imprimirExtrato();

            // System.out.println("Tentando criar conta poupança para Eduardo");
            // ContaPoupanca contaPOupancaEduardo = bancoService.criarContaPoupanca(eduardo); //retorno: Cliente já possui uma conta poupança.

            Cliente edson = new Cliente("Edson");
            ContaCorrente contaCorrenteEdson = bancoService.criarContaCorrente(edson);

            System.out.println("Conta Corrente criada:");
            contaCorrenteEdson.imprimirExtrato();

            System.out.println("------------------------------------------------");

            Cliente cliente2 = new Cliente("Maria Oliveira");
            ContaPoupanca contaPoupanca = bancoService.criarContaPoupanca(cliente2);

            contaPoupanca.depositar(400);
            
            System.out.println("Conta Poupança criada:");
            contaPoupanca.imprimirExtrato();

            System.out.println("Tentar criar novamente conta poupança para Maria Oliveira");
            ContaPoupanca contaPoupanca2MariaOliveira = bancoService.criarContaPoupanca(cliente2);

            System.out.println("Conta Poupança já criada da Maria Oliveira:");
            contaPoupanca2MariaOliveira.imprimirExtrato();

            System.out.println("=======================================================================");

            System.out.println("Tentando criar uma conta corrente para Maria Oliveira que já possui conta poupança");
            ContaCorrente contaCorrenteCliente2 = bancoService.criarContaCorrente(cliente2);

            System.out.println("Conta Corrente criada:");
            contaCorrenteCliente2.imprimirExtrato();

            System.out.println("Conta Poupança vinculada:");
            contaCorrenteCliente2.getContaPoupancaVinculada().imprimirExtrato();

            System.out.println("=======================================================================");

            Cliente mario = new Cliente("Mario Oliveira Souza");
            ContaPoupanca contaPoupancaMario = bancoService.criarContaPoupanca(mario);
            
            System.out.println("Conta Poupança Mario criada:");
            contaPoupancaMario.imprimirExtrato();

            System.out.println("=======================================================================");

            System.out.println("Listando clientes que obtem conta corrente e conta poupança:");
            System.out.println(bancoService.listarClientesContaCorrentePoupanca());

            System.out.println("Listando clientes que obtem apenas conta poupança:");
            System.out.println(bancoService.listarClientesContaPoupanca());

            System.out.println("Listando todos clientes do banco:");
            bancoService.listarClientesBanco();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
