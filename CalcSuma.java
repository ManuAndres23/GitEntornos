package github;

import java.util.Objects;
public class CalcSuma {
	private int a;
	private int b;
	private int res;
	public CalcSuma(int a, int b) {
		this.a=a;
		this.b=b;
		res=this.a+this.b;
	}
	
	/*prueba rama dos*/
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}
