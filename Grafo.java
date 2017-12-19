package GrafoSimples;

import java.util.ArrayList;

public class Grafo{

	ArrayList<Vertice> vertices = new ArrayList<Vertice>();
    ArrayList<Aresta> arestas = new ArrayList<Aresta>();

    public void inserirVertices(Vertice vertice) {
		vertices.add(vertice);
	}

	public void inserirArestas(Aresta aresta) {
		arestas.add(aresta);
	}

	public void excluirAresta(Aresta aresta) {
		for(int i = 0; i < arestas.size(); i++){
			if(arestas.get(i) == aresta){
				arestas.remove(i);
			} 
		}
	}

	//ok
	public void excluirVertices(Vertice v1) {
		//excluir aresta
        for (int i = 0; i < arestas.size(); i++) {
        	if (v1 == arestas[i].getV1() || v1 == arestas[i].getV2()){
        		arestas.remove(i);
        	}
        }

		for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i) == v1) {
                vertices.remove(i);
            }
        }

	}

	//ok
	public void oposto(Vertice v, Aresta a){
		if (a.getV1() == v){
			System.out.println(a.getV2().getValor());
		} else if (a.getV1() == v) {
			System.out.println(a.getV1().getValor());
		}
	}

	//ok
	public void isAdjacente(Vertice v1, Vertice v2){
		for (int i = 0; i < arestas.size(); i++){
			if((arestas.get(i).getV1 == v1 && arestas.get(i).getV2 == v2) ||(arestas.get(i).getV1 == v2 && arestas.get(i).getV2 == v1)){
				System.out.println("São adjacentes");
			}
		}
	}	

	//ok
	public void substituirVertice(Vertice v1, String x){
		for(int i = 0; i < vertices.size(); i++){
			if (vertices.get(i) == v1){
				vertices.get(i).setValor(x);
			}
		}
	}

	//ok
	public void arestasIncidentes(Vertice v1){
		for (int i = 0; i < arestas.size(); i++){
			if(arestas.get(i).getV1 == v1 || arestas.get(i).getV2 == v1){
				System.out.println(arestas.get(i).getValor());
			}
		}
	}

	//ok
	public void substituirAresta(Aresta a, String nome){
		for (int i = 0; i < arestas.size(); i++){
			if(arestas.get(i) == a){
				arestas.get(i).setValor(nome);
			}
		}
	}

	//ok
	public void vertices() {
		for (int i = 0; i < vertices.size(); i++){
			System.out.println(vertices.get(i).getValor());
		}
	}

	//ok
	public void arestas() {
		for (int i = 0; i < arestas.size(); i++){
			System.out.println(arestas.get(i).getValor());
		}
	}

}