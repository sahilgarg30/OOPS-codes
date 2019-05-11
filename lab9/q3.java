import java.util.Scanner;
class GenMethDemo{
	static <T> void printArray(T a[]){
		for(T ele:a){
			System.out.println(ele + "\t");
		}
	}
	
	public static void main(String args[]){
		Integer nums[] = {11,121,32,112,44};
		printArray(nums);
		String names[] = {"ab","bba","ccc"};
		printArray(names);
	}
}
