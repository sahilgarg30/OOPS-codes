import java.util.Scanner;
class NumericFns<T extends Number>{
	T num;
	NumericFns(T n){num=n;}
	double reciprocal(){
		return 1/num.doubleValue();
	}
	double fraction(){return num.doubleValue()-num.intValue();}
	
	boolean absEqual(NumericFns<?>ob){
		return (Math.abs(num.doubleValue())==Math.abs(ob.num.doubleValue()));
	}
}
class BoundsDemo{
	public static void main(String args[]){
		NumericFns<Double> iOb = new NumericFns<Double>(5.23);
		System.out.println("Reciprocal = "+iOb.reciprocal()+"\nFractional Part = "+iOb.fraction());
		NumericFns<Double> iOb2 = new NumericFns<Double>(5.23);
		System.out.println("values same :" + iOb.absEqual(iOb2));
	}
}
