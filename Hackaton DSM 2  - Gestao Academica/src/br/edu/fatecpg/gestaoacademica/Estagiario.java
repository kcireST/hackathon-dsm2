package br.edu.fatecpg.gestaoacademica;

public class Estagiario extends Aluno{
    private String nomeEmpresa;
    private String func;

    public Estagiario(String nome, String matricula, int idade,String nomeEmp,String funcao) {
        super(nome, matricula, idade);
        this.nomeEmpresa = nomeEmpresa;
        this.func = funcao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
