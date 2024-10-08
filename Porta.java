package porta;

public class Porta {
	
	private String tipoPorta;
	private int quantPorta;
	private double precoPorta;
	
	public String getTipoPorta() {
		return tipoPorta;
	}
	public void setTipoPorta(String tipoPorta) {
		this.tipoPorta = tipoPorta;
	}
	public int getQuantPorta() {
		return quantPorta;
	}
	public void setQuantPorta(int quantPorta) {
		this.quantPorta = quantPorta;
	}
	public double getPrecoPorta() {
		return precoPorta;
	}
	public void setPrecoPorta(double precoPorta) {
		this.precoPorta = precoPorta;
	}

public void clientePorta() {
	System.out.println("Consumidor final");
}

public void nomeCliente(String nome) {
	System.out.println(nome);
	System.out.println(this.tipoPorta);
	System.out.println(this.quantPorta);
	System.out.println(this.precoPorta);
}

}
