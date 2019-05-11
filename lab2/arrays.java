import java.util.Scanner;

class Arrays{
	static void reverse(int a[]){
		for(int i=0;i<a.length/2;i++){
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-i-1]=temp;
		}
	}

	static void bubbleSort(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}	
	static int[] insert(int a[],int no,int pos){

		if(pos>a.length) pos = a.length;
		if(pos<1) pos = 1;

		int n = a.length,i;
		int b[] = new int[n+1];
		for(i=0;i<pos-1;i++){
			b[i]=a[i];
		}	
		b[i]=no;
		for(i=pos-1;i<n;i++){
			b[i+1]=a[i];
		}
		return b;
	}	
	static int[] delete(int a[],int pos){
		int n = a.length;
		int b[] = new int[n-1];
		for(int i=0;i<pos-1;i++){
			b[i]=a[i];
		}	
		for(int i=pos-1;i<n-1;i++){
			b[i]=a[i+1];
		}
		return b;
	}
	static void linearSearch(int a[],int no){
		int i;
		for(i=0;i<a.length;i++){
			if(no==a[i])
			break;
		}
		if(i==a.length) System.out.println("The element searched does not exist.");
		else System.out.println("Element found at position - "+(i+1));
	}
	static void printArray(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}	
		System.out.println("");
	}

	static void printPrime(int a[]){
		for(int i=0;i<a.length;i++){
			if(isPrime(a[i])) 
				System.out.print(a[i]+"\t");		
		}		
		System.out.println("");
	}
	static boolean isPrime(int a){
		for(int i=2;i<a;i++)
			if(a%i==0)	
			return false;
	return true;
	}
	
	static void secondLarge(int a[]){
		int small,smalls,large,larges;
		large=larges=a[0];
		small=smalls=32000;
		if(a.length<2) System.out.println("Array is too small.");
		else{
			for(int i=0;i<a.length;i++){
				if(a[i]>large) {larges = large; large = a[i];}
				else if(a[i]>larges) larges = a[i];
				
				if(a[i]<small) {smalls = small; small = a[i];}
				else if(a[i]<smalls) smalls = a[i];
			}
			System.out.println("The second largest is "+larges+" and the second smallest is "+smalls);		
		}			
	}	

	public static void main(String args[]){
		System.out.println("Please enter no of elements in array - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Please enter all the n numbers of array - ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		//reverse(a);
		//bubbleSort(a);
		printPrime(a);
		secondLarge(a);
		/* 
		System.out.println("Please enter the element to be searched - ");
		int search = sc.nextInt();
		linearSearch(a,search);
		*/
		
		/*
		System.out.println("Please enter the element to be inserted and its position- ");
		int ins = sc.nextInt();
		int pos = sc.nextInt();
		a = insert(a,ins,pos);
		*/

		System.out.println("Please enter the position of element to be deleted - ");
		int pos = sc.nextInt();
		if(pos<0 || pos>a.length) System.out.println("Position is not in range.");
		else a = delete(a,pos);

		printArray(a);
	}
}
