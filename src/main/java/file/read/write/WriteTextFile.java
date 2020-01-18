package file.read.write;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class WriteTextFile {

	static String sourceFile="C:\\Users\\RUPAM\\Desktop\\write.txt";
	public void write400(String filePath) throws IOException
	{
		FileWriter wrt=new FileWriter(filePath,false);
		for(int i=1;i<401;i++)
		{
			wrt.write("$word"+i+" ");
		}
		
		wrt.close();
		
	}
	public void Customwrite(String path,String data) throws IOException
	{
		FileWriter wrt=new FileWriter(path,false);
		
			wrt.write(data);
		
		wrt.close();
		
	}
	public static void main(String[] args) throws IOException
	{
		new WriteTextFile().write400(sourceFile);
		
	}
}
