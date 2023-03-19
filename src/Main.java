import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        //System.out.println(curso1);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

       //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("João");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();

        System.out.println();
        System.out.println("Conteudos Inscritos" + dev.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos Concluidos" + dev.getConteudosConcluidos());
        System.out.println("XP " + dev.calcularTotalXp());

        System.out.println();

        Dev dev1 = new Dev();
        dev1.setNome("Maira");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());
        dev1.progredir();

        System.out.println();
        System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos Concluidos" + dev1.getConteudosConcluidos());
        System.out.println("XP " + dev1.calcularTotalXp());
    }
}
