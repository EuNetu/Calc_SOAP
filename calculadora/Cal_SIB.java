package calculadora;

import javax.jws.WebService;


@WebService(endpointInterface = "calculadora.Cal_SEI")
public class Cal_SIB implements Cal_SEI {
		
	public float soma(float primeiroNumero, float segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
	
	public float subtracao(float primeiroNumero, float segundoNumero) {
		return primeiroNumero - segundoNumero;
	}

	public float multiplicacao(float primeiroNumero, float segundoNumero) {
		return primeiroNumero * segundoNumero;
	}

	public float divisao(float primeiroNumero, float segundoNumero) {
		return primeiroNumero / segundoNumero;
	}

}