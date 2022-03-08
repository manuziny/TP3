import java.util.Scanner;
import java.util.ArrayList;

public class Estacao {
    //atributos: ID, quantidade de vagas e bicicletas, nome;
    //metodo: buscar.

    //Deixar um numero fixo de vagas e de bicicletas já existentes setados
    //o nome ja vai ser setado e o ID também.
    //acertar com o matix a qntd de bicicletas cadastradas depois.
    Estacao e1 = new Estacao();
    Estacao e2 = new Estacao();
    Estacao e3 = new Estacao();
    Estacao e4 = new Estacao();

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

    public void situacaoEstacoes(){
        e1.id = "001";
        e1.nomeEstacao = "Mane Garrincha";
        e1.qntdBicicletas = 10;
        e1.qntdVagas = 15;

        e2.id = "235";
        e2.nomeEstacao = "Arniqueiras";
        e2.qntdBicicletas = 8;
        e2.qntdVagas = 10;

        e3.id = "897";
        e3.nomeEstacao = "Furnas";
        e3.qntdBicicletas = 12;
        e3.qntdVagas = 3;

        e4.id = "478";
        e4.nomeEstacao = "Taguapark";
        e4.qntdBicicletas = 20;
        e4.qntdVagas = 8;
    }

    public void buscaEstacao(ArrayList<String> id, ArrayList<String> nomeEstacao, ArrayList<String> qntdBicicletas, ArrayList<String> qntdVagas){
        String palavraBusca;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o ID ou nome da estacao que deseja procurar: ");
        palavraBusca = ler.nextLine();

        if(palavraBusca == e1.nomeEstacao || palavraBusca == e1.id){
            System.out.println("\nID: " + e1.id + "\nEstacao: " + e1.nomeEstacao + "\nBicicletas disponiveis: " + e1.qntdBicicletas + "\nVagas disponiveis: " + e1.qntdVagas);

        }else if(palavraBusca == e2.nomeEstacao || palavraBusca == e2.id){
            System.out.println("\nID: " + e2.id + "\nEstacao: " + e2.nomeEstacao + "\nBicicletas disponiveis: " + e2.qntdBicicletas + "\nVagas disponiveis: " + e2.qntdVagas);

        }else if(palavraBusca == e3.nomeEstacao || palavraBusca == e3.id){
            System.out.println("\nID: " + e3.id + "\nEstacao: " + e3.nomeEstacao + "\nBicicletas disponiveis: " + e3.qntdBicicletas + "\nVagas disponiveis: " + e3.qntdVagas);

        }else if(palavraBusca == e4.nomeEstacao || palavraBusca == e4.id){
            System.out.println("\nID: " + e4.id + "\nEstacao: " + e4.nomeEstacao + "\nBicicletas disponiveis: " + e4.qntdBicicletas + "\nVagas disponiveis: " + e4.qntdVagas);

        }
    }

}
