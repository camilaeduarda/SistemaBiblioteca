import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
       Estudante objCamila = new Estudante("08337672161", "Camila");
       objCamila.setCurso("Análise e Desenvolvimento de Stistemas");
       objCamila.setDtNascimento(LocalDate.of(2003, Month.JANUARY, 24));
       //Estudante objMathews = new Estudante("2022302010", "Mathews");
       Funcionario objFunc1 = new Funcionario("010101", true);
       objFunc1.setNome("Beto");
       objFunc1.setMatricula("010101");
       objFunc1.setStatus(true);
       //Funcionario objFunc2 = new Funcionario("020202", "False ");
       Autor objAutor1 = new Autor("Jose", 7, "Medicina");
       //Autor objAutor2 = new Autor("Joao", "Robotica");

       Livro l = new Livro();
       l.setTitulo("Programando em Java");
       l.setAnoLancamento(2022);
       l.setEditora("Editora xyz");
       l.setNpag(220);
       l.setAutor(objAutor1);

        Emprestimo novoEmprestimo = new Emprestimo(l, objFunc1, objCamila);

       System.out.println(objCamila);
       System.out.println("_____________________________________________________________");
       System.out.println(objFunc1);
       System.out.println("_____________________________________________________________");
       System.out.println(objAutor1);
       System.out.println("_____________________________________________________________");
       System.out.println(novoEmprestimo);
    }
}
