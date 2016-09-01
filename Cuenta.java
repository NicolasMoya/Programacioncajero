package cajero;

public class Cuenta {

	private int NumCuenta;
	private int NumCliente;
	private String Tipodecuenta;
        private Transaccion transaccion[];
        private Tarjeta tarjeta;

    public Cuenta() {
    }
	private double Saldo;

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getNumCliente() {
        return NumCliente;
    }

    public void setNumCliente(int NumCliente) {
        this.NumCliente = NumCliente;
    }

    public String getTipodecuenta() {
        return Tipodecuenta;
    }

    public void setTipodecuenta(String Tipodecuenta) {
        this.Tipodecuenta = Tipodecuenta;
    }

    public Transaccion[] getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion[] transaccion) {
        this.transaccion = transaccion;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Cuenta(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

   

        
	public void ConsultarCuenta() {
		// TODO - implement Cuenta.ConsultarCuenta
		throw new UnsupportedOperationException();
	}

}
