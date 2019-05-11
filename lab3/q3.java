import java.util.Scanner;

class Mixer{
	int n;
	int arr[];
	
	void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of values in array - ");
		n = sc.nextInt();
		arr=new int[n];
		System.out.println("Enter elements of array - ");
		for(int i=0;i<n;)
		{
			int a1 = sc.nextInt();
			if((i>0 && arr[i-1]<a1)||i==0){
				arr[i]=a1;
				i++;			
			}
			 	
			else System.out.println("Please enter values in ascending order.");				
		}
	}
	void display(){
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");	
	}
	Mixer mix(Mixer A){
		int n1 = this.n;
		int n2 = A.n;
		int k=0,j=0;
		int i;
		Mixer c = new Mixer();
		c.n=n1+n2;
		c.arr = new int[c.n];
		for(i=0;k<n1 && j<n2;i++){
			if(arr[k]==A.arr[j]){
			c.arr[i] = arr[k++];
			j++;
			c.n--;
			}
			else if(arr[k]<A.arr[j])			
  			c.arr[i] = arr[k++];
			else
			c.arr[i] = A.arr[j++];		
		}
		while(k<n1) c.arr[i++]=arr[k++];
		while(j<n2) c.arr[i++]=A.arr[j++];
		return c;
	}
	public static void main(String args[]){
		Mixer m1 = new Mixer();
		m1.accept();
		Mixer m2 = new Mixer();
		m2.accept();
		Mixer m3 = m1.mix(m2);
		System.out.println("The mix of the arrays is - ");
		m3.display();			
	}
}
	
