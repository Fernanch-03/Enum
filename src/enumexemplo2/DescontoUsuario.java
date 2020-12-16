/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumexemplo2;

/**
 *
 * @author Fernando
 */
public enum DescontoUsuario {

 
    DESCONTOCOMUM(10),DESCONTOVIP(30);
    
    private int valor;
    
    DescontoUsuario(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return this.valor;
    }
}
