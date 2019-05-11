package p1;
import java.util.Scanner;
public class Max{
	public static int max(int a,int b,int c){
		if(a>b){
			if(a>c) return a;
			return c;
		}
		else{
			if(b>c) return b;
			return c;
		}
	}
	public static float max(float a,float b,float c){
		if(a>b){
			if(a>c) return a;
			return c;
		}
		else{
			if(b>c) return b;
			return c;
		}
	}
	public static int max(int a[]){
		int c=-32000;
		for(int i=0;i<a.length;i++){
			if(a[i]>c) c=a[i];
		}
		return c;
	}
	public static int max(int a[][]){
		int c=-32000;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
			if(a[i][j]>c) c=a[i][j];
		}
		return c;
	}
}
