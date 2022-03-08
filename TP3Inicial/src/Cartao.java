import java.util.ArrayList;
import java.util.Scanner;

public class Cartao {

    //❖ Atributos: usuário, cartão (cadastro padrão) número, nome, código de verificação e CPF
    //❖ Métodos: cadastrar, editar, deletar, visualizar
    Usuario usuario = new Usuario();
    private String numeroCartao; // entre 13 e 16
    private String nomeTitular; // > 0
    private int codVerificacao; // == 3
    private String cpfTitular; // == 11
    Scanner ler = new Scanner(System.in);
    
    public String addNumeroCartao(){
        String numeroCartao;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero de seu cartao: ");
        numeroCartao = ler.nextLine();
        while(numeroCartao.length() < 11 || numeroCartao.length() > 11){
            System.out.println("CPF invalido, digite novamente: ");
            numeroCartao = ler.nextLine();
        }
        return numeroCartao;
    }

    public String addNomeTitular(){
        String nomeTitular;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        nomeTitular = ler.nextLine();
        while(nomeTitular.length() < 2){
            System.out.println("Nome invalido, digite novamente: ");
            nomeTitular = ler.nextLine();
        }
        return nomeTitular;
    }

    public String addCodVerificacao(){
        String codVerificacao;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o CVC: ");
        codVerificacao = ler.nextLine();
        while(codVerificacao.length() < 3 || codVerificacao.length() > 3){
            System.out.println("CVC invalido, digite novamente: ");
            codVerificacao = ler.nextLine();
        }
        return codVerificacao;
        
    }

    public String addCpfTitular(){
        String cpfTitular;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o CPF do titular: ");
        cpfTitular = ler.nextLine();
        while(cpfTitular.length() < 11 || cpfTitular.length() > 11){
            System.out.println("CPF invalido, digite novamente: ");
            cpfTitular = ler.nextLine();
        }
        return cpfTitular;
    }

    public String numeroCartao(){
        return this.numeroCartao;
    }

    public String nomeTitular(){
        return this.nomeTitular;
    }

    public int codVerificacao(){
        return this.codVerificacao;
    }

    public String getCpf(){
        return this.cpfTitular;
    }

    public void imprimeDadosCartao(ArrayList <String> nome, ArrayList <String> numeroCartao, ArrayList <String> nomeTitular, ArrayList <String> codVerificacao, ArrayList <String> cpfTitular, int qntd){
        if(qntd == -1){
            System.out.println("Nao ha cartao(oes) cadastrado(s)");
        }
        else{
            for(int i = 0; i <= qntd; i++){
            System.out.println("\nNome do usuario: " + usuario.getNome(nome, qntd) + "\nNumero do cartao: " + numeroCartao.get(i) + "\nNome titular: " + nomeTitular.get(i) + "\nCVC: " + codVerificacao.get(i) + "\nCPF titular: " + cpfTitular.get(i));
            }
        }
    }

    public void excluiCartao(ArrayList <String> numeroCartao, ArrayList <String> nomeTitular, ArrayList <String> codVerificacao, ArrayList <String> cpfTitular, int qntd){
        String apagarCartao;
        System.out.println("Digite o numero do cartao que deseja apagar: ");
        apagarCartao = ler.nextLine();

        if(numeroCartao.get(qntd).equalsIgnoreCase(apagarCartao)){
            numeroCartao.remove(qntd);
            nomeTitular.remove(qntd);
            codVerificacao.remove(qntd);
            cpfTitular.remove(qntd);
        }
    }

    public void editarUsuario(ArrayList <String> numeroCartao, ArrayList <String> nomeTitular, ArrayList <String> codVerificacao, ArrayList <String> cpfTitular, int qntd){
        String editarCartao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero do cartao que deseja apagar: ");

        editarCartao = ler.nextLine();

        if(numeroCartao.get(qntd).equalsIgnoreCase(editarCartao)){
            System.out.println("Digite o numero do cartao: ");
            editarCartao = ler.nextLine();
            numeroCartao.set(qntd, editarCartao);

            System.out.println("Digite o nome do titular: ");
            editarCartao = ler.nextLine();
            nomeTitular.set(qntd, editarCartao);

            System.out.println("Digite o CVC: ");
            editarCartao = ler.nextLine();
            codVerificacao.set(qntd, editarCartao);

            System.out.println("Digite o CPF do titular: ");
            editarCartao = ler.nextLine();
            cpfTitular.set(qntd, editarCartao);

        }
    }
   
}

