package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.model.descontos.Desconto;
import br.com.caelum.model.descontos.DescontoParaBancos;
import br.com.caelum.model.descontos.DescontosParaEstudantes;
import br.com.caelum.model.descontos.SemDesconto;

public enum	TipoDeIngresso	{
		INTEIRO(new	SemDesconto()),
		ESTUDANTE(new	DescontosParaEstudantes()),
		BANCO(new	DescontoParaBancos());
		private final	Desconto	desconto;
		TipoDeIngresso(Desconto	desconto)	{
						this.desconto	=	desconto;
		}
		public	BigDecimal	aplicaDesconto(BigDecimal	valor){
						return	desconto.aplicarDescontoSobre(valor);
		}
		public	String	getDescricao(){
						return	desconto.getDescricao();
		}
}


