/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.sisacad.Model;

import java.util.ArrayList;
import java.util.List;
import sistema.sisacad.exceptions.SalarioInvalidoException;


public class Professor extends Pessoa {
    double salario;
    private String cursos = "";
    public List<Curso> curso = new ArrayList<>();

        
    public Professor(String nome, String cpf, String matricula){
        super(nome, cpf, matricula);        
    }
    
    public Professor(String nome, String cpf, String matricula, Curso curso){
        super(nome, cpf, matricula);
        this.curso.add(curso);
        cursos = cursos + " " + curso.getNome();
        }
    
    public void adicionarCurso(Curso curso) throws SalarioInvalidoException{        
        this.curso.add(curso);
        calculaSalario();
        cursos = cursos + " " + curso.getNome();
    }
        
    @Override
        public String toString() {            
            return "Professor{" + super.toString() + " salario = " + salario + " cursos = " + cursos + '}';
            }
            
    public double getSalario() {
        return salario;
    }

    public void calculaSalario() throws SalarioInvalidoException {
        salario = 0;
        for (int i=0; i < curso.size(); i++) {
            salario = salario + curso.get(i).getHoras() * 50;
        }
        if (salario <= 0) {
            throw new SalarioInvalidoException("Salário Inválido", 2);
        }
    }
    
    public int compareTo(Professor outroProfessor) {
        if( this.getNome().compareToIgnoreCase(outroProfessor.getNome()) < 0 ){
            return -1;
        } else if (this.getNome().compareToIgnoreCase(outroProfessor.getNome()) > 0) {
            return 1;
        }
        return 0;
    }
    }