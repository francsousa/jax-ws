package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

import br.com.caelum.estoque.services.RelatorioService;

public class PublicaWebService {
	
	public static void main(String[] args) {
		
		// EstoqueWS service = new EstoqueWS();
		RelatorioService service = new RelatorioService();
		// String url = "http://localhost:8080/estoquews";
		String url = "http://localhost:8080/relatorioservice";
		
		System.out.println("Service rodando " + url + "?wsdl");
		
		Endpoint.publish(url, service);
	}
}
