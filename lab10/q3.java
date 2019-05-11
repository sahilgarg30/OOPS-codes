import java.io.*;
class Line{
	public static void main(String args[]){
		try{
			String stringSearch = "Hello";
			BufferedReader bf = new BufferedReader(new FileReader("/home/student/sahil_160905058/week10/fileNames.txt"));
			int lc=0;
			String line;
			System.out.println("Searching for "+stringSearch+" in file :");
			while((line = bf.readLine())!=null){
				lc++;
				int indexFound = line.indexOf(stringSearch);
				if(indexFound>-1){
					System.out.println(line);
					System.out.println("Found at pos : "+(indexFound+1)+" on Line : " + lc);
				}
			}
			bf.close();
		}
		catch(IOException e){	
		}
	}
}
