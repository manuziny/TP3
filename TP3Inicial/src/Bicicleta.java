public class Bicicleta {
	String categoria, marca;
	private int id;

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

	@Override
	public String toString() {
		return "Categoria:" + this.getCategoria() + "\nMarca:" + this.getMarca() + "\nId:" + this.getId();
	}

}
