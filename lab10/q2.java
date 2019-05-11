import java.io.*;
class CountFile{
	
	public static void main(String args[]) throws IOException{
	FileReader in = null;
	int ccount=0,wcount=0,lcount=0,ncount=0;
	try{
		in = new FileReader("/home/student/sahil_160905058/week10/fileNames.txt");
		int ch;
		int check=0;
		while((ch=in.read()) != -1){
			
			while(ch>='0' && ch<='9' && ch!=-1){check=1;ch=in.read();}
			if(check==1)
			ncount++;
			if(ch==' ')
			wcount++;
			else if(ch=='\n'){
				wcount++;lcount++;
			}
			else if(check==0)
			ccount++;
			check=0;
		}
	}
	catch(Exception e){}
	finally{
		if(in!=null) in.close();
	}
	System.out.println("Char : " +ccount+"  \nWord : "+wcount+"  \nLine : "+lcount+"  \nNumber : "+ncount);
}
}
