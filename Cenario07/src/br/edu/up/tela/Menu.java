package br.edu.up.tela;

import br.edu.up.controles.PessoaController;
import br.edu.up.modelos.*;

import java.util.*;

public class Menu {
    private PessoaController controller;

    public Menu() {
        controller = new PessoaController();
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Adicionar Aluno");
            System.out.println("3. Adicionar Disciplina");
            System.out.println("4. Listar Pessoas");
            System.out.println("5. Listar Disciplinas");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProfessor(scanner);
                    break;
                case 2:
                    adicionarAluno(scanner);
                    break;
                case 3:
                    adicionarDisciplina(scanner);
                    break;
                case 4:
                    listarPessoas();
                    break;
                case 5:
                    listarDisciplinas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    private void adicionarProfessor(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Identificação Lattes: ");
        String identificacaoLattes = scanner.nextLine();

        System.out.print("Instituição da titulação: ");
        String instituicao = scanner.nextLine();
        System.out.print("Ano de conclusão: ");
        int anoConclusao = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome do título obtido: ");
        String nomeTitulo = scanner.nextLine();
        System.out.print("Título do trabalho de conclusão: ");
        String tituloTrabalhoConclusao = scanner.nextLine();

        Titulacao titulacao = new Titulacao(instituicao, anoConclusao, nomeTitulo, tituloTrabalhoConclusao);
        Professor professor = new Professor(nome, rg, matricula, identificacaoLattes, titulacao);
        controller.adicionarPessoa(professor);

        System.out.println("Professor adicionado com sucesso!");
    }

    private void adicionarAluno(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Ano de ingresso: ");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Turno: ");
        String turno = scanner.nextLine();

        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
        controller.adicionarPessoa(aluno);

        System.out.println("Aluno adicionado com sucesso!");
    }

    private void adicionarDisciplina(Scanner scanner) {
        System.out.print("Nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Identificador: ");
        String identificador = scanner.nextLine();
        System.out.print("Currículo: ");
        String curriculo = scanner.nextLine();

        System.out.print("Quantidade de competências necessárias: ");
        int qntCompNecessarias = scanner.nextInt();
        scanner.nextLine();
        List<String> competenciasNecessarias = new ArrayList<>();
        for (int i = 0; i < qntCompNecessarias; i++) {
            System.out.print("Competência necessária " + (i + 1) + ": ");
            competenciasNecessarias.add(scanner.nextLine());
        }

        System.out.print("Quantidade de competências complementares: ");
        int qntCompComplementares = scanner.nextInt();
        scanner.nextLine();
        List<String> competenciasComplementares = new ArrayList<>();
        for (int i = 0; i < qntCompComplementares; i++) {
            System.out.print("Competência complementar " + (i + 1) + ": ");
            competenciasComplementares.add(scanner.nextLine());
        }

        System.out.print("Nome do professor que ministra a disciplina: ");
        String nomeProfessor = scanner.nextLine();
        Professor professor = null;
        for (Pessoa pessoa : controller.listarPessoas()) {
            if (pessoa instanceof Professor && pessoa.getNome().equals(nomeProfessor)) {
                professor = (Professor) pessoa;
                break;
            }
        }

        if (professor == null) {
            System.out.println("Professor não encontrado!");
            return;
        }

        List<AlunoDisciplina> alunosDisciplina = new ArrayList<>();
        System.out.print("Quantidade de alunos matriculados na disciplina: ");
        int qntAlunos = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < qntAlunos; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            String nomeAluno = scanner.nextLine();
            Aluno aluno = null;
            for (Pessoa pessoa : controller.listarPessoas()) {
                if (pessoa instanceof Aluno && pessoa.getNome().equals(nomeAluno)) {
                    aluno = (Aluno) pessoa;
                    break;
                }
            }

            if (aluno == null) {
                System.out.println("Aluno não encontrado!");
                return;
            }

            System.out.print("Competência necessária atingida (true/false): ");
            boolean competenciaNecessariaAtingida = scanner.nextBoolean();
            System.out.print("Competência complementar atingida (true/false): ");
            boolean competenciaComplementarAtingida = scanner.nextBoolean();
            scanner.nextLine();

            AlunoDisciplina alunoDisciplina = new AlunoDisciplina(aluno, competenciaNecessariaAtingida, competenciaComplementarAtingida);
            alunosDisciplina.add(alunoDisciplina);
        }

        Disciplina disciplina = new Disciplina(nome, identificador, curriculo, competenciasNecessarias,
                competenciasComplementares, professor, alunosDisciplina);
        controller.adicionarDisciplina(disciplina);

        System.out.println("Disciplina adicionada com sucesso!");
    }

    private void listarPessoas() {
        List<Pessoa> pessoas = controller.listarPessoas();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getMatricula());
        }
    }

    private void listarDisciplinas() {
        List<Disciplina> disciplinas = controller.listarDisciplinas();
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome() + " - " + disciplina.getIdentificador());
        }
    }
}
