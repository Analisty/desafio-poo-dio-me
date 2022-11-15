package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
               private String nome;
               private String descricao;
               private final LocalDate dataInicio = LocalDate.now();
               private final LocalDate dataFinal = dataInicio.plusDays(45);
               private Set<Dev> devsIncritos = new HashSet<>();
               private Set<Conteudo> conteudos = new LinkedHashSet<>();

               public String getNome() {
                               return nome;
               }
               public String getDescricao() {
                               return descricao;
               }
               public LocalDate getDataInicio() {
                               return dataInicio;
               }
               public LocalDate getDataFinal() {
                               return dataFinal;
               }
               public Set<Dev> getDevsIncritos() {
                               return devsIncritos;
               }
               public Set<Conteudo> getConteudos() {
                               return conteudos;
               }

               public void setNome(String nome) {
                               this.nome = nome;
               }
               public void setDescricao(String descricao) {
                               this.descricao = descricao;
               }
               public void setConteudos(Set<Conteudo> conteudos) {
                               this.conteudos = conteudos;
               }
               public void setDevsIncritos(Set<Dev> devsIncritos) {
                               this.devsIncritos = devsIncritos;
               }
               
               public  boolean  equals ( Object  o ) {
                if ( this == o ) return  true ;
                if ( o == null || getClass ( ) != o.getClass ( )) return false ; 
                Bootcamp  bootcamp = ( Bootcamp ) o ;
                return Objects.equals ( nome , bootcamp.nome ) && Objects.equals ( descricao , bootcamp . descricao ) 
                && Objects.equals ( getDataInicio(), bootcamp . getDataFinal() ) && Objects . equals ( dataFinal , bootcamp . dataFinal )
                && Objects.equals(bootcamp, bootcamp) && Objects.equals( getDevsIncritos() , bootcamp. getDevsIncritos() )
                && Objects.equals ( conteudos , bootcamp . conteudos );
    }

                public  int  hashCode () { 
                return Objects.hash ( nome , descricao , getDataInicio() , dataFinal , getDevsIncritos() , conteudos );
    }


                
}
