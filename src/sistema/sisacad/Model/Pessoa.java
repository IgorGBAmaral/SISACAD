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
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String cpf;
    private String matricula;
    
    public Pessoa(String nome, String cpf, String matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return " " + "nome = " + nome + ", cpf = " + cpf + ", matricula = " + matricula + '}';
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        if( this.getNome().compareToIgnoreCase(outraPessoa.getNome()) < 0 ){
            return -1;
        } else if (this.getNome().compareToIgnoreCase(outraPessoa.getNome()) > 0) {
            return 1;
        }
        return 0;
    }
    
    
}