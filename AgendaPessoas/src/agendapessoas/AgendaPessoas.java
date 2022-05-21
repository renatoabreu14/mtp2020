/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapessoas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renato
 */
public class AgendaPessoas {
    
    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu = "1 - Adicionar pessoa\n";
        menu += "2 - Alterar pessoa\n";
        menu += "3 - Remover pessoa\n";
        menu += "4 - Listar pessoas\n";
        menu += "5 - Exibir pessoa\n";
        menu += "6 - Adicionar telefone\n";
        menu += "7 - Excluir telefone\n";
        menu += "8 - Sair\n";
        menu += "Escolha uma opção: ";
        int opcao = 0;
        do{
            System.out.print(menu);
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:{
                    escolherTipoPessoa();
                    break;
                }
                case 2:{
                    alterarPessoa();
                    break;
                }
                case 3:{
                    removerPessoa();
                    break;
                }
                case 4:{
                    listarPessoas();
                    break;
                }
                case 5:{
                    exibirPessoa();
                    break;
                }
                case 6:{
                    adicionarTelefone();
                    break;
                }
                case 7:{
                    excluirTelefone();
                    break;
                }
            }
            
        }while(opcao != 8);
    }

    private static void escolherTipoPessoa() {
        String menu = "1 - Pessoa Física\n";
        menu += "2 - Pessoa Jurídica\n";
        menu += "3 - Sair\n";
        menu += "Escolha uma opção: ";
        int opcao = 0;
        do{
            System.out.print(menu);
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:{
                    adicionarPessoaFisica();
                    break;
                }
                case 2:{
                    adicionarPessoaJuridica();
                    break;
                }
            }
            
        }while(opcao != 3);
    }

    private static void adicionarPessoaFisica() {
        PessoaFisica pf = new PessoaFisica();
        System.out.print("Informe o código:");
        pf.setCodigo(entrada.nextInt());
        entrada.nextLine();
        System.out.print("Informe o nome:");
        pf.setNome(entrada.nextLine());
        System.out.print("Informe o CPF:");
        pf.setCpf(entrada.nextLine());
        System.out.print("Informe o Data de Nascimento:");
        pf.setDataNasc(entrada.nextLine());
        System.out.print("Informe o Apelido:");
        pf.setApelido(entrada.nextLine());
        pessoas.add(pf);
    }

    private static void adicionarPessoaJuridica() {
        PessoaJuridica pj = new PessoaJuridica();
        System.out.print("Informe o código:");
        pj.setCodigo(entrada.nextInt());
        entrada.nextLine();
        System.out.print("Informe o nome:");
        pj.setNome(entrada.nextLine());
        System.out.print("Informe o CNPJ:");
        pj.setCnpj(entrada.nextLine());
        System.out.print("Informe o Data de Fundação:");
        pj.setDataFund(entrada.nextLine());
        System.out.print("Informe o Nome Fantasia:");
        pj.setNomeFantasia(entrada.nextLine());
        pessoas.add(pj);
    }

    private static void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    private static void exibirPessoa() {
        int posicao = buscarPessoa(" a ser exibida");
        System.out.println(pessoas.get(posicao));
    }

    private static int buscarPessoa(String complemento) {
        PessoaFisica pf = new PessoaFisica();
        System.out.print("Informe o codigo da pessoa" + complemento + ":");
        pf.setCodigo(entrada.nextInt());
        return pessoas.indexOf(pf);        
    }
    
    private static int buscarTelefone(Pessoa pessoa, String complemento) {
        Telefone telefone = new Telefone();
        System.out.print("Informe o identificador do telefone" + complemento + ":");
        telefone.setIdentificador(entrada.nextLine());
        return pessoa.getTelefones().indexOf(telefone);        
    }

    private static void alterarPessoa() {
        int posicao = buscarPessoa(" a ser alterada");
        if (posicao < 0){
            System.out.println("Pessoa não encontrada!");
        }else{
            Pessoa pessoa = pessoas.get(posicao);
            if (pessoa instanceof PessoaFisica){
                PessoaFisica pf = (PessoaFisica)pessoa;
                entrada.nextLine();
                System.out.print("Informe o nome:");
                pf.setNome(entrada.nextLine());
                System.out.print("Informe o CPF:");
                pf.setCpf(entrada.nextLine());
                System.out.print("Informe o Data de Nascimento:");
                pf.setDataNasc(entrada.nextLine());
                System.out.print("Informe o Apelido:");
                pf.setApelido(entrada.nextLine());
                pessoas.set(posicao, pf);
                System.out.println("Pessoa alterada com sucesso!");
            }else{
                PessoaJuridica pj = (PessoaJuridica)pessoa;
                entrada.nextLine();
                System.out.print("Informe o nome:");
                pj.setNome(entrada.nextLine());
                System.out.print("Informe o CNPJ:");
                pj.setCnpj(entrada.nextLine());
                System.out.print("Informe o Data de Fundação:");
                pj.setDataFund(entrada.nextLine());
                System.out.print("Informe o Nome Fantasia:");
                pj.setNomeFantasia(entrada.nextLine());
                pessoas.set(posicao, pj);
                System.out.println("Pessoa alterada com sucesso!");
            }
        }
    }

    private static void removerPessoa() {
        int posicao = buscarPessoa(" a ser excluída");
        if (posicao < 0){
            System.out.println("Pessoa não encontrada!");
        }else{
            pessoas.remove(posicao);
            System.out.println("Pessoa removida com sucesso!");
        }
    }

    private static void adicionarTelefone() {
        int posicao = buscarPessoa(" que deseja adicionar o telefone");
        if (posicao < 0){
            System.out.println("Pessoa não encontrada!");
        }else{
            Pessoa pessoa = pessoas.get(posicao);
            Telefone telefone = new Telefone();
            entrada.nextLine();
            System.out.print("Informe o identificador:");
            telefone.setIdentificador(entrada.nextLine());
            System.out.print("Informe a operadora:");
            telefone.setOperadora(entrada.nextLine());
            System.out.print("Informe o código do país:");
            telefone.setCodigopais(entrada.nextLine());
            System.out.print("Informe o DDD:");
            telefone.setDdd(entrada.nextInt());
            entrada.nextLine();
            System.out.print("Informe o numero:");
            telefone.setNumero(entrada.nextLine());
            pessoa.getTelefones().add(telefone);
            
        }
    }

    private static void excluirTelefone() {
        int posicao = buscarPessoa(" que deseja excluir um telefone");
        if (posicao < 0){
            System.out.println("Pessoa não encontrada!");
        }else{
            entrada.nextLine();
            int posTelefone = buscarTelefone(pessoas.get(posicao), " que deseja excluir");
            if (posTelefone < 0){
                System.out.println("Telefone não encontrado!");
            }else{
                pessoas.get(posicao).getTelefones().remove(posTelefone);
                System.out.println("Telefone removido com sucesso!"); 
            }
        }
    }
    
}
