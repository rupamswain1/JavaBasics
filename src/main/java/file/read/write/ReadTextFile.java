package file.read.write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadTextFile {

	public String readFile(String path) throws IOException
	{
		FileReader fFead=new FileReader(path);
		BufferedReader read=new BufferedReader(fFead);
		String tempStr;
		String allData="";
		while((tempStr=read.readLine())!= null)
		{
			System.out.println(tempStr);
			allData+=tempStr;
		}
		
		fFead.close();
		return allData;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data=new ReadTextFile().readFile("C:\\Users\\RUPAM\\Desktop\\write.txt");
		List<String> dt=Arrays.asList(data.split(" "));
		System.out.println(dt.size());
	}

}
