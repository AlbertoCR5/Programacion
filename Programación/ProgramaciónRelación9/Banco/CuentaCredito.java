package Banco;

public class CuentaCredito extends Cuenta {
	
	private static final double CREDITO_MINIMO = 100;
	private static final double CREDITO_DEFECTO = 500;

	// Atributos
	private double credito;

	// Constructor
	public CuentaCredito(String titular) {
		
		super(titular);
		this.credito = CREDITO_MINIMO;
	}
	
	public CuentaCredito(String titular, double saldo, double credito) throws CuentaException {

		super(titular, saldo);

		if (credito < CREDITO_MINIMO) {
			throw new CuentaException("Credito incorrecto " + credito);
		}
		this.credito = credito;

	}

	
	public double getCredito() {

		return credito;
	}	

	@Override
	public String toString() { // getSaldo()
		return super.toString() + ", tiene un credito " + credito;
	}

	// Para sobreescribir un metodo de la clase de donde se hereda CUENTA
	public void realizarReintegro(double reintegro) throws CuentaException {

		double maximoDineroASacar;

		maximoDineroASacar = super.getSaldo() + credito;
		if (reintegro <= 0) {
			throw new CuentaException("Error, no puedes retirar una cantidad negativa");
		}

		if (reintegro > maximoDineroASacar) {
			throw new CuentaException("No puede sacar la cantidad " + reintegro);
		}
		
		if (saldo >= 0) {
			credito = CREDITO_DEFECTO;
		}
		
		if (saldo <= 0) {
			credito = (int) (credito + saldo);
			saldo = 0;
		}
		
		
		saldo = saldo - reintegro;
		
		super.contadorReintegros++;

	}

}