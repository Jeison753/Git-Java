

package pruebas.libro;

 class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
}
    
     public void leerPagina() {
     System.out.println("Estas leyendo una pagina");
    }
    
    public void cerrarLibro() {
     System.out.println("Estas cerrando el libro");
    }
    
    public void mostrarDatos(){
     System.out.println("titulo:" + titulo);
     System.out.println("autor:" + autor);
     System.out.println("numeroPaginas:" + numeroPaginas);
    }
 }
