package GrafoSimples;

public class Aresta{

	private Vertice v1;
	private Vertice v2;
	private String valor;

	// construtor
	public Aresta(Vertice v1, Vertice v2, String valor){
		this.v1 = v1;
		this.v2 = v2;
		this.valor = valor;
	}

	// getters
	public Vertice getV1(){
		return v1;
	}
	public Vertice getV2(){
		return v2;
	}
	public String getValor(){
		return valor;
	}

	// setters
	public void setV1(Vertice v){
		this.v1 = v;
	}
	public void setV2(Vertice v){
		this.v2 = v;
	}
	public void setValor(String v){
		this.valor = v;
	}

}