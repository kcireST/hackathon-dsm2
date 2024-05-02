package br.edu.fatecpg.gestaoacademica;
import java.util.*;

public class Professor {
    private String nome;
    private String nomeMateria;
    private int tam = 10;
    private Aluno[] alunos = new Aluno[tam];

    public Professor(String nome, String materia){
        this.nome = nome;
        this.nomeMateria = materia;
    }

    public void registraNota(Aluno aluno){
        Scanner scan = new Scanner(System.in);
        float nota;
        System.out.println("Digite a nota do aluno:");
        nota = scan.nextFloat();
        for(int i = 0;i < 5;i++){
        if(Objects.equals(nomeMateria, aluno.getDisciplinas(i))){
            aluno.disciplina[i].setNota(nota);
         }
        }


    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos() {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        String matricula;
        for(int i = 0;i<tam;i++){
            System.out.println("Digite o nome do aluno");
            nome = scan.nextLine();
            System.out.println("Digite a matricula do aluno");
            matricula = scan.nextLine();
            System.out.println("Digite a idade do aluno");
            idade = scan.nextInt();
            this.alunos[i].setIdade(idade);
            this.alunos[i].setNome(nome);
            this.alunos[i].setMatricula(matricula);
        }

    }
}
