package CoreJava;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		FileWriter outputFile = null;
		String corbaObjectDumpDir = "C:\\Tasks\\Samsung_Import\\";
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMHHmm");
		//Date date = new Date();
		String dateStr = dateFormat.format(new Date());
		String fileName = corbaObjectDumpDir + "Test_"+dateStr+"_ProductionOrders.txt";
		System.out.println(fileName);
		String strComma = ",";
		String str = "1"+strComma+"2"+strComma
						+"3"+strComma+
							"4" +strComma+
							"5";

			outputFile = new FileWriter(fileName);
			outputFile.write(str + "\n");
			outputFile.write(str + "\n");
			outputFile.flush();

		outputFile.close();
	}
}
