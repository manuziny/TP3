import java.util.Scanner;
import java.util.ArrayList;

public class AluguelDeBicicletasCompartilhadasApp {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Cartao cartao = new Cartao();
		Scanner ler = new Scanner(System.in);
		ArrayList <String> cpf = new ArrayList <String>();
		ArrayList <String> nome = new ArrayList <String>();
		ArrayList <String> endereco = new ArrayList <String>();
		ArrayList <String> dataNascimento = new ArrayList <String>();
		ArrayList <String> telefone = new ArrayList <String>();
		ArrayList <String> numeroCartao = new ArrayList <String>();
		ArrayList <String> nomeTitular = new ArrayList <String>();
		ArrayList <String> codVerificacao = new ArrayList <String>();
		ArrayList <String> cpfTitular = new ArrayList <String>();

		//declaracao de variaveis:
		int opcoes = 0;
		int qntd = -1;
		int qntdCartao = 0;

		do{
			imprimeMenu();
			opcoes = ler.nextInt();
			
			switch (opcoes) {
				case 1:
					cpf.add(usuario.addCpf());
					nome.add(usuario.addNome());
					endereco.add(usuario.addEndereco());
					dataNascimento.add(usuario.addDataNascimento());
					telefone.add(usuario.addTelefone());
					qntd++;
					break;

				case 2:
					usuario.imprimeCadastro(cpf, nome, endereco, dataNascimento, telefone, qntd);
					break;

				case 3:
					usuario.excluiUsuario(cpf, nome, endereco, dataNascimento, telefone, qntd);
					qntd--;
					break;
				
				case 4:
					usuario.editarUsuario(cpf, nome, endereco, dataNascimento, telefone, qntd);
					break;

				case 5:
					numeroCartao.add(cartao.addNumeroCartao());
					nomeTitular.add(cartao.addNomeTitular());
					codVerificacao.add(cartao.addCodVerificacao());
					cpfTitular.add(cartao.addCpfTitular());
					qntdCartao++;
					break;

				case 6:
					cartao.imprimeDadosCartao(nome, numeroCartao, nomeTitular, codVerificacao, cpfTitular, qntd);
					break;

				case 7:
					cartao.excluiCartao(numeroCartao, nomeTitular, codVerificacao, cpfTitular, qntd);
					qntdCartao--;
					break;

				case 8:
					cartao.editarUsuario(numeroCartao, nomeTitular, codVerificacao, cpfTitular, qntd);
					break;
			}
						
			
		}while(opcoes != 9);
			
	}

	public static void imprimeMenu(){
		System.out.println("1) Cadastrar usuario");
		System.out.println("2) Listar dados do usuario");
		System.out.println("3) Excluir usuario");
		System.out.println("4) Editar usuario");
		System.out.println("5) Cadastrar cartao");
		System.out.println("6) Listar cartao");
		System.out.println("7) Excluir cartao");
		System.out.println("8) Editar cartao");
	}


}


				
		
