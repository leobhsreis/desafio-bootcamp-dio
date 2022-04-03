package desafio.dio.poo.dominio;

import java.time.LocalDate;

public class Main {

   
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao: curso java");
        curso1.setCargaHoraria(8);
        
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        System.out.println(curso1);
        System.out.println(curso2);
        
        Mentoria ment1 = new Mentoria();
        ment1.setTitulo("Mentoria 1");
        ment1.setDescricao("Primeira parte");
        ment1.setData(LocalDate.now());
        System.out.println(ment1);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(ment1);
        
        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Leonardo: "+devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        System.out.println("Conteudos concluidos de Leonardo: "+devLeonardo.getConteudoConcluidos());
        System.out.println("XP: "+devLeonardo.calcularTotalXp());
        
        Dev devBento = new Dev();
        devBento.setNome("Bento");
        devBento.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Bento: "+devBento.getConteudosInscritos());
        devBento.progredir();
        System.out.println("Conteúdos concluidos de Bento: "+devBento.getConteudoConcluidos());
        System.out.println("XP: "+devBento.calcularTotalXp());
        
                
        
    }
    
}
