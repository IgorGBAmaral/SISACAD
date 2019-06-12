/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Debug;

import java.util.ArrayList;
import java.util.List;
import sistema.sisacad.Model.Administrativo;
import sistema.sisacad.Model.Aluno;
import sistema.sisacad.Model.Curso;
import sistema.sisacad.Model.Pessoa;
import sistema.sisacad.Model.Professor;
import sistema.sisacad.exceptions.SalarioInvalidoException;

public class test_CriarObjetos
   {
    public List<Administrativo> administrativo = new ArrayList<>();
    public List<Aluno> aluno = new ArrayList<>();
    public List<Professor> professor = new ArrayList<>();


    public void Povoar() throws SalarioInvalidoException
       {
        Curso matematica = new Curso("Matematica",50);
        Curso fisica = new Curso("Fisica",40);
        Curso biologia = new Curso("Biologia",40);
        Curso portugues = new Curso("Portugues",50);
        Curso literatura = new Curso("Literatura",30);
        
        //administrativos
        Administrativo carlos = new Administrativo("Carlos", "78945721588","101", 1500);
        Administrativo joaquin = new Administrativo("Joaquin", "7698241368","102", 1700);
        Administrativo ivan = new Administrativo("Ivan", "99557788114","103", 1300);
        Administrativo tania = new Administrativo("Tania", "96325874165","104", 2500);
        Administrativo borges = new Administrativo("Borges", "45874596324","105", 3500);
        administrativo.add(ivan);
        administrativo.add(joaquin);
        administrativo.add(carlos);
        administrativo.add(tania);
        administrativo.add(borges);
        
        //alunos
        Aluno pedro = new Aluno("Pedro", "11122233345", "301");
        pedro.adicionarCurso(matematica);
        pedro.adicionarCurso(fisica);
        
        Aluno joao = new Aluno("Joao", "12345678900", "302");
        joao.adicionarCurso(portugues);
        joao.adicionarCurso(literatura);
        
        Aluno maria = new Aluno("Maria", "15344472212", "303");
        maria.adicionarCurso(fisica);
        maria.adicionarCurso(biologia);
        
        Aluno alfredo = new Aluno("Alfredo", "17845476354", "304");
        alfredo.adicionarCurso(portugues);
        alfredo.adicionarCurso(matematica);
        
        Aluno betina = new Aluno("Betina", "00001042000", "305");
        betina.adicionarCurso(matematica);
        betina.adicionarCurso(fisica);
        betina.adicionarCurso(biologia);
        betina.adicionarCurso(portugues);
        betina.adicionarCurso(literatura);
        
        aluno.add(pedro);
        aluno.add(joao);
        aluno.add(maria);
        aluno.add(alfredo);
        aluno.add(betina);

        //professores
        Professor mario = new Professor("Mario","78945612345", "201");
        mario.adicionarCurso(matematica);
        mario.adicionarCurso(fisica);
        mario.adicionarCurso(biologia);
        mario.adicionarCurso(portugues);
        mario.adicionarCurso(literatura);
        
        Professor cadu = new Professor("Cadu","78956482547", "202");
        cadu.adicionarCurso(matematica);
        cadu.adicionarCurso(fisica);
        
        Professor alberto = new Professor("Alberto","15975385245", "203");
        alberto.adicionarCurso(portugues);
        alberto.adicionarCurso(literatura);
        alberto.calculaSalario();
        
        Professor sara = new Professor("Sara","3571598675", "204");      
        sara.adicionarCurso(biologia);
        
        
        Professor epaminondas = new Professor("Epaminondas","11447753695", "205");
        epaminondas.adicionarCurso(matematica);
        epaminondas.adicionarCurso(literatura);
        
        professor.add(mario);
        professor.add(cadu);
        professor.add(alberto);
        professor.add(sara);
        professor.add(epaminondas);       
        
        System.out.println("Objetos adicionados com sucesso");
    }
    
    public List getListAdministrativo() {
        return administrativo;
    }

    public List getListAluno() {
        return aluno;
    }
    
    public List getListProfessor() {
        return professor;
    }
}