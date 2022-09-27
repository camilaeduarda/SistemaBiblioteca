import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Funcionario func;
    private Estudante estudante;

    private LocalDate dtEmprestimo;
    private LocalDate dtdevolucao;
    
    private final int DIAS_EMPRESTIMO = 5;

    public Emprestimo(Livro _livro, Funcionario _funcionario, Estudante _estudante){
        this.livro = _livro;
        this.func = _funcionario;
        this.estudante = _estudante;
        this.dtEmprestimo = LocalDate.now();
        this.dtdevolucao = this.dtEmprestimo.plusDays(DIAS_EMPRESTIMO);
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Funcionario getFunc() {
        return this.func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public LocalDate getDtEmprestimo() {
        return this.dtEmprestimo;
    }

    public void setDtEmprestimo(LocalDate dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }

    public LocalDate getDtdevolucao() {
        return this.dtdevolucao;
    }

    public void setDtdevolucao(LocalDate dtdevolucao) {
        this.dtdevolucao = dtdevolucao;
    }

    public int getDIAS_EMPRESTIMO() {
        return this.DIAS_EMPRESTIMO;
    }
}