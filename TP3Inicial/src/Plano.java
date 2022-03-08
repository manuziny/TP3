public abstract class Plano extends Cartao {
	private String local, dadosCartao, perfil, tipoPlano;

	public Plano(Usuario usuario, String numeroCartao, String nomeTitular, int codVerificacao, String cpfTitular,
			String local, String dadosCartao, String perfil, String tipoPlano) {
		super(usuario, numeroCartao, nomeTitular, codVerificacao, cpfTitular);
		this.local = local;
		this.dadosCartao = dadosCartao;
		this.perfil = perfil;
		this.tipoPlano = tipoPlano;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDadosCartao() {
		return dadosCartao;
	}

	public void setDadosCartao(String dadosCartao) {
		this.dadosCartao = dadosCartao;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(String tipoPlano) {
		this.tipoPlano = tipoPlano;
	}

}
