
package projetofinal;

/**
 *
 * @author zakij
 */
public class Zagueiro extends Jogador{
    
    private int forca;
    private int defesa;
    
    
public Zagueiro(){
    
}    
    
    
public Zagueiro(String nome, int idade, double salario, String contrato, 
            int forca, int defesa){
    
    super(nome, idade, salario, contrato);
    this.forca = forca;
    this.defesa = defesa;
    
}    


public String getNome(){
    return nome;    
    }
    
    public void setNome(String nome){
      this.nome = nome;  
    }
    
    public int getIdade(){
    return idade;    
    }
    
    public void setIdade(int idade){
      this.idade = idade;  
    }
    
    public double getSalario(){
    return salario;    
    }
    
    public void setSalario(double salario){
      this.salario = salario;  
    }
    
    public String getContrato(){
    return contrato;    
    }
    
    public void setContrato(String contrato){
      this.contrato = contrato;  
    }
    
    public int getForca(){
    return forca;    
    }
    
    public void setForca(int forca){
      this.forca = forca;  
    }
    
    public int getDefesa(){
    return defesa;    
    }
    
    public void setDefesa(int defesa){
      this.defesa = defesa;  
    }
    
    @Override
    public void imprimir(){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Contrato: " + contrato);
        System.out.println("Força: " + forca);
        System.out.println("Defesa: " + defesa);
        
    }
    
}
