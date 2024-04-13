 package app_empresaltda;

public class Vehiculos {
    public String placaStr;
    public String descripcionStr;
    public String nombreConductorStr;
    public String rutaStr;
    public String marcaStr;
    public String modeloStr;
    
    
    public Vehiculos(String placaStr, String descripcionStr, String nombreConductorStr, String rutaStr, String marcaStr, String modeloStr) {
        this.placaStr = placaStr;
        this.descripcionStr = descripcionStr;
        this.nombreConductorStr = nombreConductorStr;
        this.rutaStr = rutaStr;
        this.marcaStr = marcaStr;
        this.modeloStr = modeloStr;
    }

    public String getPlacaStr() {
        return placaStr;
    }

    public void setPlacaStr(String placaStr) {
        this.placaStr = placaStr;
    }

    public String getDescripcionStr() {
        return descripcionStr;
    }

    public void setDescripcionStr(String descripcionStr) {
        this.descripcionStr = descripcionStr;
    }

    public String getNombreConductorStr() {
        return nombreConductorStr;
    }

    public void setNombreConductorStr(String nombreConductorStr) {
        this.nombreConductorStr = nombreConductorStr;
    }

    public String getRutaStr() {
        return rutaStr;
    }

    public void setRutaStr(String rutaStr) {
        this.rutaStr = rutaStr;
    }

    public String getMarcaStr() {
        return marcaStr;
    }

    public void setMarcaStr(String marcaStr) {
        this.marcaStr = marcaStr;
    }

    public String getModeloStr() {
        return modeloStr;
    }

    public void setModeloStr(String modeloStr) {
        this.modeloStr = modeloStr;
    }

    
    
}
