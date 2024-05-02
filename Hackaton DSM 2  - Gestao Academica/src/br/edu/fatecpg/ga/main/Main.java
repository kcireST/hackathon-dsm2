package br.edu.fatecpg.ga.main;
import java.util.*;
import br.edu.fatecpg.gestaoacademica.*;

public class Main {
    public static void main(String[] args) {
        String nome,matricula,nomeP,nomeD;
        int idade;
        Scanner scanS = new Scanner(System.in);
        Scanner scanI = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = scanS.nextLine();

        System.out.println("Digite a matricula do aluno: ");
        matricula = scanS.nextLine();

        System.out.println("Digite a idade do aluno: ");
        idade = scanI.nextInt();

        System.out.println("Digite o nome do professor: ");
        nomeP = scanS.nextLine();

        System.out.println("Digite a disciplina que o professor dá: ");
        nomeD = scanS.nextLine();

        Aluno aluno1 = new Aluno(nome,matricula,idade);
        Professor prof = new Professor(nomeP,nomeD);

        aluno1.registraDisciplinas();
        prof.registraNota(aluno1);
      //aluno1.mostraDisciplinas();
        aluno1.historicoEscolar();

    }
}