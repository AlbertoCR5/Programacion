package Banco;

public class CuentaCredito extends Cuenta {
	
	//Atributos
	private int credito;
	
	//Constructor
	public CuentaCredito (double saldo, String titular, int credito) throws CuentaException {
		
		super(saldo, titular);
		
		if(credito <= 0) {
			throw new CuentaException("Credito incorrecto " + credito);	
		}
		this.credito = credito;
		
	}

	public int getCredito() {

		return credito;
	}

	@Override
	public String toString() {	   //getSaldo()
		return super.toString() + "CuentaCredito " + super.getSaldo() + " y Cliente " + getTitular() + ", tiene un credito " + credito;
	}
	
	//Para sobreescribir un metodo de la clase de donde se hereda CUENTA
	public void realizarReintegro(double reintegro) throws CuentaException {
		
		double maximoDineroASacar;
		
		maximoDineroASacar = super.getSaldo() + credito;
		if (reintegro <= 0) {
			throw new CuentaException("Errot, no puedes retirar una cantidad negativa");
		}
		
		if (reintegro > maximoDineroASacar) {
			throw new CuentaException("No puede sacar la cantidad " + reintegro);
		}
		
		saldo = saldo - reintegro;
	}
	
}