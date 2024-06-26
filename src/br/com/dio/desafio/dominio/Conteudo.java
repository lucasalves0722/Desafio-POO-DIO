package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final  double XP_PADRAO = 10d;

    //Atributos comum:
    private String titulo;
    private String descricao;

    //Método para calcularXp()
    public abstract double calcularXp();

    //Métodos getters and setters:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
