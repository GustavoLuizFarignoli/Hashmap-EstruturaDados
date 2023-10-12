import Hash.Aluno;
import Hash.Hash1;

public class Main {
    public static void main(String[] args) {
        Hash1 hash1 = new Hash1(3);
        Aluno a = new Aluno(1,"Marcelo");
        hash1.inserir(a);
        Aluno b = new Aluno(10,"João");
        hash1.inserir(b);
        Aluno c = new Aluno(5,"Molecote");
        hash1.inserir(c);
        Aluno n = new Aluno("A","Vittorio");
        hash1.inserir(n);


        for (int i = 0; i < hash1.getTabela().length; i++) {
            System.out.println(i+1 + " - " + hash1.getTabela()[i]);
        }
    }

    public void buscaraluno (String s,boolean usarid){
        Hash1 hash1 = new Hash1(7);
        Aluno pesquisa = hash1.buscar(s,usarid);
        if (pesquisa == null){
            System.out.println("Aluno não encontrado");
        } else {
            System.out.println(pesquisa.getNome());
        }
    }
}