package co.edu.uniquindio.poo.model;

public class DeporivoDiesel extends VehiculoDiesel {

    private Integer numeroPasajeros;
    private Integer numeroPuertas;
    private Integer numeroBolsasAire;
    private Integer caballosFuerza;
    private Float tiempoCienKmh;

    public DeporivoDiesel(String idVehiculo, String marca, String modelo, Integer cambios, Float velocidadMaxima, Float cilindraje, Transmision transmision, Estado estado, Integer numeroPasajeros,
            Integer numeroPuertas, Integer numeroBolsasAire, Integer caballosFuerza, Float tiempoCienKmh) {
        super(idVehiculo, marca, modelo, cambios, velocidadMaxima, cilindraje, transmision, estado);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoCienKmh = tiempoCienKmh;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Integer getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(Integer numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public Integer getCaballosFuerza() {
        return caballosFuerza;
    }
    public void setCaballosFuerza(Integer caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public Float getTiempoCienKmh() {
        return tiempoCienKmh;
    }
    public void setTiempoCienKmh(Float tiempoCienKmh) {
        this.tiempoCienKmh = tiempoCienKmh;
    }

    @Override
    public String toString() {
        return "DeportivoDiesel{idVehiculo='" + getIdVehiculo() + "', marca='" + getMarca() + "', modelo='" + getModelo() + "', cambios=" + getCambios() + ", velocidadMaxima=" + getVelocidadMaxima() + ", cilindraje=" + getCilindraje() + ", transmision=" + getTransmision() + ", estado=" + getEstado() + ", numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", numeroBolsasAire=" + numeroBolsasAire + ", caballosFuerza=" + caballosFuerza + ", tiempoCienKmh=" + tiempoCienKmh + "}";
    }
}