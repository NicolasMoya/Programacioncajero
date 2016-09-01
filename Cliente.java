package cajero;



public class Cliente {

	private int Num_Cliente;
	private int Identificacion;
	private String Nombre;
	private String Direccion;
	private int Telefono;
        private Tarjeta tarjeta;
        private Cuenta cuenta[];

    public Cliente() {
        this.Num_Cliente = 0 ;
        this.Identificacion = 0;
        this.Nombre = "";
        this.Direccion = "";
        this.Telefono = 0;
        
    }

    public Cliente(int Num_Cliente, int Identificacion, String Nombre, String Direccion, int Telefono /*,Tarjeta tarjeta, Cuenta cuenta*/) {
        this.Num_Cliente = Num_Cliente;
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        //this.tarjeta = tarjeta;
        //this.cuenta = cuenta;
    }

    public int getNum_Cliente() {
        return Num_Cliente;
    }

    public void setNum_Cliente(int Num_Cliente) {
        this.Num_Cliente = Num_Cliente;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    /*public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
      */  

	public void IngresarClave() {
                
                System.out.println("Ingrese su clave");
                
                
            /*System.out.println("Ingrese clave");
             a = leer.nextInt();
             if(a!= Identificacion){
             do{
                System.out.println("clave incorrecta");
                a = leer.nextInt();
                
                
            }while(a!= Identificacion);
             }else
        System.out.println("Clave correcta");
              */  
	}

	public void ElegirOpciones() {
		// TODO - implement Cliente.ElegirOpciones
		throw new UnsupportedOperationException();
	}

	public void IndicarvalorARetirar(){
       /*int sacardinero;
            int dineroactual;
            Cuenta caj= new Cuenta();
            
            caj.getSaldo()=dineroactual;
            System.out.println("Dinero actual : "+dineroactual);
            System.out.println("ingrese valor a retirar :");
            
            if(dineroactual<sacardinero || sacardinero>0){
            	System.out.println("saldo insuficiente, ingrese nuevamente el monto");
            		
            }else
           	caj.setSaldo(dineroactual-sacardinero);
         */   
	}

}
