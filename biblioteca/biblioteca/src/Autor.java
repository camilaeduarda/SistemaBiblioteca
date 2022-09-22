//import java.time.LocalDate;

public class Autor extends Pessoa {
    //String nome;
    //LocalDate dtnascimento;
    private int qtoLivros;
    private String area;

    public Autor(String _nome, int _qtoLivros, String _area){
        this.nome = _nome;
        this.qtoLivros = _qtoLivros;
        this.area = _area;
    }

    public int getqtoLivros(){
        return this.qtoLivros;
    }

    public String getArea(){
        return this.area;
    }

    public void setqtoLivros(int qtoLivros){
        this.qtoLivros = qtoLivros;
    }

    public void setArea(String area){
        this.area = area;
    }

    public String toString(){
        return "Nome: \t\t\t "+ this.nome +"\nQto Livros:\t\t\t "+ this.qtoLivros +"\nArea: \t\t\t "+ this.area;

    }
}
