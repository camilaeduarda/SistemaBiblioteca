//import java.time.LocalDate;

public class Estudante extends Pessoa {
    //String nome;
    //LocalDate dtNascimento;
    private String ra;
    private String curso;

    public Estudante(String _ra, String _nome){
        this.ra = _ra;
        this.nome = _nome;
    }

    public String getRa(){
        return this.ra;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setRa(String ra){
        this.ra = ra;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String toString(){
        return "Nome: \t\t\t "+ this.nome +"\nRA:\t\t\t "+ this.ra +"\nCurso: \t\t\t "+ this.curso +"\nData de Nascimento:\t"+ this.dtNascimento;

    }
}
