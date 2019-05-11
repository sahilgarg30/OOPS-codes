import java.util.Scanner;

class Matrix{
	static void symmetric(int a[][]){
		int n = a.length;
		for(int i=0;i<n;i++){
			if(a[i].length !=n){
				System.out.print("Not Symmetric.\n");
				return;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]!=a[j][i]){
				System.out.print("Not Symmetric.\n");
				return;
				}
			}
		}
		System.out.print("Is Symmetric.\n");	
	}
	static void add(int a[][],int b[][]){
		int n1 = a.length;
		int n2 = b.length;
		if(n1!=n2) 
			{
				System.out.print("Cant be added.\n");
				return;
			}
		for(int i=0;i<n1;i++){
			if(a[i].length !=b[i].length){
				System.out.print("Cant be added.\n");
				return;
			}
		}
		int c[][] = new int[n1][];
		for(int i=0;i<n1;i++){
				c[i] = new int[a[i].length];
			}
		System.out.print("\nThe sum of matrices is - \n");
		for(int i=0;i<n1;i++){
			for(int j=0;j<a[i].length;j++){
					c[i][j] = a[i][j]+b[i][j];
				}
			}
		for(int i=0;i<n1;i++){
			for(int j=0;j<a[i].length;j++){
					System.out.print(c[i][j] +"\t");
				}
			System.out.print("\n");
		}	
	}

	static void islowerTriangle(int a[][]){
		int n = a.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]!=0 && j>i){
					System.out.println("Not lower triangular.");
					return;
				}
			}
		}
		System.out.println("Is lower triangular.");	
	}

	static void traceNorm(int a[][]){
		int trace=0;double norm =0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(i==j)				
				trace+=a[i][j];
				norm += a[i][j]*a[i][j];
			}
		}
		norm = Math.sqrt(norm);
		System.out.println("The trace is "+ trace+" and norm is " + norm + ".");		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no of rows in matrix - ");
		int n = sc.nextInt();
		System.out.println("Please enter no of Columns in matrix - ");
		int r = sc.nextInt();
		int a[][] = new int[n][r];
		System.out.println("Please enter all the numbers of matrix - ");
		for(int i=0;i<n;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] =sc.nextInt();
			}
		}

		symmetric(a);
		islowerTriangle(a);
		traceNorm(a);

		System.out.println("Please enter no of rows in matrix2 - ");
		int n2 = sc.nextInt();
		System.out.println("Please enter no of Columns in matrix2 - ");
		int r2 = sc.nextInt();
		int b[][] = new int[n2][r2];
		System.out.println("Please enter all the numbers of matrix2 - ");
		for(int i=0;i<n2;i++){
			for(int j=0;j<b[i].length;j++){
				b[i][j] =sc.nextInt();
			}
		}
		add(a,b);
	}
}
