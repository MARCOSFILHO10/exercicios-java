//# Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//# Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
//# 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//# a. salário bruto.
//# b. quanto pagou ao IPRF
//# c. quanto pagou ao INSS.
//# d. quanto pagou ao sindicato.
//# e. o salário líquido.
//# f. o valor descontado.

package exercicio1;

public class CalcularSalario {

public double valorHora;
	
	public int horasTrabalhadas;
	
	public static double salarioBruto(double valorHora, int horasTrabalhadas) {
		return valorHora * horasTrabalhadas;	
	}
	public static void main(String[] args) {
		salarioBruto(5, 220);
		System.out.println("O valor do salário bruto é:");
		double SalBruto = (salarioBruto(5, 220));
		System.out.println (SalBruto);
		System.out.println("O valor do IRPF é:");
		double Irpf = (valorIrpf (1100, 0.11));
		System.out.println (Irpf);
		System.out.println("O valor do INSS:");
		double Inss = (valorInss (1100, 0.08));
		System.out.println (Inss);
		System.out.println("O valor do SIND:");
		double Sind = (valorSind (1100, 0.05));
		System.out.println (Sind);
		System.out.println("O valor dos descontos é:");
		System.out.println (Irpf + Inss + Sind);
		System.out.println ("O valor do salario liquido é:");
		System.out.println (SalBruto - Irpf - Inss - Sind);
	}
	
	
	public static double valorIrpf (double salarioBruto, double valorIrpf) {
		return salarioBruto * valorIrpf;	
	}
	
	public static double valorInss (double salarioBruto, double valorInss) {
		return salarioBruto * valorInss;
	}
	public static double valorSind (double salarioBruto, double  valorSind) {
		return salarioBruto * valorSind;
	}

	
	}

	
