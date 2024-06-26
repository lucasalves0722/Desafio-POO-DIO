import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Desafio POO");
        curso1.setDescricao("Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Collections");
        curso2.setDescricao("Collections Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Curso Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularXp());

        System.out.println("-----");

        Dev devYanca = new Dev();
        devYanca.setNome("Yanca");
        devYanca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos Yanca:" + devYanca.getConteudosInscritos());
        devYanca.progredir();
        devYanca.progredir();
        devYanca.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incritos Yanca:" + devYanca.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Yanca:" + devYanca.getConteudosConcluidos());
        System.out.println("XP:" + devYanca.calcularXp());
    }
}