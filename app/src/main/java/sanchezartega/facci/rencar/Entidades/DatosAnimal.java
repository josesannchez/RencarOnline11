package sanchezartega.facci.rencar.Entidades;

public class DatosAnimal {

    private String titulo, ubicacion, descripcion, urlFoto, tipoAnimal, nombreUsuario, fecha;

    public DatosAnimal(String titulo, String ubicacion, String descripcion, String urlFoto, String tipoAnimal, String nombreUsuario, String fecha) {
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
        this.tipoAnimal = tipoAnimal;
        this.nombreUsuario = nombreUsuario;
        this.fecha = fecha;
    }

    public DatosAnimal() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
