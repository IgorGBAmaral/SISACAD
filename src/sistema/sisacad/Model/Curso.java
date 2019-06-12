/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.sisacad.Model;

public class Curso implements Comparable<Curso>{
    public String nome;
    public int horas;
    
    public Curso(String nome, int horas){
        this.nome = nome;
        this.horas = horas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }           

    @Override
    public int compareTo(Curso outroCurso) {
        if( this.getNome().compareToIgnoreCase(outroCurso.getNome()) < 0 ){
            return -1;
        } else if (this.getNome().compareToIgnoreCase(outroCurso.getNome()) > 0) {
            return 1;
        }
        return 0;
    }
}