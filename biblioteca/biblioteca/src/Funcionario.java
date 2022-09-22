//import java.time.LocalDate;

public class Funcionario extends Pessoa {
    //String nome;
    //LocalDate dtNascimento;
    String matricula;
    boolean status;

    public Funcionario(String _matricula, boolean _status){
        this.matricula = _matricula;
        this.status = _status;
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
}
