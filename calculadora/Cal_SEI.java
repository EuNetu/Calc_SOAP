package calculadora;

import javax.jws.webService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public interface Cal_SEI{
	@WebMethod float soma(float primeiroNumero, float segundoNumero);
	@WebMethod float subtracao(float primeiroNumero, float segundoNumero);
	@WebMethod float multiplicacao(float primeiroNumero, float segundoNumero);
	@WebMethod float divisao(float primeiroNumero, float segundoNumero);
}