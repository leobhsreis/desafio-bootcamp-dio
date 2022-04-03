package desafio.dio.poo.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
  
 public void inscreverBootcamp(Bootcamp bootcamp){
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
 } 
 public void progredir(){
     Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
     if(conteudo.isPresent()){
         this.conteudoConcluidos.add(conteudo.get());
         this.conteudosInscritos.remove(conteudo.get());
     }
     else{
         System.err.println("Você não está matriculado em nenhum conteúdo.");
     }
 }
 
 public double calcularTotalXp(){
    return this.conteudoConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.conteudosInscritos);
        hash = 79 * hash + Objects.hashCode(this.conteudoConcluidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudosInscritos, other.conteudosInscritos)) {
            return false;
        }
        return Objects.equals(this.conteudoConcluidos, other.conteudoConcluidos);
    }
 
}
