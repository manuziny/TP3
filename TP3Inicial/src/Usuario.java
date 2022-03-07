public class Usuario {

    //❖ Atributos: número de CPF, nome, data de nascimento, endereço, telefone.
    //❖ Métodos: cadastrar, editar, deletar, visualizar*/
    private String cpf; // > 11
    private String nome; // > 2 caracteres
    private String dataNascimento; // dd/mm/aaaa
    private String endereco; // >0
    private String telefone; // >8

    public void setCpf(String cpf){
        if(cpf.length() < 11 || cpf.length() > 11){
            System.out.println("CPF invalido, digite novamente: ");
            
        }else{
            this.cpf = cpf;
        }
    }

    public void setNome(String nome){
        if(nome.length() < 2){
            System.out.println("Nome invalido, digite novamente: ");
        }else{
            this.nome = nome;
        }
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereco){
        if(endereco.length() == 0){
            System.out.println("Endereco invalido, digite novamente: ");
        }else{
            this.endereco = endereco;
        }
    }

    public void telefone(String telefone){
        if(telefone.length() < 8){
            System.out.println("Telefone invalido, digite novamente: ");
        }else{
            this.telefone = telefone;
        }
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
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

    public void imprimeCadastro(){
        System.out.println("\nCPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

}
