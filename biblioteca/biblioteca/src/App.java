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

       System.out.println(objCamila);
       System.out.println("_____________________________________________________________");
       System.out.println(objFunc1);
       System.out.println("_____________________________________________________________");
       System.out.println(objAutor1);
    }
}
