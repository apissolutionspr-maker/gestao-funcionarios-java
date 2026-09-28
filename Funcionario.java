

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private double salario;
    private String cargo;




  public Funcionario(int id, String nome, String cpf, double salario, String cargo) {
     this.id = id;
     this.nome = nome;
     this.cpf = cpf;
     this.salario = salario;
     this.cargo = cargo;
     
    
  }


  public int getId() {
	  return id;
  }


  public String getNome() {
	  return nome;
  }


  public String getCpf() {
	  return cpf;
  }


  public Double getSalario() {
	  return salario;
  }


  public String getCargo() {
	  return cargo;
  }

  public double getSalarioAnual() {
    return salario * 12;
  }

    void aumentarSalario(double percentual) {

      if (percentual <= 0){
         throw new IllegalArgumentException("valor invalido");
      }else{
        salario += salario / 100 * percentual;
  
    }
  }


}