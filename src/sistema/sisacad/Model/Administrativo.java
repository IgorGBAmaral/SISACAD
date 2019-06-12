/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.sisacad.Model;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class Administrativo extends Pessoa {
    public double salario;

    public Administrativo(String nome, String cpf, String matricula, double salario){
        super(nome, cpf, matricula);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Administrativo{" + super.toString() + "salario = " + salario + '}';
    }


    public int compareTo(Administrativo outroAdministrativo) {
        if( this.getNome().compareToIgnoreCase(outroAdministrativo.getNome()) < 0 ){
            return -1;
        } else if (this.getNome().compareToIgnoreCase(outroAdministrativo.getNome()) > 0) {
            return 1;
        }
        return 0;          
    }
    
    
}
    
   