/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.sisacad.Model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Aluno extends Pessoa {
    public String cursos;
    public List<Curso> curso = new ArrayList<>();
    
    public Aluno(String nome, String cpf, String matricula){
        super(nome, cpf, matricula);        
    }
    
        public Aluno(String nome, String cpf, String matricula, Curso curso){
        super(nome, cpf, matricula);
        this.curso.add(curso);
        cursos = cursos + curso.getNome();

    }
    
    public void adicionarCurso(Curso curso){        
        this.curso.add(curso);
        cursos = cursos + " " + curso.getNome();
    }
    
    @Override
    public String toString() {
        return "Aluno{" + super.toString() + " cursos = " + cursos + '}';
    }

    public void sortCurso(List<Curso> curso) {
        Collections.sort(curso);
    }    
    
    public int compareTo(Aluno outroAluno) {
        if( this.getNome().compareToIgnoreCase(outroAluno.getNome()) < 0 ){
            return -1;
        } else if (this.getNome().compareToIgnoreCase(outroAluno.getNome()) > 0) {
            return 1;
        }
        return 0;
    }
    
}
