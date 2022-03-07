import java.util.Scanner;

public class AluguelDeBicicletasCompartilhadasApp {

	public static void main(String[] args) {
		Usuario cadastroUsuario = new Usuario();
		Scanner ler = new Scanner(System.in);

		//declaracao de variaveis:
		String nome, endereco, dataNascimento, cpf, telefone;

		System.out.print("Digite seu CPF: ");
		cpf = ler.nextLine();
		while(cpf.length() < 11 || cpf.length() > 11){
			System.out.print("CPF invalido, digite novamente: ");
			cpf = ler.nextLine();
		}
		cadastroUsuario.setCpf(cpf);

		System.out.print("Digite seu nome: ");
		nome = ler.nextLine();
		while(nome.length() < 2){
			System.out.println("Nome invalido, digite novamente: ");
			nome = ler.nextLine();
		}
		cadastroUsuario.setNome(nome);

		System.out.print("Digite sua data de nascimento: ");
		dataNascimento = ler.nextLine();
		cadastroUsuario.setDataNascimento(dataNascimento);

		System.out.print("Digite seu endereco: ");
		endereco = ler.nextLine();
		while(endereco.length() == 0){
			System.out.println("Endereco invalido, digite novamente: ");
			endereco = ler.nextLine();
		}
		cadastroUsuario.setEndereco(endereco);

		System.out.print("Digite seu telefone: ");
		telefone = ler.nextLine();
		while(telefone.length() < 8){
            System.out.println("Telefone invalido, digite novamente: ");
			telefone = ler.nextLine();
		}
		cadastroUsuario.telefone(telefone);

		cadastroUsuario.imprimeCadastro();
	}

}
