import java.util.List;
import java.util.ArrayList;

class Main1 {

public static void main(String[] args) {
    List <Funcionario> funcionarios = new ArrayList<>();
    List<Bonificavel> bonificavels = new ArrayList<>();
    Funcionario pessoa1 = new Funcionario(5, "joão","12345678900", 15000,"desenvolvedor");
    Gerente pessoa2 = new Gerente(5, "Paulo","88888888", 20000,"gerente", "Senior");
    Desenvolvedor pessoa3 = new Desenvolvedor(8, "Maria","88885555", 8000,"desenvolvedor", "java");
    Analista pessoa4 = new Analista(8, "Maria","88885555", 8000,"desenvolvedor", "java");



    funcionarios.add(pessoa1);
    funcionarios.add(pessoa2);
    funcionarios.add(pessoa3);
    funcionarios.add(pessoa4);

    bonificavels.add(pessoa2);
    bonificavels.add(pessoa3);
    bonificavels.add(pessoa4);



    for (Funcionario funcionario : funcionarios) {
       System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCargo());
         System.out.println(funcionario.getSalario());

        }

      for (Bonificavel bonificavel : bonificavels) {
       System.out.println(bonificavel.calcularBonificacao());
       

        }

    System.out.println(pessoa1.getId());
    System.out.println(pessoa1.getNome());
    System.out.println(pessoa1.getCpf());
    System.out.println(pessoa1.getSalario());
    System.out.println(pessoa1.getCargo());

    System.out.println(pessoa2.getId());
    System.out.println(pessoa2.getNome());
    System.out.println(pessoa2.getCpf());
    System.out.println(pessoa2.getSalario());
    System.out.println(pessoa2.getCargo());
    System.out.println(pessoa2.getNivel());

    System.out.println(pessoa3.getId());
    System.out.println(pessoa3.getNome());
    System.out.println(pessoa3.getCpf());
    System.out.println(pessoa3.getSalario());
    System.out.println(pessoa3.getCargo());
    System.out.println(pessoa3.getLinguagemPrincipal());

    System.out.println(pessoa4.getId());
    System.out.println(pessoa4.getNome());
    System.out.println(pessoa4.getCpf());
    System.out.println(pessoa4.getSalario());
    System.out.println(pessoa4.getCargo());
    System.out.println(pessoa4.getTipoAnalise());

  }
}



