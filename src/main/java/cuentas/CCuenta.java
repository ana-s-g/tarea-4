package cuentas;

/**
 * 
 * @author Ana Martín Álvarez
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor de la clase con parámetros
     * @param nom nombre del cliente
     * @param cue numero de cuenta
     * @param sal saldo inicial
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * @return devuelve el saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * ingresa la cantidad pasada por parametros siempre que sea mayor que 0
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad a ingresar es menor que 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * resta la cantidad al saldo existe y actualiza la cantidad saldo 
     * con el resultado obtenido 
     * @param cantidad cantidad a ingresar 
     * @throws Exception  si la cantidad a ingresar es menor o igual a 0 o el
     * resultado de la resta de cantidad y saldo es menora al saldo existente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
