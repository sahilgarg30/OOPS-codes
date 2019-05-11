import java.io.*;
class PrintDirectory{
	static void rList(String dirName){
		File file = new File(dirName);
		if(file.isDirectory()){
			System.out.println(file.getName());
			String paths[] = file.list();
			for(int i=0;i<paths.length;i++){
				rList(dirName+"/"+paths[i]);
			}
		}
		else if(file.isFile())
			System.out.println(file.getName());
	}
	
	public static void main(String args[]){
		String dirName = "/home/student/sahil_160905058/week6";
		rList(dirName);
		System.out.println("End.");
	}
}
