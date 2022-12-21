package Quize02;
import java.io.*;
public class J2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\CJCU-User\\eclipse-workspace\\01\\src\\Quize02\\rand.txt");
		BufferedWriter buf=new BufferedWriter(fw);
		int num;
		for (int i=1;i<=1000;i++) {
			num=(int)(Math.random()*100000);
			buf.write(Integer.toString(num));
			buf.newLine();
		}
		buf.flush();
		buf.close();
		fw.close();
	}

}
