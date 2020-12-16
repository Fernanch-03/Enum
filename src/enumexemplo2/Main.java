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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DescontoUsuario dc = DescontoUsuario.DESCONTOCOMUM;
        DescontoUsuario dv = DescontoUsuario.DESCONTOVIP;
        Usuarios u1 = new Usuarios();
        Usuarios u2 = new Usuarios();
        
        
        u1.setNome("Borges");
        u1.setSaldo(1000.00);
        u1.Pagamento("Coca-Cola", dc.getValor(), 300.00);
        
        
        
        u2.setNome("Carlos");
        u2.setSaldo(1000.00);
        u2.Pagamento("Coca-Cola", dv.getValor(), 300.00);
    }
    
}
