package Hash;

public class Aluno {
    private int id;
    private String matricula;
    private String nome;

    public Aluno(int id,String nome) {
        this.id = id; //Lembrar de impedir id negativo no main
        this.nome = nome;
    }

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.id = -1; //Lembrar de impedir id negativo no main
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "id=" + id +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
