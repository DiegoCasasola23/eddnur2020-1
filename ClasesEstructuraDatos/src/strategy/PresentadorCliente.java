package strategy;

public class PresentadorCliente implements IPresentador{

	@Override
	public String toString(Cliente cliente) {
		return "Buenos d�as " + cliente.getNombre() +
				", el monto de su deuda es de " + cliente.getDeuda();
	}

}
