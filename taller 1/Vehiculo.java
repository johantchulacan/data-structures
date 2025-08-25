public class Vehiculo {

    private String marca;
    private int year;
    private String chasis;
    private int modelo;
    private boolean matriculado;

    public Vehiculo (String marca, int year , String chasis, int modelo, boolean matriculado){
        this.marca = marca;
        this.year = year;
        this.chasis = chasis;
        this.modelo = modelo;
        this.matriculado = matriculado;
    }

    public String toString(){
        return "Vehiculo [ Marca: " + marca +  " Año: " + year + " Chasis: " + chasis + " Modelo: " + modelo + " Matriculado: " + matriculado + "]";
    }

    public String iterarVehiculo(Vehiculo[] veh){
        String cad = "";
        for(int i = 0; i < veh.length; i++){
            cad += veh[i].toString() + "\n";
        }
        return cad;
    }


    
}