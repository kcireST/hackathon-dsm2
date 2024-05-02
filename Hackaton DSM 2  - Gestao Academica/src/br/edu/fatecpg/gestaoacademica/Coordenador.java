package br.edu.fatecpg.gestaoacademica;

public class Coordenador extends Professor{
    private String curso;

    public Coordenador(String nome, String materia,String curso) {
        super(nome, materia);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
