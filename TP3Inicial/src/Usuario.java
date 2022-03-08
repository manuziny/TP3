import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    //❖ Atributos: número de CPF, nome, data de nascimento, endereço, telefone.
    //❖ Métodos: cadastrar, editar, deletar, visualizar*/
    private String cpf; // > 11
    private String nome; // > 2 caracteres
    private String dataNascimento; // dd/mm/aaaa
    private String endereco; // >0
    private String telefone; // >8
    Scanner ler = new Scanner(System.in);


    public String addCpf(){
        String cpf;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu CPF: ");
        cpf = ler.nextLine();
        while(cpf.length() < 11 || cpf.length() > 11){
            System.out.println("CPF invalido, digite novamente: ");
            cpf = ler.nextLine();
        }
        return cpf;
        
    }

    public String addNome(){
        String nome;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        while(nome.length() < 2){
            System.out.println("Nome invalido, digite novamente: ");
            nome = ler.nextLine();
        }
        return nome;
    }

    public String addDataNascimento(){
        String dataNascimento;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua data de nascimento: ");
        dataNascimento = ler.nextLine();
        return dataNascimento;
    }

    public String addEndereco(){
        String endereco;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu endereco: ");
        endereco = ler.nextLine();
        while(endereco.length() == 0){
            System.out.println("Endereco invalido, digite novamente: ");
            endereco = ler.nextLine();
        }
        return endereco;
    }

    public String addTelefone(){
        String telefone;
        Scanner ler = new Scanner(System.in);

        System.out.println("Dgite seu telefone: ");
        telefone = ler.nextLine();

        while(telefone.length() < 8){
            System.out.println("Telefone invalido, digite novamente: ");
            telefone = ler.nextLine();
        }
        return telefone;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(ArrayList <String> nome, int qntd){
        return nome.get(qntd);
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void imprimeCadastro(ArrayList <String> cpf, ArrayList <String> nome, ArrayList <String> endereco, ArrayList <String> dataNascimento, ArrayList <String> telefone, int qntd){
        if(qntd == -1){
            System.out.println("Não há usuario cadastrado");
        }
        for(int i = 0; i <= qntd; i++){
            System.out.println("\nNome: " + nome.get(i) + "\nCPF: " + cpf.get(i) + "\nEndereco: " + endereco.get(i) + "\nData de nascimento: " + dataNascimento.get(i) + "\n\nTelefone: " + telefone.get(i));
        }
    }

    public void excluiUsuario(ArrayList <String> cpf, ArrayList <String> nome, ArrayList <String> endereco, ArrayList <String> dataNascimento, ArrayList <String> telefone, int qntd){
        String apagarUsuario;
        System.out.println("Digite o seu nome para confirmar a exclusao: ");
        apagarUsuario = ler.nextLine();

        if(nome.get(qntd).equalsIgnoreCase(apagarUsuario)){
            nome.remove(qntd);
            cpf.remove(qntd);
            endereco.remove(qntd);
            dataNascimento.remove(qntd);
            telefone.remove(qntd);
        }
    }

    public void editarUsuario(ArrayList <String> cpf, ArrayList <String> nome, ArrayList <String> endereco, ArrayList <String> dataNascimento, ArrayList <String> telefone, int qntd){
        String editarUsuario;
        System.out.println("Digite o seu nome para confirmar a edicao de dados: ");
        editarUsuario = ler.nextLine();

        if(nome.get(qntd).equalsIgnoreCase(editarUsuario)){
            System.out.println("Digite seu CPF: ");
            editarUsuario = ler.nextLine();
            cpf.set(qntd, editarUsuario);

            System.out.println("Digite seu nome: ");
            editarUsuario = ler.nextLine();
            nome.set(qntd, editarUsuario);

            System.out.println("Digite seu endereco: ");
            editarUsuario = ler.nextLine();
            endereco.set(qntd, editarUsuario);

            System.out.println("Digite sua data de nascimento: ");
            editarUsuario = ler.nextLine();
            dataNascimento.set(qntd, editarUsuario);

            System.out.println("Digite seu telefone: ");
            editarUsuario = ler.nextLine();
            telefone.set(qntd, editarUsuario);
        }
    }
}
