package br.com.caelum.model.descontos;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {
	
	public BigDecimal aplicarDescontoSobre (BigDecimal precoOriginal){
		return precoOriginal;
	}

}
