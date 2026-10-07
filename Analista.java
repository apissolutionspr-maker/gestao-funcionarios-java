

public class Analista extends Funcionario implements Bonificavel{
    private String tipoAnalise;





  public Analista (int id, String nome, String cpf, double salario, String cargo, String tipoAnalise) {
     super(id, nome, cpf, salario, cargo);
     this.tipoAnalise = tipoAnalise;
     
    
  }


  public String getTipoAnalise() {
	  return tipoAnalise;
  }

  
  public double calcularBonificacao() {
      return getSalario() * 8/100;
  }



}