
class Main {

public static void main(String[] args) {
    Funcionario pessoa1 = new Funcionario(5, "joão","12345678900", 15000,"desenvolvedor");
    Funcionario pessoa2 = new Funcionario(3, "igor","123456774", 10000,"desenvolvedor web");
    Funcionario pessoa3 = new Funcionario(2, "maria","123456777", 8000,"desenvolvedor java");
    Gerente pessoa4 = new Gerente(1, "Paulo", "88888888", 20000,"gerente", "Senior");


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

    System.out.println(pessoa3.getId());
    System.out.println(pessoa3.getNome());
    System.out.println(pessoa3.getCpf());
    System.out.println(pessoa3.getSalario());
    System.out.println(pessoa3.getCargo());

    System.out.println(pessoa4.getId());
    System.out.println(pessoa4.getNome());
    System.out.println(pessoa4.getCpf());
    System.out.println(pessoa4.getSalario());
    System.out.println(pessoa4.getCargo());
    System.out.println(pessoa4.getNivel());

    System.out.println(pessoa1.getSalarioAnual());
    System.out.println(pessoa2.getSalarioAnual());
    System.out.println(pessoa3.getSalarioAnual());

  

    System.out.println(pessoa1.getSalario());

      pessoa1.aumentarSalario(10);

    System.out.println(pessoa1.getSalario());

    System.out.println(pessoa2.getSalario());

      pessoa2.aumentarSalario(5);

    System.out.println(pessoa2.getSalario());

    System.out.println(pessoa3.getSalario());

      pessoa3.aumentarSalario(-8);

    System.out.println(pessoa3.getSalario());

    

  }
}



