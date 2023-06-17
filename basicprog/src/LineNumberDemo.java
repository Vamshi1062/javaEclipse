import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberDemo {

	public static void main(String[] args) {
		String s;
		try {
			FileReader reader=new FileReader("names.txt");
			BufferedReader br=new BufferedReader(reader);
			LineNumberReader lr=new LineNumberReader(br);
			while((s=lr.readLine())!=null) {
				System.out.println(lr.getLineNumber()+" "+s);
			}
			lr.close();
			br.close();
			reader.close();
		}
catch(IOException e) {
	e.printStackTrace();
}
	}

}
