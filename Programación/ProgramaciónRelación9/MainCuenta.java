import Banco.CuentaCredito;
import Banco.CuentaException;

public class MainCuenta {

	public static void main(String[] args) {

		try {
			CuentaCredito cc = new CuentaCredito(3000, "AlbertoCastro", 200);

			System.out.println(cc.getSaldo());
			System.out.println(cc.getTitular());
			System.out.println(cc.getCredito());

			cc.realizarIngreso(500);
			System.out.println(cc);
			cc.realizarReintegro(3600);
			System.out.println(cc);

		} catch (CuentaException e) {

			System.out.println(e.getMessage());
		}

	}

}
