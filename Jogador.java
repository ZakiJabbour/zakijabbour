package projetofinal;

/**
 *
 * @author zakij
 */
public class Jogador {
    protected String nome;
    protected int idade;
    protected double salario;
    protected String contrato;
 
    
    public Jogador(){
        
    }
    
    
    public Jogador(String nome, int idade, double salario, String contrato ){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.contrato = contrato;
        
}
    
    public void imprimir(){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Contrato: " + contrato);
    }
}
