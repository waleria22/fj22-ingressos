package br.com.caelum.model.descontos;

import java.math.BigDecimal;

public class DescontosParaEstudantes implements Desconto  {
 @Override
 public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal){
	 return precoOriginal.divide(new BigDecimal("2.0"));
	 
 }
 @Override
 public String getDescricao(){
	 return "Estudante";
 }
}
