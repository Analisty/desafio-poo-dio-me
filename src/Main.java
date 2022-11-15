import java.time.LocalDate;
import java.util.Set;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();

        curso1.setTitulo(" Curso Java ");
        curso1.setDescricao(" Descrição curso  java ");
        curso1.setCargaHoraria(8);

     

        Curso curso2 = new Curso();
        curso2.setTitulo(" Curso JS ");
        curso2.setDescricao(" Descrição curso  java scrip ");
        curso2.setCargaHoraria( 13 );

        //Polimorfismo
        Conteudo conteudo = new Curso(); {
            
        };
        

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Curso java");
        mentoria.setData(LocalDate.now());

        System.out.println("Curso 1" + curso1);
        System.out.println("Curso 2 " + curso2);
        System.out.println("Mentoria " + mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA DEVELOPER");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcamp);
        System.out.println(" Conteúdo Inscritos Dev Renato: " + devRenato.getConteudosInscritos());
        devRenato.progredir();
        devRenato.progredir();
        System.out.println(" Conteúdo concluídos Dev Renato: " + devRenato.getConteudosConcluidos());
        System.out.println("XP: " + devRenato.calcularTotalXP());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(" Conteúdo Inscritos Dev Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println(" Conteúdo concluídos Dev Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());
    }
}
