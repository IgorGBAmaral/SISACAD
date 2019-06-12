/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.sisacad;

import Debug.test_CriarObjetos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import sistema.sisacad.Model.Administrativo;
import sistema.sisacad.Model.Aluno;
import sistema.sisacad.Model.Professor;
import sistema.sisacad.exceptions.SalarioInvalidoException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SistemaSISACAD {

   
    public static void main(String[] args) throws SalarioInvalidoException {
        int controle = 0;        
        Scanner ler = new Scanner(System.in);
        String mat;
        test_CriarObjetos test = new test_CriarObjetos();
        
        test.Povoar();
                
        System.out.println("Consultar dados de uma pessoa: ");
        mat = ler.next();
        
        
        List<Administrativo> administrativo = test.getListAdministrativo();
        List<Aluno> aluno = test.getListAluno();
        List<Professor> professor = test.getListProfessor();
       
        
        
        for (int i=0; i < administrativo.size(); i++){
            if (mat.equalsIgnoreCase(administrativo.get(i).getMatricula()) ) {
                System.out.println("Matricula encontrada, " + administrativo.get(i).toString() );
                controle = 1;                
            }
        }
        for (int i=0; i < aluno.size(); i++){
            if (mat.equalsIgnoreCase(aluno.get(i).getMatricula()) ) {
                System.out.println("Matricula encontrada, " + aluno.get(i).toString() );
                controle = 1; 
            }
        }    
        for (int i=0; i < professor.size(); i++){
            if (mat.equalsIgnoreCase(administrativo.get(i).getMatricula()) ) {
                System.out.println("Matricula encontrada, " + professor.get(i).toString() );
                controle = 1;                
            } 
        }    
        if (controle == 0) {
            System.out.println("Matricula não encontrada");            
        }    
        
        
    }
    
}
