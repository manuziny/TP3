import java.util.ArrayList;
import java.util.Scanner;

public class Cartao {

	// â�– Atributos: usuÃ¡rio, cartÃ£o (cadastro padrÃ£o) nÃºmero, nome, cÃ³digo de
	// verificaÃ§Ã£o e CPF
	// â�– MÃ©todos: cadastrar, editar, deletar, visualizar
	Usuario usuario = new Usuario();
	private String numeroCartao; // entre 13 e 16
	private String nomeTitular; // > 0
	private String codVerificacao; // == 3
	private String cpfTitular; // == 11
	Scanner ler = new Scanner(System.in);

	public Cartao(Usuario usuario, String numeroCartao, String codVerificacao, String cpfTitular) {
		this.usuario = usuario;
		this.numeroCartao = numeroCartao;
		this.nomeTitular = usuario.getNome();
		this.codVerificacao = codVerificacao;
		this.cpfTitular = usuario.getCpf();
	}

	public Cartao() {
	}

	public void addNumeroCartao() {
		String numeroCartao;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o numero de seu cartao: ");
		numeroCartao = ler.nextLine();
		while (numeroCartao.length() < 11 || numeroCartao.length() > 11) {
			System.out.println("CPF invalido, digite novamente: ");
			numeroCartao = ler.nextLine();
		}
		this.numeroCartao = numeroCartao;
	}

	public void addNomeTitular() {
		String nomeTitular;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o nome do titular: ");
		nomeTitular = ler.nextLine();
		while (nomeTitular.length() < 2) {
			System.out.println("Nome invalido, digite novamente: ");
			nomeTitular = ler.nextLine();
		}
		this.nomeTitular = nomeTitular;
	}

	public void addCodVerificacao() {
		String codVerificacao;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o CVC: ");
		codVerificacao = ler.nextLine();
		while (codVerificacao.length() < 3 || codVerificacao.length() > 3) {
			System.out.println("CVC invalido, digite novamente: ");
			codVerificacao = ler.nextLine();
		}
		this.codVerificacao = codVerificacao;

	}

	public void addCpfTitular() {
		String cpfTitular;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o CPF do titular: ");
		cpfTitular = ler.nextLine();
		while (cpfTitular.length() < 11 || cpfTitular.length() > 11) {
			System.out.println("CPF invalido, digite novamente: ");
			cpfTitular = ler.nextLine();
		}
		this.cpfTitular = cpfTitular;
	}

	public String numeroCartao() {
		return this.numeroCartao;
	}

	public String nomeTitular() {
		return this.nomeTitular;
	}

	public String codVerificacao() {
		return this.codVerificacao;
	}

	public String getCpf() {
		return this.cpfTitular;
	}

	public static void excluiCartao(ArrayList<Usuario> usuarios, String busca) {
		Boolean match = false;
		int escolha;
		Scanner ler = new Scanner(System.in);
		for (Usuario usr : usuarios) {
			if (usr.getNome().equalsIgnoreCase(busca)) {

				for (int i = 0; i < usr.getCartoes().size(); i++) {
					System.out.printf("%d - %s\n", i, usr.getCartoes().get(i).toString());
				}
				System.out.println("Escolha um cartao pelo número da lista: ");
				escolha = ler.nextInt();
				while (escolha <= 0 || escolha > usr.getCartoes().size()) {
					System.out.println("Escolha um número válido: ");
					escolha = ler.nextInt();
				}
				usr.getCartoes().remove(escolha);

				match = true;
			}
		}
		if (!match) {
			System.out.println("Nenhum usuário com esse nome encontrado.");
		}
	}

	@Override
	public String toString() {
		return "Titular: " + this.nomeTitular + "Final: " + this.numeroCartao.substring(this.numeroCartao.length() - 5)
				+ "\n";
	}
}
