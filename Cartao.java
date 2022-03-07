public class Cartao {

    //❖ Atributos: usuário, cartão (cadastro padrão) número, nome, código de verificação e CPF
    //❖ Métodos: cadastrar, editar, deletar, visualizar
    private String numeroCartao; // entre 13 e 16
    private String nomeTitular; // > 0
    private int codVerificacao; // == 3
    private String cpf; // == 11

    public void setNumeroCartao(String numeroCartao){
        if(numeroCartao.length() < 13 || numeroCartao.length() > 16 ){
            throw new IllegalArgumentException("Cartao invalido, digite novamente: ");
        }else{
            this.numeroCartao = numeroCartao;
        }
    }

    public void setNomeTitular(String nomeTitular){
        if(nomeTitular.length() == 0){
            throw new IllegalArgumentException("Nome invalido, digite novamente: ");
        }else{
            this.nomeTitular = nomeTitular;
        }
    }

    public void setCodVerificacao(int codVerificacao){
        if(codVerificacao < 3 || codVerificacao > 3){
            throw new IllegalArgumentException("CVC invalido, digite novamente: ");
        }else{
            this.codVerificacao = codVerificacao;
        }
    }

    public void setCpf(String cpf){
        if(cpf.length() < 11 || cpf.length() > 11){
            throw new IllegalArgumentException("CPF invalido, digite novamente: ");
            
        }else{
            this.cpf = cpf;
        }
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
        return this.cpf;
    }

    public void imprimeDadosCartao(){
        System.out.println("\nNumero do cartao: " + numeroCartao);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("CVC: " + codVerificacao);
        System.out.println("CPF: " + cpf);
    }
}
