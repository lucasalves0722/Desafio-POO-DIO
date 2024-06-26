package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //Atributos:
    private int cargaHoraria;

    //Método abstrato:
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //Método construtor:
    public Curso() {
    }

    //Getters and Setters:
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //toString

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
