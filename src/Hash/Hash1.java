package Hash;

public class Hash1 extends HashPai {

    public Hash1(int tamanho) {
        setTabela(new Aluno[tamanho]);
        setTamanho(tamanho);
    }

    @Override
    public void inserir(Aluno aluno) {
        int posicao;
        if(aluno.getMatricula() == null){
            posicao = func_hash(Integer.toString(aluno.getId()));
        } else {
            posicao = func_hash(aluno.getMatricula());
        }

        if (temcolisao(posicao)){
            if (verificarcarga()){
                expandir();
            }
            for (int i = 0; i < getTabela().length; i++){
                if (!temcolisao(i)){
                    setaluno(i,aluno);
                    break;
                }
            }
        } else {
            if (verificarcarga()){
                expandir();
            }
            setaluno(posicao, aluno);
        }
    }

    @Override
    public Aluno buscar(String identificador, boolean id) {
        int posicao = func_hash(identificador);
        Aluno encontrado = getaluno(posicao);
        if (id){
            if (encontrado != null){
                if (Integer.parseInt(identificador) == encontrado.getId()){
                    return encontrado;
                }
            }
            for (int i = 0; i < getTabela().length; i++){
                if (getaluno(i) != null) {
                    if (Integer.parseInt(identificador) == getaluno(i).getId()) {
                        return getaluno(i);
                    }
                }
            }
        } else {
            if (encontrado != null){
                if (identificador == encontrado.getMatricula()){
                    return encontrado;
                }
            }
            for (int i = 0; i < getTabela().length; i++){
                if (getaluno(i) != null) {
                    if (identificador == getaluno(i).getMatricula()){
                        return getaluno(i);
                    }
                }
            }
        }
        return null; // precisar tratar o null no main
    }

    @Override
    public Aluno remover(String matricula) {
        return null;
    }

    @Override
    public void expandir(){
        int tamanho_novo = getTamanho() * 2;
        Aluno[] temp = getTabela();
        setTabela(new Aluno[tamanho_novo]);
        setTamanho(tamanho_novo);
        for (int i = 0; i < temp.length; i++){
            if (temp[i] != null){
                inserir(temp[i]);
            }
        }
    }
}
