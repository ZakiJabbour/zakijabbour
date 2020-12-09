
package projetofinal;

/**
 *
 * @author zakij
 */
public class Atacante extends Jogador {
    private int ritmo;
    private int finalizacao;
    private int drible;
    
    
    public Atacante(){
        
    }
    
    public Atacante(String nome, int idade, double salario, String contrato, 
            int ritmo, int finalizacao, int drible){    

        super(nome, idade, salario, contrato);
        this.ritmo = ritmo;
        this.finalizacao = finalizacao;
        this.drible = drible;
        
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
    
    public int getRitmo(){
    return ritmo;    
    }
    
    public void setRitmo(int ritmo){
      this.ritmo = ritmo;  
    }
    
    public int getFinalizacao(){
    return finalizacao;    
    }
    
     public void setFinalizacao(int finalizacao){
      this.finalizacao = finalizacao;  
    }
     
     public int getDrible(){
    return drible;    
    }
     
     public void setDrible(int drible){
      this.drible = drible;  
    }
    
    @Override
    public void imprimir(){
        System.out.println("\nAtacante: ");
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Contrato: " + contrato);
        System.out.println("Ritmo: " + ritmo);
        System.out.println("Finalização: " + finalizacao);
        System.out.println("Drible: " + drible);
    }
    
}
