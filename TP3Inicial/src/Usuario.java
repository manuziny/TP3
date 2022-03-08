import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    // ❖ Atributos: número de CPF, nome, data de nascimento, endereço, telefone.
    // ❖ Métodos: cadastrar, editar, deletar, visualizar*/
    private String cpf; // > 11
    private String nome; // > 2 caracteres
    private String dataNascimento; // dd/mm/aaaa
    private String endereco; // >0
    private String telefone; // >8
    private ArrayList<Cartao> cartoes = new ArrayList<>();

    Scanner ler = new Scanner(System.in);

    public void addCpf() {
        String cpf;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu CPF: ");
        cpf = ler.nextLine();
        while (cpf.length() < 11 || cpf.length() > 11) {
            System.out.println("CPF invalido, digite novamente: ");
            cpf = ler.nextLine();
        }
        this.cpf = cpf;

    }

    public void addNome() {
        String nome;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        while (nome.length() < 2) {
            System.out.println("Nome invalido, digite novamente: ");
            nome = ler.nextLine();
        }
        this.nome = nome;
    }

    public void addDataNascimento() {
        String dataNascimento;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento: ");
        dataNascimento = ler.nextLine();
        this.dataNascimento = dataNascimento;
    }

    public void addEndereco() {
        String endereco;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu endereco: ");
        endereco = ler.nextLine();
        while (endereco.length() == 0) {
            System.out.println("Endereco invalido, digite novamente: ");
            endereco = ler.nextLine();
        }
        this.endereco = endereco;
    }

    public void addTelefone() {
        String telefone;
        Scanner ler = new Scanner(System.in);

        System.out.println("Dgite seu telefone: ");
        telefone = ler.nextLine();

        while (telefone.length() < 8) {
            System.out.println("Telefone invalido, digite novamente: ");
            telefone = ler.nextLine();
        }
        this.telefone = telefone;
    }

    public static void imprimeCadastro(ArrayList<Usuario> usuarios, String busca) {
        if (usuarios.size() == 0) {
            System.out.println("Não há usuarios cadastrados");
        } else {
            for (Usuario usr : usuarios) {
                if (usr.nome.contains(busca))
                    System.out.println(usr.toString() + "\n");
            }
        }
    }

    public static void excluiUsuario(ArrayList<Usuario> usuarios, String busca) {
        int cont = 0;
        for (Usuario usr : usuarios) {
            if (usr.nome.equalsIgnoreCase(busca)) {
                usuarios.remove(usr);
                System.out.printf("Usuário %s excluído com sucesso.", usr.nome);
                cont++;
                break;
            }
        }

        if (cont == 0) {
            System.out.println("Nenhum usuário encontrado com esse nome");
        }

    }

    public static void editarUsuario(ArrayList<Usuario> usuarios, String busca) {
        int cont = 0;
        String editarUsuario;
        Scanner ler = new Scanner(System.in);
        for (Usuario usr : usuarios) {
            if (usr.nome.equalsIgnoreCase(busca)) {
                System.out.println("Digite seu CPF: ");
                editarUsuario = ler.nextLine();
                usr.setCpf(editarUsuario);

                System.out.println("Digite seu nome: ");
                editarUsuario = ler.nextLine();
                usr.setNome(editarUsuario);

                System.out.println("Digite seu endereco: ");
                editarUsuario = ler.nextLine();
                usr.setEndereco(editarUsuario);

                System.out.println("Digite sua data de nascimento: ");
                editarUsuario = ler.nextLine();
                usr.setDataNascimento(editarUsuario);

                System.out.println("Digite seu telefone: ");
                editarUsuario = ler.nextLine();
                usr.setTelefone(editarUsuario);
            }
            cont++;
            break;
        }

        if (cont == 0) {
            System.out.println("Nenhum usuário encontrado com esse nome");
        }
    }

    public void addCartao(ArrayList<Usuario> usuarios, String busca) {
        int cont = 0;
        for (Usuario usr : usuarios) {
            if (usr.nome.equalsIgnoreCase(busca)) {
                usuarios.remove(usr);
                System.out.printf("Usuário %s excluído com sucesso.", usr.nome);
                cont++;
                break;
            }
        }

        if (cont == 0) {
            System.out.println("Nenhum usuário encontrado com esse nome");
        }

    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return ("Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nEndereco: " + this.getEndereco()
                + "\nData de nascimento: " + this.getDataNascimento() + "\nTelefone: " + this.getTelefone());
    }
}
