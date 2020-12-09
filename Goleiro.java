
package projetofinal;

/**
 *
 * @author zakij
 */
public class Goleiro extends Jogador{
    
    private double altura;
    private int elasticidade;
    private int posicionamento;
    
    
public Goleiro(){
    
}    
    
public Goleiro(String nome, int idade, double salario, String contrato, 
            double altura, int elasticidade, int posicionamento){    
    
    super(nome, idade, salario, contrato);
    this.altura = altura;
    this.elasticidade = elasticidade;
    this.posicionamento = posicionamento;
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
    
    public double getAltura(){
    return altura;    
    }

    public void setAltura(double altura){
      this.altura = altura;  
    }

     public int getElasticidade(){
    return elasticidade;    
    }
     
     public void setElasticidade(int elasticidade){
      this.elasticidade = elasticidade;  
    }
     
     public int getPosicionamento(){
    return posicionamento;    
    }
     
     public void setPosicionamento(int posicionamento){
      this.posicionamento = posicionamento;  
    }
    
@Override
    public void imprimir(){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Contrato: " + contrato);
        System.out.println("Altura: " + altura);
        System.out.println("Elasticidade: " + elasticidade);
        System.out.println("Posicionamento: " + posicionamento);
        
    }


}
