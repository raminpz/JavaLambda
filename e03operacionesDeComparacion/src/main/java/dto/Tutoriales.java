package dto;

public class Tutoriales {

    private Integer idTutirial;
    private String titulo;
    private String tipo;
    private Double precio;
    private Integer vendidos;

    public Tutoriales() {
    }

    public Tutoriales(Integer idTutirial, String titulo, String tipo, Double precio,Integer vendidos) {
        this.idTutirial = idTutirial;
        this.vendidos = vendidos;
        this.precio = precio;
        this.tipo = tipo;
        this.titulo = titulo;
    }

    public Integer getIdTutirial() {
        return idTutirial;
    }

    public void setIdTutirial(Integer idTutirial) {
        this.idTutirial = idTutirial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getVendidos() {
        return vendidos;
    }

    public void setVendidos(Integer vendidos) {
        this.vendidos = vendidos;
    }
}
