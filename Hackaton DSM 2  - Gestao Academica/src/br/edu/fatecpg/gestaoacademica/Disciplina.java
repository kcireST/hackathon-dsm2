package br.edu.fatecpg.gestaoacademica;

public class Disciplina {
    private String cdDisciplina;
    private String nomeDisciplina;
    private float nota;

    public Disciplina(String codigo,String nome){
        this.cdDisciplina = codigo;
        this.nomeDisciplina = nome;
    }

    public String getCdDisciplina() {
        return cdDisciplina;
    }

    public void setCdDisciplina(String cdDisciplina) {
        this.cdDisciplina = cdDisciplina;
    }

    public String getNome() {
        return nomeDisciplina;
    }

    public void setNome(String nome) {
        this.nomeDisciplina = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
