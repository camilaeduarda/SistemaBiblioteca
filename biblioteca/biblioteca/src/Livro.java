public class Livro {
    private String titulo;
    private int anoLancamento;
    private String editora; //deveria ser um objeto
    private int npag;
    private Autor autor; //setar como um objeto


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNpag() {
        return this.npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
 
}
