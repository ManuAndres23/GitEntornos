package github;

import java.util.Objects;
public class Calculadora {
	private int a;
	private int b;
	private int res;
	public Calculadora(int a, int b){
		this.a=a;
		this.b=b;
		res=this.a*this.b;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public void bienvenida(){
		System.out.println("Bienvenido a nuestra calculadora");
	}
	public void adios(){
		System.out.println("Adios");
	}
}
