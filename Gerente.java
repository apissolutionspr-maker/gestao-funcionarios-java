

public class Gerente extends Funcionario implements Bonificavel{

    private String nivel;


  public Gerente (int id, String nome, String cpf, double salario, String cargo, String nivel) {
     super(id, nome, cpf, salario, cargo);
     this.nivel = nivel;
     
    
  }

  


  public String getNivel() {
	  return nivel;
  }

@Override
public double calcularBonificacao() {
    return getSalario() * 20/100;
}



}
