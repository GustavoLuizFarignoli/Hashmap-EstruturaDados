import Arvore.ArvoreBusca;
import Hash.Aluno;
import Hash.Hash1;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno(1,"Marcelo");
        Aluno b = new Aluno(10,"João");
        Aluno c = new Aluno(5,"Molecote");



    }

    public static void inseriraluno(){
        Hash1 hash1 = new Hash1(7);
        Aluno a = new Aluno(1,"Marcelo");
        hash1.inserir(a);
        Aluno b = new Aluno(10,"João");
        hash1.inserir(b);
        Aluno c = new Aluno(5,"Molecote");
        hash1.inserir(c);
        Aluno n = new Aluno("C","Vittorio");
        hash1.inserir(n);

        for (int i = 0; i < hash1.getTabela().length; i++) {
            System.out.println(i + " - " + hash1.getTabela()[i]);
        }
    }

    public static void buscaraluno (String s,boolean usarid, Hash1 hash1){
        Aluno pesquisa = hash1.buscar(s,usarid);
        if (pesquisa == null){
            System.out.println("Aluno não encontrado");
        } else {
            System.out.println(pesquisa.getNome());
        }
    }

    public static void removeraluno (String s,boolean usarid, Hash1 hash1){
        Aluno removido = hash1.remover(s,usarid);
        if (removido == null){
            System.out.println("Aluno não encontrado");
        } else {
            System.out.println(removido.getNome());
        }
    }
}