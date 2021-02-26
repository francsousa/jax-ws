package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

import br.com.caelum.estoque.services.RelatorioService;

public class PublicaWebService {

	public static void main(String[] args) {

		EstoqueWS estoqueService = new EstoqueWS();
		RelatorioService relatorioService = new RelatorioService();

		String urlEstoque = "http://localhost:8080/estoquews";
		String urlRelatorio = "http://localhost:8080/relatorioservice";

		System.out.println("Service rodando " + urlEstoque + "?wsdl");
		System.out.println("Service rodando " + urlRelatorio + "?wsdl");

		Endpoint.publish(urlEstoque, estoqueService);
		Endpoint.publish(urlRelatorio, relatorioService);
	}
}
