import java.util.ArrayList;

public class Livros {

    private String nomelivro;
    private String autor;
    private String categoria;

    private ArrayList<String> livros;

    public String getNomelivro() {
        return nomelivro;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getLivros() {
        return livros;
    }

    public ArrayList<String> setLivros() {
        this.livros = livros;

        return null;
    }

    public void imprimir(){
        System.out.println("nome do livro: "+ getNomelivro() + " Autor do livro: " + getAutor() + " Categoria: " + getCategoria());
    }

    public ArrayList<String> listalivros(Livros livros){
        return this.getLivros();
    }
    public void atualizar(){

    }


}