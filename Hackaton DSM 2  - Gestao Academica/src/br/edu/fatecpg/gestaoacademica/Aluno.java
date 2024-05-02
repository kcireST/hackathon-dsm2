package br.edu.fatecpg.gestaoacademica;
import java.util.*;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private final int maxDisciplinas = 5;
    final Disciplina[] disciplina = new Disciplina[maxDisciplinas];

    public Aluno(String nome,String matricula,int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getDisciplinas(int num){
          return this.disciplina[num].getNome();

    }

    public void mostraDisciplinas(){
        for(int i = 0;i < maxDisciplinas;i++){
            System.out.println("Codigo da disciplina: " + this.disciplina[i].getCdDisciplina());
            System.out.println("Nome da disciplina: " + this.disciplina[i].getNome());
        }
    }

    public void historicoEscolar(){
        for(int i = 0;i < maxDisciplinas;i++){
            System.out.println("Codigo da disciplina: " + this.disciplina[i].getCdDisciplina());
            System.out.println("Nome da disciplina: " + this.disciplina[i].getNome());
            System.out.println("Nota da disciplina: " + this.disciplina[i].getNota());
        }
    }

    public void registraDisciplinas(){
        Scanner scan = new Scanner(System.in);
        String cod,nome;
        for(int i = 0;i< maxDisciplinas;i++){
            System.out.println("Digite o codigo da disciplina: ");
            cod = scan.nextLine();
            System.out.println("Digite o nome da disciplina: ");
            nome = scan.nextLine();
            this.disciplina[i] = new Disciplina(cod,nome);

        }
    }

    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
