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
public class Usuarios extends Pessoa{
      
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Pagamento(String NomeProduto, double desconto, double valor){
        System.out.println("Saldo atual: "+this.getSaldo());
        System.out.println("Produto a ser comprado: "+NomeProduto);
        System.out.println("Valor de pagamento: "+valor);
        System.out.println("Desconto de: "+desconto+"%");
        double valorFinal = valor*(desconto/100);
        System.out.println("Valor final do produto: "+valorFinal);
        
        if(this.saldo >= valorFinal){
            this.saldo = this.saldo - valor*(desconto/100);
            System.out.println("Saldo restante: "+this.getSaldo());
        }else{
            System.out.println("Você está quebrado demais para comprar esse produto");
        }
        System.out.println("");
        
    }
    
    @Override
    public void Pessoa(){}
}
