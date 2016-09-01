/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author lab
 */
public class Crearxml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("Clientexml");
		doc.appendChild(rootElement);
                
                // Cliente
		Element Cliente = doc.createElement("Cliente");
		rootElement.appendChild(Cliente);
                Attr attr = doc.createAttribute("Num cliente");
		Cliente.setAttributeNode(attr);
                Attr attr2 = doc.createAttribute("Identidificacion");
		Cliente.setAttributeNode(attr);
                Attr attr3 = doc.createAttribute("Nombre");
		Cliente.setAttributeNode(attr);
                Attr attr4 = doc.createAttribute("Direccion");
		Cliente.setAttributeNode(attr);
                Attr attr5 = doc.createAttribute("Telefono");
		Cliente.setAttributeNode(attr);
                
                //Cuenta
                Element Cuenta = doc.createElement("Tarjeta");
		Cliente.appendChild(Cuenta);
                Attr atrclient = doc.createAttribute("Num Cuenta");
                Cuenta.setAttributeNode(atrclient);
                Attr atrclient1 = doc.createAttribute("Tipo de Cuenta");
                Cuenta.setAttributeNode(atrclient1);
                Attr atrclient2 = doc.createAttribute("Saldo");
                Cuenta.setAttributeNode(atrclient2);
                 
                // Tarjeta
                Element tarjeta = doc.createElement("Tarjeta");
		Cliente.appendChild(tarjeta);
                Attr attarj1 = doc.createAttribute("Num Tarjeta");
                tarjeta.setAttributeNode(attarj1);
                Attr attarj4 = doc.createAttribute("Fecha de expiracion");
                tarjeta.setAttributeNode(attarj4);
                
            
                
                
                
        
    }
    
}
