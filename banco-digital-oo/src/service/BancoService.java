package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class BancoService {
    private List<Conta> contasCorrentePoupanca;
    private List<ContaPoupanca> contasPoupanca;

    public BancoService() {
        this.contasCorrentePoupanca = new ArrayList<>();
        this.contasPoupanca = new ArrayList<>();
    }

    public ContaCorrente criarContaCorrente(Cliente cliente) {
        // Verificar se o cliente já possui uma conta corrente
        Optional<Conta> contaExistente = contasCorrentePoupanca.stream()
                .filter(cc -> cc.getCliente().equals(cliente) && cc instanceof ContaCorrente)
                .findFirst();

        if (contaExistente.isPresent()) {
            throw new IllegalArgumentException("Cliente já possui uma conta corrente.");
        }

        // Verificar se o cliente possui uma conta poupança existente
        Optional<ContaPoupanca> contaPoupancaExistente = contasPoupanca.stream()
                .filter(cp -> cp.getCliente().equals(cliente))
                .findFirst();

        ContaCorrente contaCorrente;

        if (contaPoupancaExistente.isPresent()) {
            ContaPoupanca contaPoupanca = contaPoupancaExistente.get();
            System.out.println(
                    "Cliente já possui conta poupança que será excluida e seu dinheiro será realocado para a nova poupança criada junto com a conta corrente.");
            System.out.println(
                    "Mantendo o mesmo número da conta poupança. Que é guardado para conta corrente mesmo o cliente nunca ativando essa opção");

            int numeroContaPoupanca = contaPoupanca.getNumero();
            double dinheiroContaPoupanca = contaPoupanca.getSaldo();
            contasPoupanca.remove(contaPoupanca);

            contaCorrente = new ContaCorrente(cliente, numeroContaPoupanca);
            contaCorrente.getContaPoupancaVinculada().depositar(dinheiroContaPoupanca);
        } else {
            contaCorrente = new ContaCorrente(cliente);
        }

        contasCorrentePoupanca.add(contaCorrente);
        contasCorrentePoupanca.add(contaCorrente.getContaPoupancaVinculada());
        return contaCorrente;
    }

    public ContaPoupanca criarContaPoupanca(Cliente cliente) {

        Optional<Conta> contaCCExistente = contasCorrentePoupanca.stream()
                .filter(cc -> cc.getCliente().equals(cliente))
                .findFirst();
        if (contaCCExistente.isPresent()) {
            throw new IllegalArgumentException("Cliente já possui uma conta poupança.");
        }

        Optional<ContaPoupanca> contaCPExistente = contasPoupanca.stream()
                .filter(cp -> cp.getCliente().equals(cliente))
                .findFirst();

        if (contaCPExistente.isPresent()) {
            System.out.println("Cliente já possui uma sua conta poupança criada sem uma conta corrente.");
            return contaCPExistente.get();
        }

        ContaPoupanca NovaContaPoupanca = new ContaPoupanca(cliente);
        contasPoupanca.add(NovaContaPoupanca);
        return NovaContaPoupanca;
    }

    public List<String> listarClientesContaCorrentePoupanca() {
        List<String> clientes = contasCorrentePoupanca.stream().map(cliente -> cliente.getCliente().getNome())
                .distinct().toList();
        return clientes;
    }

    public List<String> listarClientesContaPoupanca() {
        List<String> clientes = contasPoupanca.stream().map(cliente -> cliente.getCliente().getNome())
                .distinct().toList();
        return clientes;
    }

    public void listarClientesBanco(){
        List<String> todosClientes = new ArrayList<>();

        List<String> clientesCC = listarClientesContaCorrentePoupanca();
        List<String> clientesCP = listarClientesContaPoupanca();

        todosClientes.addAll(clientesCC);
        todosClientes.addAll(clientesCP);

        todosClientes.forEach(System.out::println);
    }

    public List<Conta> getContasCorrentePoupanca() {
        return contasCorrentePoupanca;
    }

    public List<ContaPoupanca> getContasPoupanca() {
        return contasPoupanca;
    }
}
