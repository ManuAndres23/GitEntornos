package github;

import java.util.Objects;
public class CalcResta {
	private int a;
	private int b;
	private int res;



	public CalcResta(int a, int b, int res){
	}
	public CalcResta(int a, int b) {
		this.a=a;
		this.b=b;
		res=this.a+this.b;
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
	@override
	public String toString() {
		return "CalcResta";
	}
}
