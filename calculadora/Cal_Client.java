package calculadora;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
import java.net.BindException;
import java.net.MalformedURLException;
import java.net.URL;

public class Cal_Client {

	static Cal_SIB calc;


	public static void main(String[] args) throws MalformedURLException, BindException {

		publicaServico();
		
		URL url = new URL("http://127.0.0.1:2525/calculadora?wsdl");
		QName qname = new QName("http://calculadora/","Cal_SIB");
		Service ws = Service.create(url, qname);
		calc = ws.getPort(Cal_SEI.class);

		System.out.println("Soma (345+435): " + calc.soma(345,435));
    System.out.println("Subtracao (789-67): " + calc.subtracao(789,67));
    System.out.println("Multiplicacao (99*6): " + calc.multiplicacao(99,6));
    System.out.println("Divisao (80/5): " + calc.divisao(80,5));
}
	
	public static void publicaServico() throws BindException{
		try {
			Endpoint.publish("http://127.0.0.1:2525/calculadora", new Cal_SIB());
		} catch (Exception e) {
				System.out.println("Já está em uso");
		}
	}
}