import java.util.Scanner;
import java.util.ArrayList;

public class Estacao {
    //atributos: ID, quantidade de vagas e bicicletas, nome;
    //metodo: buscar.

    //Deixar um numero fixo de vagas e de bicicletas já existentes setados
    //o nome ja vai ser setado e o ID também.
    //acertar com o matix a qntd de bicicletas cadastradas depois.

    private String id;
    private String nomeEstacao;
    private int qntdVagas;
    private int qntdBicicletas;

    String getId(){
        return this.id;
    }

    String getNomeEstacao(){
        return this.nomeEstacao;
    }

    int getQntdVagas(){
        return this.qntdVagas;
    }

    int getQntdBicicletas(){
        return this.qntdBicicletas;
    }

    public void buscaEstacao(ArrayList<String> id, ArrayList<String> nomeEstacao, int qntdBicicletas, int qntdVagas){
        String palavraBusca;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome da estacao que deseja procurar: ");
        palavraBusca = ler.nextLine();

        for(int i = 0; i < nomeEstacao.size(); i++){
            if(palavraBusca.equals(nomeEstacao.get(i))){
                System.out.println("\nID: " + id.get(i) + "\nEstacao: " + nomeEstacao.get(i) + "\nBicicletas disponiveis: " + qntdBicicletas + "\nVagas disponiveis: " + qntdVagas);
                System.out.println("\n");
            }
        }

    }

}
