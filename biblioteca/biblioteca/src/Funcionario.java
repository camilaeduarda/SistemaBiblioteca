import java.util.Scanner;

//import java.time.LocalDate;

public class Funcionario extends Pessoa {
    //String nome;
    //LocalDate dtNascimento;
    private String matricula;
    private boolean status;

    public Funcionario(String _nome, String _matricula){
        this.matricula = _matricula;
        this.nome = _nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public boolean isStatus(){
        return this.status;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String toString(){
        return "Nome: \t\t\t "+ this.nome +"\nMatricula: \t\t\t "+ this.matricula +"\nStatus: \t\t\t "+ this.status;

    }

    public static Funcionario lerFuncionario() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário:");
        String nome = in.nextLine();


        System.out.print("Digite a matricula do funcionario:");
        String matricula = in.nextLine();
        
        Funcionario objFuncionario = new Funcionario(matricula, nome);

        return objFuncionario;
    }
}
