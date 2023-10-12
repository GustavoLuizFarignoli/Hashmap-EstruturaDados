public class Main {
    public static void main(String[] args) {
        Hash1 hash1 = new Hash1(7);
        Aluno a = new Aluno(1,"Marcelo");
        hash1.inserir(a);
        Aluno b = new Aluno(10,"João");
        hash1.inserir(b);
        Aluno c = new Aluno(5,"Molecote");
        hash1.inserir(c);
        Aluno n = new Aluno("10A","Vittorio");
        hash1.inserir(n);
        Aluno d = new Aluno(2,"Breno");
        hash1.inserir(d);


        for (int i = 0; i < hash1.getTabela().length; i++) {
            System.out.println(i+1 + " - " + hash1.getTabela()[i]);
        }
    }
}