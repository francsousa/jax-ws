package br.com.caelum.estoque.modelo.item.teste;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.caelum.estoque.modelo.item.Item;

public class LeituraXML {
	
public static void main(String[] args) throws JAXBException {
    	
        // Item item = new Item.Builder().comCodigo("MEA").comNome("MEAN").comQuantidade(4).comTipo("Livro").build();

        JAXBContext context = JAXBContext.newInstance(Item.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        System.out.println(unmarshaller.unmarshal(new File("item.xml"))); //ou marshaller.marshal(item, System.out);        
    }
}
