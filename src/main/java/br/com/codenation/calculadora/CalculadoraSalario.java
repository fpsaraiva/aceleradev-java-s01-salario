package br.com.codenation.calculadora;


public class CalculadoraSalario {

	
	
	public long calcularSalarioLiquido(double salarioBase) {
		if(salarioBase < 1039.00) {
			return 0;
		}
		
		double salarioDescontadoInss = calcularInss(salarioBase);
		double salarioLiquido = calcularIrpf(salarioDescontadoInss);
		
		return Math.round(salarioLiquido);
	}
	
	

	private double calcularInss(double salarioBase) {
		double salarioDescontadoInss = 0;
		
		if(salarioBase <= 1500) {
			return salarioDescontadoInss = salarioBase - (salarioBase * 0.08);
		} else if (salarioBase > 1500 && salarioBase <= 4000) {
			salarioDescontadoInss = salarioBase - (salarioBase * 0.09);
		} else if (salarioBase > 4000) {
			salarioDescontadoInss = salarioBase - (salarioBase * 0.11);
		}
		
		return salarioDescontadoInss;
	}
	
	private double calcularIrpf(double salarioDescontadoInss) {
		double salarioDescontadoIrpf = 0;
		
		if(salarioDescontadoInss <= 3000) {
			salarioDescontadoIrpf = salarioDescontadoInss; 
		} else if (salarioDescontadoInss > 3000 && salarioDescontadoInss <= 6000) {
			salarioDescontadoIrpf = salarioDescontadoInss - (salarioDescontadoInss * 0.075);
		} else if (salarioDescontadoInss > 6000) {
			salarioDescontadoIrpf = salarioDescontadoInss - (salarioDescontadoInss * 0.15);
		}
		
		return salarioDescontadoIrpf;
	}

}
