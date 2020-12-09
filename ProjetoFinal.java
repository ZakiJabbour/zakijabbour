
package projetofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author zakij
 */
public class ProjetoFinal {

 
    public static void main(String[] args) {
        
        Times t1 = new Times();
        t1.fluminense();
        t1.vasco();
        t1.botafogo();
        
        Atacante a1 = new Atacante("Franklin", 21, 60000.0, "Definitivo", 97, 90, 87);
        Atacante a3 = new Atacante("Abedi", 18, 900000.0, "Definitivo", 99, 99, 98);
        Atacante a4= new Atacante ("Rudiger", 28, 10000.0, "Empréstimo", 78, 97, 52);
        
        Zagueiro z1 = new Zagueiro("Lobato", 19, 60000.0, "Definitivo", 82,80);
        Zagueiro z2 = new Zagueiro("Catatau", 23, 70000.0, "Definitivo", 50,92);
        Zagueiro z3 = new Zagueiro("Taison", 29, 20000.0, "Definitivo", 75,87);
        
        Goleiro g1 = new Goleiro("Dida", 33, 900000.0, "Definitivo", 1.95,85,98);
        Goleiro g2 = new Goleiro("Ceni", 30, 800000.0, "Definitivo", 1.93,89,95);
        Goleiro g3 = new Goleiro("Mansur", 32, 2000.0, "Empréstimo", 1.89,75,82);
        
        t1.addBotafogo(g1);
        t1.addBotafogo(z1);
        t1.addBotafogo(a1);
        t1.addFluminense(g2);
        t1.addFluminense(z2);
        t1.addFluminense(a4);
        t1.addVasco(g3);
        t1.addVasco(z3);
        t1.addVasco(a3);
        
        
       
       
        
        while (true){
            try {
                String opc = JOptionPane.showInputDialog(null,"(1) Cadastrar um Jogador\n(2) Mostrar Lista de Times\n\nDigite sua Opção:", "Menu de Opcões",JOptionPane.INFORMATION_MESSAGE);
                if(opc.equals("1")){
                    String op = JOptionPane.showInputDialog(null, "(1) Cadastrar Atacante\n(2) Cadastrar Zagueiro\n(3) Cadastrar Goleiro\n\nDigite sua Opção:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                    if(op.equals("1")){
                        Atacante a2 = new Atacante();
                        String nome = JOptionPane.showInputDialog(null, "Digite o nome:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                        a2.setNome(nome);
                        String i = JOptionPane.showInputDialog(null, "Digite a idade:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                        int idade = Integer.parseInt(i);
                        a2.setIdade(idade);
                        String s = JOptionPane.showInputDialog(null, "Digite o salário:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                        double salario = Double.parseDouble(s);
                        a2.setSalario(salario);
                        String contrato = JOptionPane.showInputDialog(null, "Digite o tipo de contrato:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                        a2.setContrato(contrato);
                        String r = JOptionPane.showInputDialog(null, "Digite o ritmo:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                        int ritmo = Integer.parseInt(r);
                        a2.setRitmo(ritmo);
                        String f = JOptionPane.showInputDialog(null, "Digite a finalização:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                        int finalizacao = Integer.parseInt(f);
                        a2.setFinalizacao(finalizacao);
                        String d = JOptionPane.showInputDialog(null, "Digite o drible:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                        int drible = Integer.parseInt(d);
                        a2.setDrible(drible);
                        String o = JOptionPane.showInputDialog(null, "(1) Botafogo\n(2) Fluminense\n(3) Vasco\n\nDigite sua Opção:", "Escolhendo time", JOptionPane.INFORMATION_MESSAGE);
                        if(o.equals("1")){
                            t1.addBotafogo(a2);
                        }else{
                            if(o.equals("2")){
                                t1.addFluminense(a2);
                            }else{
                                if(o.equals("3")){
                                    t1.addVasco(a2);
                                }
                            }
                        }
                        
                    }else{
                        if(op.equals("2")){
                            Zagueiro a2 = new Zagueiro();
                            String nome = JOptionPane.showInputDialog(null, "Digite o nome:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                            a2.setNome(nome);
                            String i = JOptionPane.showInputDialog(null, "Digite a idade:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                            int idade = Integer.parseInt(i);
                            a2.setIdade(idade);
                            String s = JOptionPane.showInputDialog(null, "Digite o salário:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                            double salario = Double.parseDouble(s);
                            a2.setSalario(salario);
                            String contrato = JOptionPane.showInputDialog(null, "Digite o tipo de contrato:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                            a2.setContrato(contrato);
                            String f = JOptionPane.showInputDialog(null, "Digite a força:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                            int forca = Integer.parseInt(f);
                            a2.setForca(forca);
                            String d = JOptionPane.showInputDialog(null, "Digite a defesa:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                            int defesa = Integer.parseInt(d);
                            a2.setDefesa(defesa);
                            String o = JOptionPane.showInputDialog(null, "(1) Botafogo\n(2) Fluminense\n(3) Vasco\n\nDigite sua Opção:", "Escolhendo time", JOptionPane.INFORMATION_MESSAGE);
                            if(o.equals("1")){
                                t1.addBotafogo(a2);
                            }else{
                                if(o.equals("2")){
                                    t1.addFluminense(a2);
                            }else{
                                if(o.equals("3")){
                                    t1.addVasco(a2);
                                }
                            }
                        }
                        }else{
                            if(op.equals("3")){
                                Goleiro a2 = new Goleiro();
                                String nome = JOptionPane.showInputDialog(null, "Digite o nome:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                                a2.setNome(nome);
                                String i = JOptionPane.showInputDialog(null, "Digite a idade:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                                int idade = Integer.parseInt(i);
                                a2.setIdade(idade);
                                String s = JOptionPane.showInputDialog(null, "Digite o salário:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                                double salario = Double.parseDouble(s);
                                a2.setSalario(salario);
                                String contrato = JOptionPane.showInputDialog(null, "Digite o tipo de contrato:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                                a2.setContrato(contrato);
                                String h = JOptionPane.showInputDialog(null, "Digite a altura:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                                double altura = Double.parseDouble(h);
                                a2.setAltura(altura);
                                String e = JOptionPane.showInputDialog(null, "Digite a Elasticidade:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                                int elasticidade = Integer.parseInt(e);
                                a2.setElasticidade(elasticidade);
                                String p = JOptionPane.showInputDialog(null, "Digite o posicionamento:", "Adicionando Jogador", JOptionPane.INFORMATION_MESSAGE);
                                int posicionamento = Integer.parseInt(p);
                                a2.setPosicionamento(posicionamento);
                                String o = JOptionPane.showInputDialog(null, "(1) Botafogo\n(2) Fluminense\n(3) Vasco\n\nDigite sua Opção:", "Escolhendo time", JOptionPane.INFORMATION_MESSAGE);
                                if(o.equals("1")){
                                    t1.addBotafogo(a2);
                                }else{
                            if(o.equals("2")){
                                t1.addFluminense(a2);
                            }else{
                                if(o.equals("3")){
                                    t1.addVasco(a2);
                                }
                            }
                        }
                            }
                        }
                    }
                    
                }else{
                    if(opc.equals("2")){
                        String op = JOptionPane.showInputDialog(null, "(1) Jogadores do Botafogo\n(2) Jogadores do Fluminense\n(3) Jogadores do Vasco\n\nDigite sua Opção:", "Mostrando Jogadores", JOptionPane.INFORMATION_MESSAGE);
                        if(op.equals("1")){
                            t1.imprimirB();                      
                        }else{
                            if(op.equals("2")){
                                t1.imprimirF();
                            }else{
                                if(op.equals("3")){
                                    t1.imprimirV();
                                }
                            }
                        }
                    }
                }
                //break;
            }catch (NullPointerException e) {
                break;
            }
        }
        
    }
    
}
