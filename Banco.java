package cajero;

public class Banco {

	private int NumBanco;
	private String Nombre;
	private String Direccion;
	private int Telefono;
        private Cajero cajero[];
        private Cuenta cuenta[];
            
        Cuenta cu = new Cuenta();
	public void verificarTransaccion() {
		// TODO - implement Banco.verificarTransaccion
		throw new UnsupportedOperationException();
	}

	public void VerificarCuenta() {
	int numcuent;
        int numclient;
                
            System.out.println("\nsu cuenta : \nnumero de cuenta :"+cu.getNumCuenta()+ 
                    "\nNumero de cliente : " + cu.getNumCliente() + "\n");
            
	}

	public void VerificarSaldo() {
		
                System.out.println("su saldo es : " + cu.getSaldo());
	}

}
