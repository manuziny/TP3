import java.util.Scanner;
import java.util.ArrayList;

public class AluguelDeBicicletasCompartilhadasApp {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String busca;
		int ID;
		Boolean match;

		ArrayList<Usuario> usuarios = new ArrayList<>();
		ArrayList<Bicicleta> bicicletas = new ArrayList<>();

		// declaracao de variaveis:
		int opcoes = 0;
		int qntd = -1;
		int qntdCartao = 0;

		do {
			imprimeMenu();
			opcoes = ler.nextInt();

			switch (opcoes) {
			case 1:
				Usuario usuario = new Usuario();
				usuario.addCpf();
				usuario.addNome();
				usuario.addEndereco();
				usuario.addDataNascimento();
				usuario.addTelefone();
				usuarios.add(usuario);
				System.out.println(usuarios.toString());
				qntd++;
				break;

			case 2:
				System.out.println("Digite o seu nome para buscar: ");
				busca = ler.nextLine();
				Usuario.imprimeCadastro(usuarios, busca);
				break;

			case 3:

				System.out.println("Digite o seu nome para confirmar a exclusao: ");
				busca = ler.nextLine();
				Usuario.excluiUsuario(usuarios, busca);
				break;

			case 4:
				System.out.println("Digite o seu nome para confirmar a edicao de dados: ");
				busca = ler.nextLine();
				Usuario.editarUsuario(usuarios, busca);
				break;

			case 5:
				Cartao cartao = new Cartao();
				match = false;
				System.out.println("Digite o seu nome para confirmar a cadastro de carto: ");
				busca = ler.nextLine();
				for (Usuario usr : usuarios) {
					if (usr.getNome().equalsIgnoreCase(busca)) {
						cartao.addNumeroCartao();
						cartao.addNomeTitular();
						cartao.addCpfTitular();
						cartao.addCodVerificacao();

						usr.getCartoes().add(cartao);
						match = true;
						break;
					}
				}
				if (!match) {
					System.out.println("Nenhum usuario com esse nome encontrado.");
				}
				break;

			case 6:
				match = false;
				System.out.println("Digite o seu nome para pesquisar seus cartões: ");
				busca = ler.nextLine();

				for (Usuario usr : usuarios) {
					if (usr.getNome().equalsIgnoreCase(busca)) {
						for (int i = 0; i < usr.getCartoes().size(); i++) {
							System.out.printf("%d - %s\n", i, usr.getCartoes().get(i).toString());
						}
						match = true;
					}
				}
				if (!match) {
					System.out.println("Nenhum usuário com esse nome encontrado.");
				}
				break;

			case 7:

				System.out.println("Digite o seu nome para confirmar a deleção de cartão: ");
				busca = ler.nextLine();

				Cartao.excluiCartao(usuarios, busca);
				break;
			case 8:
				Bicicleta bici = new Bicicleta();
				bici.addId();
				bici.addCategoria();
				bici.addMarca();
				bicicletas.add(bici);
				System.out.println(bicicletas.toString());
				break;
			case 9:
				System.out.println("Digite o ID da bicicleta que deseja editar:");
				ID = ler.nextInt();
				Bicicleta.editarBicicleta(bicicletas, ID);
				break;
			case 0:
				// encerrar
				break;
			default:
				System.out.println("Digite uma opção válida.");
			}

		} while (opcoes != 0);

	}

	public static void imprimeMenu() {
		System.out.println("1) Cadastrar usuario");
		System.out.println("2) Listar dados do usuario");
		System.out.println("3) Excluir usuario");
		System.out.println("4) Editar usuario");
		System.out.println("5) Cadastrar cartao");
		System.out.println("6) Listar cartao");
		System.out.println("7) Excluir cartao");
		System.out.println("8) Cadastrar bicicleta");
		System.out.println("9) Listar bicicletas");
		System.out.println("10) Excluir bicicleta");
		System.out.println("11) Editar bicicleta");
		System.out.println("12) Cadastrar plano");
		System.out.println("13) Buscar plano");
		System.out.println("14) Cancelar plano");
		System.out.println("0) Sair");
	}

}
