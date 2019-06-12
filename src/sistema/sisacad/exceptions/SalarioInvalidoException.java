/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.sisacad.exceptions;

public class SalarioInvalidoException extends Exception
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int codigoErro;

    /**
     * COnstrutor para objetos da classe SalarioInvalidoException
     */
    public SalarioInvalidoException(String message, int codigoErro)
    {
        super(message);
        this.codigoErro = codigoErro;
    }
    
    public int getCodigoErro() {
        return codigoErro;
    }

    public void setCodigoErro(int codigoErro) {
        this.codigoErro = codigoErro;
    }

    
    
}