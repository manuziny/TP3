import java.util.ArrayList;
import java.util.Scanner;

public class Bicicleta {
	String categoria;
	String marca;
	int id;
	Scanner ler = new Scanner(System.in);

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Bicicleta(String categoria, String marca, int id) {
		this.categoria = categoria;
		this.marca = marca;
		this.id = id;
	}

	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}

	public void addId() {
		System.out.println("Digite o id");
		id = ler.nextInt();
		setId(id);
	}

	public void addCategoria() {
		Scanner ler = new Scanner(System.in);
		String categoria;
		System.out.println("Digite a categoria:");
		categoria = ler.nextLine();
		setCategoria(categoria);
	}

	public void addMarca() {
		Scanner ler = new Scanner(System.in);
		String marca;
		System.out.println("Digite a marca");
		marca = ler.nextLine();
		setMarca(marca);
	}

	public static void editarBicicleta(ArrayList<Bicicleta> bicicletas, int busca) {

		int cont = 0;
		String editarBicicleta;
		Scanner ler = new Scanner(System.in);
		for (Bicicleta bicic : bicicletas) {
			if (bicic.id == busca) {
				System.out.println("Digite a categoria: ");
				editarBicicleta = ler.nextLine();
				bicic.setCategoria(editarBicicleta);

				System.out.println("Digite a marca:");
				editarBicicleta = ler.nextLine();
				bicic.setMarca(editarBicicleta);
			}
			cont++;
			break;
		}

		if (cont == 0) {
			System.out.println("ID nao encontrado");
		}
	}

	public static void deletarBicicleta(ArrayList<Bicicleta> bicicletas, int busca) {
		int cont = 0;
        for (Bicicleta bicic : bicicletas) {
            if (bicic.id == busca) {
                bicicletas.remove(bicic);
                System.out.printf("ID excluido com sucesso.", bicic.id);
                cont++;
                break;
            }
        }

        if (cont == 0) {
            System.out.println("ID nao encontrado");
        }
	}

	@Override
	public String toString() {
		return "Id:" + this.getId() + "\nCategoria:" + this.getCategoria() + "\nMarca:" + this.getMarca();
	}

}
