import Arvore.ArvoreBusca;
import Hash.Aluno;
import Hash.Hash1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hash1 hash1 = new Hash1(0);
        System.out.println("Bem vindo ao trabalho de Hash Table dos estudantes: Gabriel Molec; Gustavo Luiz e João Gabriel.");
        Scanner teclado_menu = new Scanner(System.in);
        System.out.println("Escolha qual hash Table você deseja executar: \n" +
        "1. Hash Table simples \n" +
        "2. Hash Table utilizando AVL");
        int op_hash = Integer.parseInt(teclado_menu.nextLine());
        switch (op_hash){
            case 1:
                boolean loop1 = true;
                while (loop1){
                    System.out.println("""
                    Digite uma das seguintes opções:
                    1. Inserção;
                    2. Busca;
                    3. Remoção;
                    4. Sair.
                    """);
                    int op1 = Integer.parseInt(teclado_menu.nextLine());
                    switch (op1){
                        case 1:     // função de Inserção.
                            inseriraluno_hash1();
                            break;
                        case 2:     // função de Busca.
                            boolean loop_busca = true;
                            while (loop_busca){
                                System.out.println(" Escolha qual dado será inserido para ser utilizado para buscar o aluno :\n" +
                                        "1. Matrícula;\n" +
                                        "2. ID.\n" +
                                        "3. Finalizar Busca");
                                int op_busca = Integer.parseInt(teclado_menu.nextLine());
                                switch (op_busca){
                                    case 1:
                                        System.out.println("Diga qual a Matrícula a ser buscada: ");
                                        String mat_busca = teclado_menu.nextLine();
                                        long Comeco_busca1 = System.nanoTime();
                                        buscaraluno_hash1(mat_busca, false, hash1);
                                        long Fim_busca1 = System.nanoTime();
                                        System.out.println("Tempo de execução (em nanosegundos): " + (Fim_busca1 - Comeco_busca1));
                                        break;
                                    case 2:
                                        System.out.println("Diga qual o número do ID a ser buscado: ");
                                        String id_busca = teclado_menu.nextLine();
                                        long Comeco_busca2 = System.nanoTime();
                                        buscaraluno_hash1(id_busca, true, hash1);
                                        long Fim_busca2 = System.nanoTime();
                                        System.out.println("Tempo de execução (em nanosegundos): " + (Fim_busca2 - Comeco_busca2));
                                        break;
                                    case 3:
                                        System.out.println("Encerrando buscas");
                                        loop_busca = false;
                                        break;
                                    default:
                                        System.out.println("Valor Inválido.\nInsira um valor válido.");
                                        break;
                                }
                            }

                            break;
                        case 3: // função de Remoção.
                            boolean loop_delete = true;
                            while (loop_delete){
                                System.out.println(" Escolha qual dado será inserido para identificar o aluno a ser excluído :\n" +
                                        "1. Matrícula;\n" +
                                        "2. ID.\n" +
                                        "3. Finalizar Busca");
                                int op_delete = Integer.parseInt(teclado_menu.nextLine());
                                switch (op_delete){
                                    case 1:
                                        System.out.println("Diga qual a Matrícula a ser deletada: ");
                                        String mat_deletar = teclado_menu.nextLine();
                                        long Comeco_delete1 = System.nanoTime();
                                        removeraluno_hash1(mat_deletar, false, hash1);
                                        long Fim_delete1 = System.nanoTime();
                                        System.out.println("Tempo de execução (em nanosegundos): " + (Fim_delete1 - Comeco_delete1));
                                        break;
                                    case 2:
                                        System.out.println("Diga qual o número do ID a ser deletado: ");
                                        String id_deletar = teclado_menu.nextLine();
                                        long Comeco_delete2 = System.nanoTime();
                                        removeraluno_hash1(id_deletar, true, hash1);
                                        long Fim_delete2 = System.nanoTime();
                                        System.out.println("Tempo de execução (em nanosegundos): " + (Fim_delete2 - Comeco_delete2));
                                        break;
                                    case 3:
                                        System.out.println("Encerrando exclusões");
                                        loop_delete = false;
                                        break;
                                    default:
                                        System.out.println("Valor Inválido.\nInsira um valor válido.");
                                        break;
                                }
                            }
                        case 4:
                            System.out.println("Saindo...");
                            loop1 = false;
                            break;
                        default:
                            System.out.println("Valor Inválido.\nInsira um valor válido.");
                            break;
                    }
                }
                break;
            case 2:
                boolean loop2 = true;
                while (loop2){
                    System.out.println("""
                    Digite uma das seguintes opções:
                    1. Inserção;
                    2. Busca;
                    3. Remoção;
                    4. Sair.
                    """);
                    int op2 = Integer.parseInt(teclado_menu.nextLine());
                    switch (op2){
                        case 1:// Função de Inserção - Hash2
                        case 2:// Função de Busca - Hash2
                        case 3:// Função de Delete - Hash2
                        case 4:
                            System.out.println("Saindo...");
                            loop2 = false;
                            break;
                        default:
                            System.out.println("Valor Inválido.\nInsira um valor válido.");
                            break;
                    }
                }
        }

    }
    public static void inseriraluno_hash1(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos a serem inseridos: ");
        int n = Integer.parseInt(teclado.nextLine());
        Hash1 hash1 = new Hash1(n);
        Aluno [] novosAlunos = new Aluno[n];
        for (int i = 0; i < n; i++) {
                System.out.println("Digite o nome do Aluno: ");
                String nome = teclado.nextLine();
                System.out.println(" Escolha qual dado será inserido para ser utilizado como identificador para o " + (i+1) + "° Aluno :\n" +
                        "1. Matrícula;\n" +
                        "2. ID.");
                int op = Integer.parseInt(teclado.nextLine());
                switch (op){
                    case 1:     // Inserção via Matricula.
                        System.out.println("Digite a matrícula do Aluno: ");
                        String mat = teclado.nextLine();
                        novosAlunos[i] = new Aluno(mat, nome);
                        long Comeco_inserir1 = System.nanoTime();
                        hash1.inserir(novosAlunos[i]);
                        long Fim_inserir1 = System.nanoTime();
                        System.out.println("Tempo de execução (em nanosegundos): " + (Fim_inserir1 - Comeco_inserir1));
                        break;
                    case 2:     // Inserção via ID;
                        System.out.println("Digite o ID do Aluno: ");
                        int id = Integer.parseInt(teclado.nextLine());
                        novosAlunos[i] = new Aluno(id, nome);
                        long Comeco_inserir2 = System.nanoTime();
                        hash1.inserir(novosAlunos[i]);
                        long Fim_inserir2 = System.nanoTime();
                        System.out.println("Tempo de execução (em nanosegundos): " + (Fim_inserir2 - Comeco_inserir2));
                        break;
                    default:
                        System.out.println("Valor Inválido.\nInsira um valor válido.");
                        break;
            }
        }
        for (int i = 0; i < hash1.getTabela().length; i++) {
            System.out.println(i + " - " + hash1.getTabela()[i]);
        }
    }

    public static void buscaraluno_hash1 (String s,boolean usarid, Hash1 hash1){
        Aluno pesquisa = hash1.buscar(s,usarid);
        if (pesquisa == null){
            System.out.println("Aluno não encontrado");
        } else {
            System.out.println(pesquisa.getNome());
        }
    }

    public static void removeraluno_hash1 (String s,boolean usarid, Hash1 hash1){
        Aluno removido = hash1.remover(s,usarid);
        if (removido == null){
            System.out.println("Aluno não encontrado");
        } else {
            System.out.println(removido.getNome());
        }
    }
}