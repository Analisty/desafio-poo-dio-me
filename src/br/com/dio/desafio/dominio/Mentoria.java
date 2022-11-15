package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo {
            
            private LocalDate data;
           
            public LocalDate getData() {
                        return data;
            }
            
            public void setData(LocalDate data) {
                        this.data = data;
            }

            public double calcularXP(){
                return XP_PADRAO + 20d;
            }

            @Override
            public String toString() {
                         return  "Curso{" + "titulo : ' " + getTitulo() + '\''+ " Descrição : " + getDescricao() + '\'' + " Carga Horária " +  data  + '}';
            }
            
            
}
