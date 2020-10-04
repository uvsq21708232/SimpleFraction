public class Fraction {
	
	private int num;
	private int den;
	private double res;
	
	public Fraction(int num,int den){
		this.num = num ;
		this.den = den;
		this.res = (double)num/den;
	}
	
	public int getNum(){
		return num;
	}
	
	public int getDen(){
		return den;
	}
	
	public double getRes(){
		return res;
	}
	
	@Override
	public String toString() {
		String s = num + "/" + den + " = " + res;
		return s;
	}
}
