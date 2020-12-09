
package projetofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author zakij
 */
public class Times {
    private Jogador[] botafogo;
    private Jogador[] fluminense;
    private Jogador[] vasco;       
    private int qtdB;
    private int qtdF;
    private int qtdV;
    
 public Times(){
        
    }
    
 public void botafogo(){
     botafogo = new Jogador[11];
     qtdB = 0;
 }
    
 public void addBotafogo(Jogador j){
    botafogo[qtdB] = j;
    qtdB++;
         
     
 }
 
 public void fluminense(){
     fluminense = new Jogador[11];
     qtdF = 0;
 }
    
 public void addFluminense(Jogador j){
    fluminense[qtdF] = j;
    qtdF++;
         
     
 }
 
 public void vasco(){
     vasco = new Jogador[11];
     qtdV = 0;
 }
    
 public void addVasco(Jogador j){
    vasco[qtdV] = j;
    qtdV++;
         
     
 }
 
 public void imprimirV(){
     String print = "";
     int ata = 1;
     int zag = 1;
     int gol = 1;
     for(int i=0; i<qtdV; i++){
         if (vasco[i] instanceof Atacante){
            print += "\n\nAtacante " + ata;
            print += "\nNome: " + ((Atacante)vasco[i]).getNome();
            ata++;
         }else{
             if (vasco[i] instanceof Zagueiro){
            print += "\n\nZagueiro " + zag;
            print += "\nNome: " + ((Zagueiro)vasco[i]).getNome();
            zag++;
         }else{   
            print += "\n\nGoleiro " + gol;
            print += "\nNome: " + ((Goleiro)vasco[i]).getNome();           
            gol++;
             }
         
     }
     
 }
     JOptionPane.showMessageDialog(null, print);
 
}
 
 public void imprimirF(){
     String print = "";
     int ata = 1;
     int zag = 1;
     int gol = 1;
     for(int i=0; i<qtdF; i++){
         if (fluminense[i] instanceof Atacante){
            print += "\n\n\nAtacante " + ata;
            print += "\n\nNome: " + ((Atacante)fluminense[i]).getNome();
            //print += "\nIdade: " + ((Atacante)fluminense[i]).getIdade();
            //print += "\nSalário: " + ((Atacante)fluminense[i]).getSalario();
            //print += "\nContrato: " + ((Atacante)fluminense[i]).getContrato();
            //print += "\nRitmo: " + ((Atacante)fluminense[i]).getRitmo();
            //print += "\nFinalização: " + ((Atacante)fluminense[i]).getFinalizacao();
            //print += "\nDrible: " + ((Atacante)fluminense[i]).getDrible();
            ata++;
         }else{
             if (fluminense[i] instanceof Zagueiro){
            print += "\n\nZagueiro " + zag;
            print += "\nNome: " + ((Zagueiro)fluminense[i]).getNome();
            zag++;
         }else{   
            print += "\n\nGoleiro " + gol;
            print += "\nNome: " + ((Goleiro)fluminense[i]).getNome();           
            gol++;
             }
         
     }
     
 }
     JOptionPane.showMessageDialog(null, print);
 
}
 
 public void imprimirB(){
     String print = "";
     int ata = 1;
     int zag = 1;
     int gol = 1;
     for(int i=0; i<qtdB; i++){
         if (botafogo[i] instanceof Atacante){
            print += "\n\nAtacante " + ata;
            print += "\nNome: " + ((Atacante)botafogo[i]).getNome();          
            ata++;
         }else{
             if (botafogo[i] instanceof Zagueiro){
            print += "\n\nZagueiro " + zag;
            print += "\nNome: " + ((Zagueiro)botafogo[i]).getNome();
            zag++;
         }else{   
            print += "\n\nGoleiro " + gol;
            print += "\nNome: " + ((Goleiro)botafogo[i]).getNome();           
            gol++;
             }
         
     }
     
 }
     JOptionPane.showMessageDialog(null, print);
 
}
}
