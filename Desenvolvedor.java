

public class Desenvolvedor extends Funcionario implements Bonificavel {
    private String linguagemPrincipal;





  public Desenvolvedor (int id, String nome, String cpf, double salario, String cargo, String linguagemPrincipal) {
     super(id, nome, cpf, salario, cargo);
     this.linguagemPrincipal = linguagemPrincipal;
     
    
  }


  public String getLinguagemPrincipal() {
	  return linguagemPrincipal;
  }

  @Override
  public double calcularBonificacao() {
      return getSalario() * 10/100;
  }



}