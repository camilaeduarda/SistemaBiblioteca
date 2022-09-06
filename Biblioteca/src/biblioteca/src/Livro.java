package biblioteca.src;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dtLancamento;

    public Livro(String titulo){ //Titulo é obrigatorio
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDtLancamento() {
        return this.dtLancamento;
    }

    public void setDtLancamento(LocalDate dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    @Override
    public String toString(){
        return (
            "Titulo:\t" + 
            this.titulo +
            "\nEditora\t" +
            this.editora +
            "\nData de Lançamento\t" +
            this.dtLancamento);
    }

    public static Livro cadastrarLivro() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o título do livro: ");
        String titulo = in.next();
        if (titulo.length() < 2) {
            System.out.println("O título deve ter ao menos 2 caracteres!");
            return null;
        }
        Livro novoLivro = new Livro(titulo);

        System.out.print("Digite a editora do livro: ");
        novoLivro.setEditora(in.next());

        System.out.print("Digite a data de lançamento (dd/mm/yyyy): ");
        String data = in.next();
        String dtLanc[] = data.split("/");
        
        for (String d : dtLanc) System.out.println(d);

        if (dtLanc.length != 3) {
            System.out.println("Digite a data corretamente!");
            in.close();
            return null;
        }

        int dd = Integer.parseInt(dtLanc[0]);
        int m = Integer.parseInt(dtLanc[1]);
        int y = Integer.parseInt(dtLanc[2]);

        LocalDate d = LocalDate.of(y, m, dd);
        in.close();
        return novoLivro;
    }
}
