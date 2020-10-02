//# Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
//# Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda,
//# 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
//# a. sal�rio bruto.
//# b. quanto pagou ao IPRF
//# c. quanto pagou ao INSS.
//# d. quanto pagou ao sindicato.
//# e. o sal�rio l�quido.


package exercicio1;

public class CalcularSalario {

public double valorHora;
	
	public int horasTrabalhadas;
	
	public static double salarioBruto(double valorHora, int horasTrabalhadas) {
		return valorHora * horasTrabalhadas;	
	}
	public static void main(String[] args) {
		salarioBruto(5, 220);
		System.out.println("O valor do sal�rio bruto �:");
		double SalBruto = (salarioBruto(5, 220));
		System.out.println (SalBruto);
		System.out.println("O valor do IRPF �:");
		double Irpf = (valorIrpf (1100, 0.11));
		System.out.println (Irpf);
		System.out.println("O valor do INSS:");
		double Inss = (valorInss (1100, 0.08));
		System.out.println (Inss);
		System.out.println("O valor do SIND:");
		double Sind = (valorSind (1100, 0.05));
		System.out.println (Sind);
		System.out.println("O valor dos descontos �:");
		System.out.println (Irpf + Inss + Sind);
		System.out.println ("O valor do salario liquido �:");
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

	
