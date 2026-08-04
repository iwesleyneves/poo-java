//marley

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }

    public void exibirEstado() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + (disponivel ? "Disponível" : "Emprestado"));
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "978-85-359-0277-7");

        livro.exibirEstado();
        livro.emprestar();
        livro.exibirEstado();
        livro.emprestar();
        livro.devolver();
        livro.exibirEstado();
    }
}